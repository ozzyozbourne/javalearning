package org.example.slidingwindows;

public class First {

    public static void main(String[] args) {
        double [] result  = findAverages(5, new int []{1, 3, 2, 6, -1, 4, 1, 8, 2});
        for(var a : result) System.out.println(a);
    }

    public static double[] findAverages(int k, int [] arr){

        double[] result  = new double[k];
        for(int i  = 0; i<k; i++){
            double sum  = 0;
            for (int j  = i; j < i + k;j++){
                sum +=arr[j];
            }
            result[i] = sum/k;
        }
        return result;
    }
}
