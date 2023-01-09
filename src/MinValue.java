import java.util.Scanner;

public class MinValue {

    public static void arrayInput(int[] array, int n)
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++)
        {
            System.out.print("array["+i+"] = ");
            array[i] = input.nextInt();
        }
    }
    public static void arrayOutput(int[] array, int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.println(array[i] + " ");
        }
    }
    public static int minElement(int[] array, int n)
    {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++)
        {
            if (array[i] < min)
            {
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = input.nextInt();
        int[] array = new int[n];
        arrayInput(array,n);
        arrayOutput(array,n);
        int min = minElement(array, n);
        System.out.printf("Giá trị nhỏ nhất trong mảng : %d", min);
    }
}
