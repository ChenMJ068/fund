package com.fund.platform.utils.security;

import com.fund.platform.utils.StringConstantPool;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * create class Md5Util.java @version 1.0.0 by @author ChenMJ @date 2021-09-16 16:18:00
 */
public class Md5Util {
    /**
     * md5加密的方法
     * @param plainText 代加密字符串
     * @return 加密后的字符串
     */
    public static String encryptionByMd5(String plainText) {
        //定义一个字节数组
        byte[] secretBytes = null;
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance(StringConstantPool.CONSTANT_MD5);
            //对字符串进行加密
            md.update(plainText.getBytes(StandardCharsets.UTF_8));
            //获得加密后的数据
            secretBytes = md.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("没有md5这个算法！");
        }
        //将加密后的数据转换为16进制数字
        StringBuilder md5code = new StringBuilder(new BigInteger(1, secretBytes).toString(16));
        // 如果生成数字未满32位，需要前面补0
        for (int i = 0; i < 32 - md5code.length(); i++) {
            md5code.append(StringConstantPool.CONSTANT_NUMBER_0).append(md5code);
        }
        return md5code.toString();
    }
}
