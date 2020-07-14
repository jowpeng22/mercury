package com.joemaster.blogservice.service;

import com.joemaster.blogservice.client.UserServiceClient;
import com.joemaster.blogservice.dto.BlogDetailDTO;
import com.joemaster.blogservice.dto.RespDTO;
import com.joemaster.blogservice.entity.Blog;
import com.joemaster.blogservice.entity.User;
import com.joemaster.blogservice.exceptioin.CommonException;
import com.joemaster.blogservice.exceptioin.ErrorCode;
import com.joemaster.blogservice.repository.BlogRepository;
import com.joemaster.blogservice.util.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by pengzq on 2020-7-14
 */
@Service
public class BlogService {

    @Autowired
    private BlogRepository blogRepository;
    @Autowired
    private UserServiceClient userServiceClient;

    public Blog saveBlog(Blog blog) {
        return blogRepository.save(blog);
    }

    public List<Blog> findBlogs(String username) {
        return blogRepository.findByUsername(username);
    }

    public BlogDetailDTO findBlogDetail(Long id){
        Blog blog = blogRepository.findOne(id);
        if (null == blog) {
            throw new CommonException(ErrorCode.BLOG_IS_NOT_EXIST);
        }
        RespDTO<User> respDTO = userServiceClient.getUser(UserUtils.getCurrentToken(), blog.getUsername());
        if (respDTO==null) {
            throw new CommonException(ErrorCode.RPC_ERROR);
        }
        BlogDetailDTO blogDetailDTO = new BlogDetailDTO();
        blogDetailDTO.setBlog(blog);
        blogDetailDTO.setUser(respDTO.data);
        return blogDetailDTO;
    }
}
