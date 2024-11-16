import java.util.Scanner;

public class evenodd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = in.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        
        int evenCount = 0;
        int oddCount = 0;

       
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        
        if (evenCount > 0) {
            System.out.println("The even numbers in the array are:");
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    System.out.println(arr[i] + " ");
                }
            }
            
        } else {
            System.out.println("No even numbers in the array.");
        }

        if (oddCount > 0) {
            System.out.println("The odd numbers in the array are:");
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 != 0) {
                    System.out.println(arr[i] + " ");
                }
            }
            
        } else {
            System.out.println("No odd numbers in the array.");
        }

        in.close();
    }
}
