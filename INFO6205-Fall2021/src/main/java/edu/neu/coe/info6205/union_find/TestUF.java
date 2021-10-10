package edu.neu.coe.info6205.union_find;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class TestUF {



    public static void main(String[] args) {

        for (int i = 20; i < 81921; i=i*2) {
            System.out.println(count(i));
        }







    }

    public static int count(int n){
        UF_HWQUPC uf = new UF_HWQUPC(n);

        int res = 0;
        while(uf.components()>1){
            int i =(int)(Math.random()*n);
            int j =(int)(Math.random()*n);
            if(uf.connected(i,j)){

            }else {
                uf.union(i,j);

            }
            res++;
        }
        return res;
    }

}
