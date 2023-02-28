package com.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserEmail {


        public void emailAddressOfUser(){
            Pattern p = Pattern.compile("[a-c]{3}[.][x-z]{3}[@][a-z]{2}[.][a-z]{2}[.][a-z]{2}");
            Matcher m = p.matcher("abc.xyz@bl.co.in");
            boolean b = m.matches();
            System.out.println(b);
        }

        public static void main(String[] args) {
          UserEmail useremailobj = new UserEmail();
          useremailobj.emailAddressOfUser();
        }
    }


