package MaTran;

public class _27_TB_Chinh_SoLanXuatHienCuaMaTran {

    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3, 4},
                {7, 8, 9, 10}
        };

        int[][] B = {
                {3, 4},
                {9, 10}
        };

        int result = checkMAtrix(A, B);

        if (result == 0) {
            System.out.println("Không xuất hiện");
        } else {
            System.out.println("Số lần xuất hiện là: " + result);
        }
    }
    public static int checkMAtrix(int[][] A, int[][] B) {
        int aRow = A.length;
        int aCol = A[0].length;
        int bRow = B.length;
        int bCol = B[0].length;
        boolean check;
        int count = 0;

        for (int i = 0; i <= aRow - bRow; i++)
        {
            for (int j = 0; j <= aCol - bCol; j++)
            {
                check = true;
                for (int k = 0; k < bRow; k++)
                {
                    for (int l = 0; l < bCol; l++)
                    {
                        if (A[i + k][j + l] !=  B[k][l])
                        {
                            check = false;
                            break;
                        }
                    }
                    if (check == false)
                    {
                        break;
                    }
                }
                if (check == true)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
