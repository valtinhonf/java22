package br.com.maisshopp;


import static java.lang.StringTemplate.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing JAVA 22");
        String_Templates("Valter", "Beatriz");
    }

    public static void String_Templates(String word1, String word2){
        String sFinal = STR."\{word1} and \{word2}";
        System.out.println(sFinal);

        //calling a function in to String Template
        System.out.println(STR."Together we have \{sum(36, 30)} years old");

        //Testing RAW
        StringTemplate stringTemplate = RAW."\{word1} and \{word2}";
        System.out.println(stringTemplate.toString());
    }

    public static int sum(int num1, int num2){
        return num1 + num2;
    }
}