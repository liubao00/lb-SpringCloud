package org.javauncle.eureka_admin;

import org.javauncle.eureka_admin.util.PasswordUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TextController {
    public static void main(String[] args) {
        for (int i=0;i<3;i++) {

            String aa = "111111";

            String md5 = PasswordUtils.encode( aa, "MD5");
            System.out.println(md5 + "************MD5加密后的密码");

            BCryptPasswordEncoder bc = new BCryptPasswordEncoder(10);

            String encode = bc.encode(aa);
//            System.out.println(encode + "自带加密后的密码");
        }
    }
}
