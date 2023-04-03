
import java.util.Scanner;

public class ModifiedLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        System.out.println("Enter size of the array :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + i + "th element : ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("\n Enter the Search Key : ");
        int x = sc.nextInt();
        int index = 0;
        while ((index < size) && (arr[index] < x)) {
            index++;
        }
        if ((index < size) && (arr[index] == x)) {
            System.out.println("Search Found at Index " + index);
        } else {
            System.out.println("Search not Found ");
        }
        sc.close();
    }
}

