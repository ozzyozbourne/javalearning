package org.example.mergetree;

public class ExtremeLeft {

    public static void main(String[] args) {

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
