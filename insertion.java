import java.io.*;
// import java.util.*;
public class insertion {
    public static void main(String []args){
        int[] arr = new int[100];
        int k = 0;
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
            for(int i=1;i<k;i++){
                int key=arr[i];
                int j=i-1;
                while(j>=0 && arr[j]>key){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=key;
            }
            st="";
            for (int i = 0; i < k; i++) {
                System.out.print(" " + arr[i]);
                st+=Integer.toString(arr[i])+" ";
            }
            FileWriter fw = new FileWriter(f,false);
            fw.write(st);
            fw.close();
            br.close();

        }catch(Exception e){
            System.out.println("Exception : " + e);
        }
    }
}
