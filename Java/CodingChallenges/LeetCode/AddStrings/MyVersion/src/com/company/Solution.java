// Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

// Note:

// The length of both num1 and num2 is < 5100.
// Both num1 and num2 contains only digits 0-9.
// Both num1 and num2 does not contain any leading zero.
// You must not use any built-in BigInteger library or convert the inputs to integer directly.

package com.company;

class Solution {
    public String addStrings(String num1, String num2) {
        // We know num1 = 12345 and num2 = 67890

        int length1 = num1.length();
        int length2 = num2.length();
        // int length1 = 7;
        // int length2 = 6;

        // which is longer?
        int maxLength = Math.max(length1,length2);
        // System.out.println(maxLength);

        int[] intarr1 = new int[length1];
        int[] intarr2 = new int[length2];
        int[] intarr3 = new int[maxLength];
        int[] intarr4 = new int[maxLength];   

        // System.out.println(Character.getNumericValue(num1.charAt(0)));
        // System.out.println(Character.getNumericValue(num2.charAt(0)));
        // System.out.println(Character.getNumericValue(num1.charAt(0))+Character.getNumericValue(num1.charAt(0)));
        // +Character.getNumericValue(3);

        // Let's try adding two arrays.
        // Let's try adding two integers
        int a = Character.getNumericValue(num1.charAt(0));
        int b = Character.getNumericValue(num1.charAt(1));
        int c = Character.getNumericValue(num1.charAt(2));
        int d = Character.getNumericValue(num1.charAt(3));
        int e = Character.getNumericValue(num1.charAt(4));

        int f = Character.getNumericValue(num2.charAt(0));
        int g = Character.getNumericValue(num2.charAt(1));
        int h = Character.getNumericValue(num2.charAt(2));
        int i = Character.getNumericValue(num2.charAt(3));
        int j = Character.getNumericValue(num2.charAt(4));
        
        intarr1[0]=a;
        intarr1[1]=b;
        intarr1[2]=c;
        intarr1[3]=d;
        intarr1[4]=e;
        
        intarr2[0]=f;
        intarr2[1]=g;
        intarr2[2]=h;
        intarr2[3]=i;
        intarr2[4]=j;
        
        intarr3[0] = a +f;
        intarr3[1] = intarr1[1]+intarr2[1];


        // System.out.println(intarr1[0]+intarr2[0]);
        // System.out.println(intarr3[0]);
        // System.out.println(intarr3[1]);

        intarr4[0] = Character.getNumericValue(num1.charAt(0)) + Character.getNumericValue(num2.charAt(0));
        intarr4[1] = Character.getNumericValue(num1.charAt(1)) + Character.getNumericValue(num2.charAt(1));
        intarr4[2] = Character.getNumericValue(num1.charAt(2)) + Character.getNumericValue(num2.charAt(2));
        intarr4[3] = Character.getNumericValue(num1.charAt(3)) + Character.getNumericValue(num2.charAt(3));
        intarr4[4] = Character.getNumericValue(num1.charAt(4)) + Character.getNumericValue(num2.charAt(4));

        // System.out.println(intarr4[0]);
        // System.out.println(intarr4[1]);
        // System.out.println(intarr4[2]);
        // System.out.println(intarr4[3]);
        // System.out.println(intarr4[4]);

        for (int index = 0; index < length1; index++) {
            // System.out.println("Hello");
            intarr4[index] = Character.getNumericValue(num1.charAt(index)) + Character.getNumericValue(num2.charAt(index));
        //     System.out.println(intarr4[index]);
        }


        System.out.println(intarr4[0]);
        System.out.println(intarr4[1]);
        System.out.println(intarr4[2]);
        System.out.println(intarr4[3]);
        System.out.println(intarr4[4]);

        // int number1 = Character.getNumericValue(num1.charAt(2));
        // System.out.println("number1");
        // System.out.println(number1);

        return "Sum";
    }
}