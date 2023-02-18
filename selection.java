import java.util.*;
import java.io.*;

public class selection {
    public static void main(String []args){
        int []arr= new int[100];
        int k=0;
        //System.out.println("Enter the number of elements :");
        try{
            File f = new File(args[0]);
            BufferedReader br = new BufferedReader(new FileReader(f));
            String st, filecontent = "";
            while (true) {
                st = br.readLine();
                if (st == null)
                    break;
                if (filecontent != "")
                    filecontent += " ";
                filecontent += st;
            }
            System.out.println(" " + filecontent);
            st = "";

            for (int i = 0; i < filecontent.length(); i++) {
                if (filecontent.charAt(i) == ' ') {
                    arr[k++] = Integer.parseInt(st);
                    // System.out.println(" "+st);
                    st = "";
                } else
                    st += Character.toString(filecontent.charAt(i));
            }
           // int min=0;
           for(int i=0;i<k;i++){
               int min=i;
               for(int j=i+1;j<k;j++){
                   if(arr[j]<arr[min]){
                       min=j;
                   }
               }
               int temp=arr[min];
               arr[min]=arr[i];
               arr[i]=temp;
            }
            for(int i=0;i<k;i++){
                System.out.print(" "+arr[i]);
            }
            FileWriter fw = new FileWriter(f,false);
            for(int i=0;i<k;i++){
                fw.write(Integer.toString(arr[i])+" ");
            }
            fw.close();
            br.close();

        }catch(IOException e){
            System.out.println("Exception" +e);
        }
        catch(Exception e){
            System.out.println("Exception" +e);
        }
    }
}
