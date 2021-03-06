package com.joemaster.blogservice.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by pengzq on 2020/07/13.
 */
public class BPwdEncoderUtils {

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    /**
     * 用BCryptPasswordEncoder
     * @param password
     * @return
     */
    public static String  BCryptPassword(String password){
        return encoder.encode(password);
    }

    /**
     *
     * @param rawPassword 原始密码
     * @param encodedPassword 加密后的密码
     * @return
     */
    public static boolean matches(CharSequence rawPassword, String encodedPassword){
        return encoder.matches(rawPassword,encodedPassword);
    }

}
