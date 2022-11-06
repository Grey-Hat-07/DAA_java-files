
import java.util.Scanner;

public class linear {
    public static void main(String[] args) {
        int []a=new int[100];
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        int flag=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==key)
            {
                System.out.println("Element found at "+(i+1));
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Element not found");
        }

        sc.close();

    }
}