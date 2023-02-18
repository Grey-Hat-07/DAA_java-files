import java.util.*;
import java.io.*;

public class bubble {
    public static void main(String[] args) {

        int[] arr = new int[100];
        int k = 0;
        Scanner sc = new Scanner(System.in);

        try {
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
            arr[k++] = Integer.parseInt(st);
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            st="";
            for (int i = 0; i < k; i++) {
                System.out.print(" " + arr[i]);
                st+=Integer.toString(arr[i])+" ";
            }
            //System.out.println(st);
            FileWriter fw = new FileWriter(f,false);
            fw.write(st);
            fw.close();
            br.close();
        } catch (IOException e) {
            
        } catch (Exception e) {

        }
        sc.close();
    }
}
