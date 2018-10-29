package chapter1.chapter1_4;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class TwoSumFaster {
    public static int count(int[] a) {
        Arrays.sort(a);
        int N = a.length;
        int cnt = 0;

        for(int i = 0,j = N - 1;i < j;){
            if(-a[i] < a[j]){
                j--;
            } else if(-a[i] > a[j]){
                i++;
            }else {
                cnt++;
                i++;
                j--;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] a = In.readInts(args[0]);
        StdOut.println(count(a));
    }
}
