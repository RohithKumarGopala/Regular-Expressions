package com.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastName {
        public void lastName(){
            Pattern p = Pattern.compile("[A-Za-z]{3,}\\s{1}[A-Za-z]{3,}");
            Matcher m = p.matcher("Rohith Kumar");
            boolean b = m.matches();
            System.out.println(b);
        }

        public static void main(String[] args) {
            LastName lastNameobj = new LastName();
            lastNameobj.lastName();

        }
    }

