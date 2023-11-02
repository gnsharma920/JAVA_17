package com.java.sorting;

import java.util.Comparator;
import java.util.TreeSet;

public class WildCard implements Comparable<WildCard> , Comparator<WildCard> {
    private int num;
    private String text;

    public WildCard(int num, String text) {
        this.num = num;
        this.text = text;
    }

    @Override
    public String toString() {
        return "" + num;
    }

    @Override
    public int compareTo(WildCard o) {
        return text.compareTo(o.text);
    }

    @Override
    public int compare(WildCard o1, WildCard o2) {
        return o1.num - o2.num;
    }

    public static void main(String[] args) {
        var s1= new WildCard(88, "a");
        var s2= new WildCard(55, "b");
        var t1 =new TreeSet<WildCard>();
        t1.add(s1);
        t1.add(s2);

        var t2 =new TreeSet<WildCard>(s1);
        t2.add(s1);
        t2.add(s2);

        System.out.println(t1+"       "+t2);
    }
}
