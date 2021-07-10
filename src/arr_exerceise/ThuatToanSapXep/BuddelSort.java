package arr_exerceise.ThuatToanSapXep;

import java.util.Arrays;

public class BuddelSort {
    public static void main(String[] args) {

        // Buddel sort tìm kiếm từng phần tử kết thúc vòng for i =0 đầu tiên sẽ tìm được vị trí lớn nhất.
        // tìm kiếm các phần tử lớn nhất trước theo chiều từ phải qua trái
        int temp;
        int[] number = {1, 5, 3, 4, 6, 2};
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = 0; j < number.length - 1; j++) {
                    if(number[j] > number[j+1])
                    {
                        temp = number[j];
                        number[j] =  number[j+1];
                        number[j+1] =  temp;
                    }
            }

        }
        System.out.println(Arrays.toString(number));
    }
}

