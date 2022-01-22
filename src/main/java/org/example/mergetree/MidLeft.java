package org.example.mergetree;

public class MidLeft {

    public static void main(String[] args) {
        int [] arr = { 12, 11, 13, 5, 6, 7 };
        sort( 0, arr.length - 1);
    }

    static void  sort( int l, int r)
    {
        if (l < r) {
            int m =l+ (r-l)/2;

            sort(m + 1, r);
            sort(l, m);

        }
    }

}
