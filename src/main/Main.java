package main;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;
import sun.security.mscapi.CPublicKey;

import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.InputMismatchException;

import java.io.File;
import java.util.Scanner;


import static arr_exerceise.MangDoiXung.checkMangDoiXung;
import static arr_exerceise.MangNgauNhien.inMangNgauNhien;
import static arr_exerceise.MangSoNguyenTo.viTriCuaSoNguyenTo;
import static arr_exerceise.SoLanXuatHienCuaPhanTuTrongMang.checkSoLanXuatHien;
import static arr_exerceise.XuatHienNhieuNhatTrongMang.inSoLanXuatHien;
import static com.exerceise.MangTangDan.inMangTangDan;
import static com.exerceise.SoNguyenTo.inSoNguyenTo;
import static com.exerceise.SoThuanNghic.inSoThuanNghic;
import static com.exerceise.SoThuanNghicSauChuSo.inSoThuanNghich;
import static com.exerceise.TongchuoiSo.tinhTongChuoiSo;
import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;
import static arr_exerceise.HaiMangSoNguyen.*;
import static com.exerceise.UocSo.timUocSo;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
        Scanner sc = new Scanner(System.in);
//        System.out.println("input a");
//        int a = sc.nextInt();
//        System.out.println("input b");
//        int b = sc.nextInt();
//      hinhChuNhat(a, b);
//      System.out.println();
//        HinhChuNhat hc = new HinhChuNhat();
//        hc.hinhChuNhatRong(a,b);
//        System.out.println("input chieu cao");
//        int chieuCao =  sc.nextInt();
//        inHinhTamGiac(chieuCao);
//
        // hinh tam giac so
//        HinhTamGiac hTG =  new HinhTamGiac();
//        hTG.inHinhTamGiacSo(chieuCao);

        // bảng cửu chương
//        inBangCuuChuong();

        // tìm số ngẫu nhiên
//        int soCanTim;
//        boolean checkNumber = false;
//        while (true)
//        {
//        try {
//            System.out.println("Nhap vao so cần tìm");
//             soCanTim = sc.nextInt();
//            if (soCanTim > 0 & soCanTim <= 100) {
//                checkNumber = true;
//                break;
//            }
//        } catch (Exception e) {
//            System.out.println("vui lòng nhập từ 0 -> 100");
//        }
//        }
//
//        if(checkNumber ==true)
//        {
//            randomNumber(soCanTim);
//        }
//

        //   tinh tuong
//        boolean tinhTongChan = false;
//        boolean tinhTongLe = false;
//        TinhTong tt = new TinhTong();
//            try {
//                System.out.println("Nhập tổng number cần tính: ");
//                int tongNumber = sc.nextInt();
//                tt.tinhTong(tongNumber);
//
//            } catch (InputMismatchException e) {
//                System.out.println("Vui lòng nhập số b ơi");
//            }


//  try {
//          readFile();
//
//    } catch (FileNotFoundException e) {
//        System.out.println("file not found");
//        throw e;
//    }
//
//    }
//    public static void readFile() throws FileNotFoundException {
//        File file = new File("./com.exerceise/Error.java");
//        Scanner sc = new Scanner(file);
//    }


        // tim uoc so
//        System.out.println("Vui lòng nhập ước số cần tìm");
//        int number = sc.nextInt();
//        timUocSo(number);

        //tinh tong chuoi so
//        System.out.println("Vui lòng nhập ước số cần tìm");
//        int number = sc.nextInt();
//        tinhTongChuoiSo(number);

        // Tìm n số nguyên tố

//        System.out.println("Bạn muốn tìm bao nhiêu số nguyên tố:");
//        int number = sc.nextInt();
//        int tong = 0;
//        int soTack;
//        while (number != 0) {
//            soTack =  number % 10;
//            System.out.println( soTack);
//            number = number / 10;
//            tong += soTack;
//        }
//        System.out.println("tong = " + tong);


