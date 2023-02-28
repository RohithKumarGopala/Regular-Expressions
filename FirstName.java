package com.regularExpressions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstName {
    public void firstName(){
        Pattern p = Pattern.compile("[A-Za-z]{3,}");
        Matcher m = p.matcher("Rohith");
        boolean b = m.matches();
        System.out.println(b);
    }

    public static void main(String[] args) {
        FirstName firstnameobj = new FirstName();
        firstnameobj.firstName();

    }
}
