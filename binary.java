import java.util.*;
import java.io.*;

public class binary {
    public static void main(String []args){
        
        int []arr= new int[100];
        int k=0;
        Scanner sc=new Scanner(System.in);
        
        try{
        File f = new File(args[0]);
        BufferedReader br= new BufferedReader(new FileReader(f));
        String st,filecontent ="";
            while(true){
                st=br.readLine();
                if(st==null)    break;
                if(filecontent!="") filecontent+=" ";
                filecontent+=st;
            }
        System.out.println(" "+filecontent);
        st ="";
        
        for(int i = 0; i<filecontent.length();i++){
            if(filecontent.charAt(i)==' '){
                arr[k++]=Integer.parseInt(st);
                //System.out.println(" "+st);
                st="";
            }
            else
                st+=Character.toString(filecontent.charAt(i));
        }
        System.out.println("ENter the number to be search :");
        int s=sc.nextInt();

        int lw=0,hg=k-1,mid,fl=0;
        while(lw<=hg){
            mid=(lw+hg)/2;
            if(arr[mid]==s){
                System.out.println("Found at :"+mid);
                fl++;
                break;
            }
            else if(arr[mid]<s){
                lw=mid+1;
            }
            else if(arr[mid]>s){
                hg=mid-1;
            }
        }
        if(fl==0)
            System.out.println("Element not found");
        
        br.close();
        }catch(IOException e){

        }catch(Exception e){

        }
        sc.close();
    }
    // public int binarySearch(int a[],int f,){
    //     int i=0;

    // }

}
