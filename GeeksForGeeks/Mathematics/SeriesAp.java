/**
 * URL: https://practice.geeksforgeeks.org/problems/series-ap/0
 *
 * Given the first 2 terms of Arithmetic Series tell the nth term of the series.
 *
 * Input:
 * First line contains an integer, the number of test cases 'T'. Each test case in its first line should contain two positive integer a and b(First 2 terms of AP). In the second line of every test case it contains of an integer N.
 *
 *
 * Output:
 * In each seperate line print the Nth term of the Arithmetic Progression.
 *
 *
 * Constraints:
 * 1<=T<=30
 * -100<=a<=100
 * -100<=b<=100
 * 1 <= N <= 100
 *
 *
 * Example:
 * Input:
 * 2
 * 2 3
 * 4
 * 1 2
 * 10
 *
 * Output:
 * 5
 * 10
 */

package GeeksForGeeks.Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeriesAp
{
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int T = Integer.parseInt(reader.readLine());
            while(T-- > 0) {
                String[] series = reader.readLine().split("\\s");
                int N = Integer.parseInt(reader.readLine());
                printNthTermOfAp(Integer.parseInt(series[0]), Integer.parseInt(series[1]), N);
            }
        } catch (IOException e) {

        }
    }

    static void printNthTermOfAp(int a, int b, int n) {
        int apOfNthTerm = a + ((n - 1) * (b - a));
        System.out.println(apOfNthTerm);
    }
}
