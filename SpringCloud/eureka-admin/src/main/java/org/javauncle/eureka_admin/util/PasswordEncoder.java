package org.javauncle.eureka_admin.util;

import java.security.MessageDigest;

/**
 * 密码加密工具
 * @Author liubao
 * @Date 2020/5/29
 */
public class PasswordEncoder {

    private final static String[] hexDigits = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d",
            "e", "f" };

    private final static String MD5 = "MD5";
    private final static String SHA = "SHA";

    private Object salt;
    private String algorithm;

    public PasswordEncoder(Object salt) {
        this(salt, MD5);
    }

    public PasswordEncoder(Object salt, String algorithm) {
        this.salt = salt;
        this.algorithm = algorithm;
    }

    /**
     * 密码加密（将明文加密成密文）
     * @param rawPass 明文
     * @return
     */
    public String encode(String rawPass) {
        String result = null;
        try {
            MessageDigest md = MessageDigest.getInstance(algorithm);
            // 加密后的字符串
            result = byteArrayToHexString(md.digest(mergePasswordAndSalt(rawPass).getBytes("utf-8")));
        }catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 密码配置规则（将数据库的密文与明文加密后的密文进行比较）
     * @param encPass 数据库存储的密文
     * @param rawPass 明文
     * @return
     */
    public boolean matches(String encPass, String rawPass){
        String pass1 = "" +encPass;
        String pass2 = encode(rawPass);
        return pass1.equals(pass2);
    }

    /**
     *  密码加盐
     * @param password
     * @return
     */
    private String mergePasswordAndSalt(String password) {
        if (password == null) {
            password = "";
        }

        if ((salt == null) || "".equals(salt)) {
            return password;
        } else {
            return password + "{" + salt.toString() + "}";
        }
    }

    /**
     * 转换字节数组为16进制字串
     *
     * @param b
     *            字节数组
     * @return 16进制字串
     */
    private String byteArrayToHexString(byte[] b) {
        StringBuffer resultSb = new StringBuffer();
        for (int i = 0; i < b.length; i++) {
            resultSb.append(byteToHexString(b[i]));
        }
        return resultSb.toString();
    }

    /**
     * 将字节转化为16进制
     * @param b
     * @return
     */
    private static String byteToHexString(byte b) {
        int i = b;
        if(i<0)
            i =256 + i;
        int d1 = i /16;
        int d2 = i % 16;
        return hexDigits[d1] + hexDigits[d2];
    }


}
