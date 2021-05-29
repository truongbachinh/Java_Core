package arr_exerceise;

public class MangDoiXung {
    public static boolean checkMangDoiXung(int[] arr) {
        int temp = arr.length;
        for (int i = 0; i < arr.length - 1; i++) {
          if(arr[i] == arr[temp - 1])
          {
            return true;
          }
        }
        return false;
    }
}
