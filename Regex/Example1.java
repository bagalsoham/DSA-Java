package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
    public static void main(String[] args) {
        String regex ="a";
        Pattern pat = Pattern.compile("a*b*");//compile the regex
        Matcher match = pat.matcher("aaaabbbbbbbbbbbbbb");
        boolean matches = match.matches();
        System.out.println("Result "+ matches);

    }
}
