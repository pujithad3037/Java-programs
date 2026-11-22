import java.util.Scanner;

class maxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        System.out.println("You entered array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Print only once after loop
        System.out.println("\nMaximum: " + max + " Minimum: " + min);
    }
}