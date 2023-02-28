package com.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserPassword {
    public void userPassword(){
        Pattern p = Pattern.compile("[A-Z]{1}[a-z]{6}[@][0-9]{1}");
        Matcher m = p.matcher("Vabcdef@1");
        boolean b = m.matches();
        System.out.println(b);

    }

    public static void main(String[] args) {
        UserPassword userpasswordobj = new UserPassword();
        userpasswordobj.userPassword();
    }
}

