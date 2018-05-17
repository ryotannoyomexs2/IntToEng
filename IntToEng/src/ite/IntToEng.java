package ite;

import java.util.Scanner;



public class IntToEng {

public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();



        System.out.println(translateEng(input));



    }



    // 数値を英訳する変換するメソッド

    static String translateEng(int n) {

    String[] num1 = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"}; //1桁

    String[] num2 = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixtenn", "seventeen", "eighteen", "nineteen"}; //10代

    String[] num3 = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety","onehundred"}; //10で割り切れるum

    String num = "";

    if(n<9) return num1[n];

    if(10<n && n<20) return num2[n-10-1];

    if(n%10==0) return num3[n/10-1];

    else {

    num = num3[n/10-1] + num1[n%10];

    return num;

    }

    }

}