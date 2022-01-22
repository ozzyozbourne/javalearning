package org.example.mergetree;

public class ExtremeLeft {

    public static void main(String[] args) {
        int [] arr = { 12, 11, 13, 5, 6, 7 };
        sort( 0, arr.length - 1);

    }

    static void  sort( int l, int r)
    {
        if (l < r) {
            int m =l+ (r-l)/2;

            sort(l, m);
            sort(m + 1, r);

        }
    }

}
