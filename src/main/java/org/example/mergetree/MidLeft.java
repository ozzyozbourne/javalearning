package org.example.mergetree;

public class MidLeft {

    public static void main(String[] args) {

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
