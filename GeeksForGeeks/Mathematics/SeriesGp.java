/**
 * URL: https://practice.geeksforgeeks.org/problems/series-gp/0
 *
 * Given the first 2 terms of Geometric Series tell the nth term of the series. Ex. floor(2.3) =2 and floor(-2.3) = -3.
 *
 * Input:
 * First line contains an integer, the number of test cases 'T'. Each test case in its first line should contain two positive integer a and b (First 2 terms of GP). In the second line of every test case it contains of an integer N.
 *
 *
 * Output:
 * In each seperate line print the Nth term of the Geometric Progression. Print the floor of the answer.
 *
 *
 * Constraints:
 * 1<=T<=30
 * -100<=a<=100
 * -100<=b<=100
 * 1 <= N <= 5
 *
 *
 * Example:
 * Input:
 * 2
 * 2 3
 * 1
 * 1 2
 * 2
 *
 * Output:
 * 2
 * 2
 */

package GeeksForGeeks.Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeriesGp
{
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int T = Integer.parseInt(reader.readLine());
            while(T-- > 0) {
                String[] series = reader.readLine().split("\\s");
                int N = Integer.parseInt(reader.readLine());
                printNthTermOfGp(Integer.parseInt(series[0]), Integer.parseInt(series[1]), N);
            }
        } catch (IOException e) {

        }
    }

    static void printNthTermOfGp(double a, double b, double n) {
        int gpOfNthTerm = (int) a;

        if(n != 1){
            gpOfNthTerm = (int) Math.floor(a * Math.pow(b/a, n - 1));
        }

        System.out.println(b/a + " == " + Math.pow(b/a, n - 1) + " == " + gpOfNthTerm);
    }
}
