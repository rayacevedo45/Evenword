package com.company;

public class Main
{

    public static void main(String[] args)
    {
        // I like that you have a lot of tests!
        System.out.println(isEven("aabbccdd"));
        System.out.println(isEven("abcdabcd"));
        System.out.println(isEven("llooll"));


        System.out.println(isEven("lline"));
        System.out.println(isEven("line"));
        System.out.println(isEven("llline"));
        System.out.println(isEven("lline"));
        System.out.println(isEven("llinne"));

    }
    // these comments are hard to follow, I would do string = "a" or first = "a" at every step instead of a or "" alone or remove them altogether
    // string = "a"
    public static boolean isEven(String string)
    {
        if(string.length() == 0)
        {
            return true;
        }

        char first = string.charAt(0); // a
        string = string.substring(1); // ""

        if(string.contains(first + ""))
        {
            string = string.replaceFirst(first + "", ""); //a
            return isEven(string); // isEven(a);
        }
        return false;
    }
    // clean and concise code, good job
}
