package sw.day08.demo01;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] ns = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
        int[] ms = {1,5,13, 6, 7, 3, 5};
        System.out.println(Arrays.toString(ns));
        for (int i=0; i<ns.length - 1; i++)
        {
            for (int j = 0; j < ns.length - i - 1; j++){
                if (ns[j] > ns[j+1]){
                    int tmp = ns[j];
                    ns[j] = ns[j+1];
                    ns[j+1] = tmp;
                }
            }
        }
        Arrays.sort(ms);
        System.out.println(Arrays.toString(ns));
        System.out.println(Arrays.toString(ms));
    }
}
