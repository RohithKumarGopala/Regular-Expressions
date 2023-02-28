package com.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public void phoneNumber(){
        Pattern p = Pattern.compile("[91]{2}\\s[0-9]{10}");
        Matcher m = p.matcher("91 9912827547");
        boolean b = m.matches();
        System.out.println(b);

    }

    public static void main(String[] args) {
        PhoneNumber phonenumberobj = new PhoneNumber();
        phonenumberobj.phoneNumber();
    }
}
