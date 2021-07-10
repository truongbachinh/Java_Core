package ThucHanhGeneric.MethodGeneric;

public class MethodGeneric<T> {
    public static <T> void showArr(T[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
