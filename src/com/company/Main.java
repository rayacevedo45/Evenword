package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isEven("lliinnne"));
    }
    public static boolean isEven(String string) {
        int orig = string.length();
        int repl = string.replaceAll("" + 'a', "").length();
        int orig1 = string.length();
        int repl1 = string.replaceAll("" + 'b', "").length();
        int orig2 = string.length();
        int repl2 = string.replaceAll("" + 'c', "").length();
        int orig3 = string.length();
        int repl3 = string.replaceAll("" + 'd', "").length();
        int orig4 = string.length();
        int repl4 = string.replaceAll("" + 'e', "").length();
        int orig5 = string.length();
        int repl5 = string.replaceAll("" + 'f', "").length();
        int orig6 = string.length();
        int repl6 = string.replaceAll("" + 'g', "").length();
        int orig7 = string.length();
        int repl7 = string.replaceAll("" + 'h', "").length();
        int orig8 = string.length();
        int repl8 = string.replaceAll("" + 'i', "").length();
        int orig9 = string.length();
        int repl9 = string.replaceAll("" + 'j', "").length();
        int orig10 = string.length();
        int repl10 = string.replaceAll("" + 'k', "").length();
        int orig26 = string.length();
        int repl26 = string.replaceAll("" + 'l', "").length();
        int orig11 = string.length();
        int repl11 = string.replaceAll("" + 'm', "").length();
        int orig12 = string.length();
        int repl12= string.replaceAll("" + 'n', "").length();
        int orig13 = string.length();
        int repl13 = string.replaceAll("" + 'o', "").length();
        int orig14 = string.length();
        int repl14 = string.replaceAll("" + 'p', "").length();
        int orig15 = string.length();
        int repl15 = string.replaceAll("" + 'q', "").length();
        int orig25 = string.length();
        int repl25 = string.replaceAll("" + 'r', "").length();
        int orig16 = string.length();
        int repl16 = string.replaceAll("" + 's', "").length();
        int orig17= string.length();
        int repl17 = string.replaceAll("" + 't', "").length();
        int orig18 = string.length();
        int repl18 = string.replaceAll("" + 'u', "").length();
        int orig19 = string.length();
        int repl19 = string.replaceAll("" + 'v', "").length();
        int orig20 = string.length();
        int repl20 = string.replaceAll("" + 'w', "").length();
        int orig21 = string.length();
        int repl21 = string.replaceAll("" + 'x', "").length();
        int orig22 = string.length();
        int repl22 = string.replaceAll("" + 'y', "").length();
        int orig23 = string.length();
        int repl23 = string.replaceAll("" + 'z', "").length();
        int orig24 = string.length();
        int repl24 = string.replaceAll("" + 'z', "").length();

        int origsum = orig+orig1+orig2+orig3+orig4+orig5+orig6+orig7+orig8+orig9+orig10+orig11+orig12+orig13+orig14+orig15+orig16+orig17+orig18+orig19+orig20+orig21+orig22+orig23+orig24+orig25+orig26;
        int replsum = repl+repl1+repl2+repl3+repl4+repl5+repl6+repl7+repl8+repl9+repl10+repl11+repl12+repl13+repl14+repl15+repl16+repl17+repl18+repl19+repl20+repl21+repl22+repl23+repl24+repl25+repl26;
        int dif = origsum - replsum;

        if((dif%2)==0)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
