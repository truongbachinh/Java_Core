package com.exerceise;

public class HinhChuNhat {
    public static int chieuCao;
    public static int chieuRong;
    public static void hinhChuNhat(int chieuCao, int chieuRong)
    {
        for(int i = 0; i < chieuCao ; i++)
        {
          for( int j =0; j < chieuRong; j++)
          {
              System.out.print("* ");
          }
            System.out.println();
        }
    }
    public void hinhChuNhatRong(int chieuCao, int chieuRong){

        for (int i = 1; i <= chieuCao; i++)
        {

            for (int k =  1; k <= chieuRong; k++)
            {
                if(i == 1 | i == chieuCao)
                {
                    System.out.print("* ");
                }
                else if (k == 1 || k == chieuRong)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }


            System.out.println();

        }
    }
}