//        inSoNguyenTo(number);

        //

        //   Số thuận nghịc
//
//        System.out.println("Bạn muốn tìm bao nhiêu số thuận nghịc có 6 chữ số:");
//         int number = sc.nextInt();
//        inSoThuanNghich(number);
        //sắp xế mảng tăng dần
//        int n;
//        System.out.println("Nhập số phần tử trong mảng");
//        n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.printf("Mảng là :");
//        for (int x : arr) {
//            System.out.printf(x + " ");
//        }
//        System.out.println();
//        inMangTangDan(arr);


//        Scanner sc = new Scanner(System.in);
//        int row = 6;
//        int column = 9;
//        String[][] arr = new String[row][column];
//
//        for(int i = 0; i < row; i++)
//        {
//            System.out.println("Nhập hàng");
//            for(int j = 0; j < column; j++) {
//                arr[i][j] = sc.nextLine();
//            }
//            System.out.println();
//        }
//        sc.close();

//        Scanner sc = new Scanner(System.in);
//        int row = 9;
//        int column = 6;
//        int count = 0;
//        String[][] arr = new String[row][column];
//
//        for(int i = 0; i < row; i++)
//        {
//            for(int j = 0; j < column; j++)
//            {
//                arr[i][j] = sc.nextLine();
//            }
//            System.out.println();
//        }
//        sc.close();
//
//        while(arr.length > count)
//        {
//            if(checkMatrix(arr) == false)
//            {
//                count++;
//            };
//        }
//        System.out.println(count);


//        int i =0;
//
//        int j =10;
//        while (i <j)
//        {
//            if(i++>j)
//            {
//                break;
//            }
//        }
//        System.out.println(i + " "+  j);
//    }


//    public static boolean checkMatrix(String [][] arr)
//    {
//        int row = arr.length;
//        int column = arr[0].length;
//        String[] tmp;
//        for(int i = 0; i < row; i++)
//        {
//            tmp = arr[i];
//            for(int j = 0; j < column; j++)
//            {
//
//                if(tmp == arr[j])
//                {
//                    return false;
//                }
//            }
//        }
//        return true;


        // Mang Đối xứng
//        System.out.println("Số phần tử trong mảng");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        if(checkMangDoiXung(arr) == true)
//        {
//            System.out.println("Mảng đối xứng");
//        }
//        else {
//            System.out.println("Mang không đối xứng");
//        }


        // Số thuận nghịc


//        for (int i: arr) {
//            System.out.println(i);
//        }


        // số lần xuất hiện của các phần tử trong mảng;
//        System.out.println("Nhập số phần tử trong mảng");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
////        boolean[] result = new boolean[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
////            result[i] = false;
//        }
//        sc.close();
//       checkSoLanXuatHien(arr);

        //in Mảng ngẩu nghiên
//        System.out.println("Nhập số phần tử trong mảng");
//        int n = sc.nextInt();
//        inMangNgauNhien(n);


        // in xuất hiện nhiều nhất trong mảng

//        System.out.println("Nhập số phần tử trong mảng");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//
//        }
//        inSoLanXuatHien(arr);

        // in mang số nguyên tố

//        System.out.println("Nhập số n");
//        int n = sc.nextInt();
//
//        viTriCuaSoNguyenTo(n);


        // chèn mảng
        System.out.println("Nhập số phần tử trong mảng 1");
        int n1 = sc.nextInt();
        System.out.println("Nhập số phần tử trong mảng 2");
        int n2 = sc.nextInt();



        int[] arr1 = new int[n1 + n2];
        int[] arr2 = new int[n2];
        System.out.println("Nhập phần tử của mảng arr1");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();

        }
        System.out.println("Vị trí chèn mảng 2 vào mảng 1");
        int index = sc.nextInt();
        System.out.println("Nhập phần tử của mảng arr2");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();

        }

        chenMangEx(arr1, arr2, index);


    }


}
