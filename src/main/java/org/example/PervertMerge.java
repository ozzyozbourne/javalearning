package org.example;
public class PervertMerge {
    public static void main( String[] args )
    {
        int [] arr = { 12, 11, 13, 5, 6, 7, 78, 0, 4, 35, 99, 17, 0, 1, 1 , 2 };
        System.out.println("Given Array");
        printArray(arr);
        sort(arr, 0, arr.length - 1);
        printArray(arr);
    }

    static void merge(int [] arr, int l, int m, int r)
    {
        int n1 = m - l;
        int n2 = r - m + 1;
        int [] L = new int[n1];
        int [] R = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void  sort(int [] arr, int l, int r)
    {
        if (l < r) {
            int m =r- (r-l)/2;
            sort(arr, m , r);
            sort(arr, l, m-1);
            merge(arr, l, m, r);
        }
    }

    static void printArray(int[] arr)
    {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
}