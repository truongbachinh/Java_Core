package com.exerceise;

import com.sun.javaws.IconUtil;

import java.util.ArrayList;
import java.util.List;

public class UocSo {
    public static void timUocSo(int number)
    {

        int uocSo = 1;
        int count = 0;
        System.out.println("Các ước số là");

        for(; uocSo <= number; uocSo++)
        {
            if( number % uocSo == 0 & uocSo != number)
            {
                count++;
                System.out.println(uocSo);
            }

        }
        System.out.println("Có " + count + " ước số");


    }
}
