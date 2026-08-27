package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    public static void main(String[] args) {
        System.out.println( isPalindrome(-1221));
        System.out.println( isPalindrome(707));
        System.out.println(isPalindrome(11212));

        System.out.println( isPerfectNumber(6));
        System.out.println( isPerfectNumber(28));
        System.out.println( isPerfectNumber(5));
        System.out.println( isPerfectNumber(-1));


    }

    public static boolean isPalindrome(int a) {
        String str = Integer.toString(a);
        if(str.contains("-")) str= str.replace("-", "");
        boolean isPalindrome= true;
        int start=0;
        int end= str.length()-1;
        while(end>start && isPalindrome){
            if(str.charAt(end)==str.charAt(start)) {
                start ++;
                end --;
            }
            else {
                isPalindrome= false;
            }}
        
        return isPalindrome;
    }   


    public static boolean isPerfectNumber(int a){
        if(a<=0) return false;
        int sum=0;
        for (int i = a-1; i > 0; i--) {
            if(a%i==0) sum+=i;
        }
        return sum==a;
    }

    
    public static String numberToWords(int a){
        if(a<0) return "Invalid Value";
        String words="";
        String [] nums = Integer.toString(a).split("");
        for (String num : nums){
            switch(num){
                case "0": words += "Zero ";
                break;
                case "1": words += "One ";
                                break;

                case "2": words += "Two ";
                                break;

                case "3": words += "Three ";
                                break;

                case "4": words += "Four ";
                                break;

                case "5": words += "Five ";
                                break;

                case "6": words += "Six ";
                                break;

                case "7": words += "Seven ";
                                break;

                case "8": words += "Eight ";
                                break;

                case "9": words += "Nine ";
                                break;

            }
        }
        return words.trim();
    }


}
