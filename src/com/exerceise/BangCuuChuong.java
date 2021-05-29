package com.exerceise;

public class BangCuuChuong {
    public static void inBangCuuChuong()
    {
        for(int i = 1; i <= 10; i++ )
        {
            for (int j = 1; j <= 10; j++)
            {
                System.out.print(j + " x " + i + " = " + (i*j) +"\t");
            }
            System.out.println();
        }
    }
}
