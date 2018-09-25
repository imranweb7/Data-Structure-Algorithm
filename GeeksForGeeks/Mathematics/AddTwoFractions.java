/**
 * URL: https://practice.geeksforgeeks.org/problems/add-two-fractions/1
 *
 * Your task is to complete the function addFraction which adds the two fractions and prints the resulting fraction.
 * The function takes four arguments num1, den1, num2, den2 where num1, num2 denotes the numerators of two fractions and den1, den2 denotes their denominators.
 *
 * Input:
 * The first line of input contains an integer T denoting the number of test cases . Then T test cases follow . Each test case contains four integers num1, den1, num2, den2 respectively .
 *
 * Output:
 * For each test case output will be the fraction in the form a/b where the fraction denotes the sum of the two given fractions in reduced form.
 *
 * Constraints:
 * 1<=T<=100
 * 1<=den1,den2,num1,num2<=1000
 *
 * Example:
 * Input
 * 1
 * 1 500 2 500
 *
 * Output
 * 3/500
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AddTwoFractions
{
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            int T = Integer.parseInt(reader.readLine());
            while(T-- > 0) {
                String[] arguments = reader.readLine().split("\\s");
                addFraction(Integer.parseInt(arguments[0]), Integer.parseInt(arguments[1]), Integer.parseInt(arguments[2]), Integer.parseInt(arguments[3]));
            }
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }

    static void addFraction(int num1, int den1, int num2, int den2) {
        int multiply;
        int lcm = getLcm(den1, den2);

        if(den1 != lcm) {
            multiply = lcm / den1;
            num1 = num1 * multiply;
        }

        if(den2 != lcm) {
            multiply = lcm / den2;
            num2 = num2 * multiply;
        }

        simplifyAndPrintAddition(num1 + num2, lcm);
    }

    static void simplifyAndPrintAddition(int num, int den) {
        int gcd = getGcd(num, den);

        if(gcd > 1){
            num = num / gcd;
            den = den / gcd;
            simplifyAndPrintAddition(num, den);
        }

        if(gcd == 1){
            System.out.println(num + "/" + den);
        }
    }

    static int getLcm(int a, int b) {
        return (a * b) / getGcd(a, b);
    }

    static int getGcd(int a, int b) {
        if(a == b) {
            return a;
        }

        if(a > b) {
            return getGcd(a - b, b);
        }

        return getGcd(a, b - a);
    }
}