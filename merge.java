import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class merge {
    
    public static void main(String []args){
        int []arr = new int[100];
        int n=0;
        merge m = new merge();
        try{
            File f=new File(args[0]);
            BufferedReader br= new BufferedReader(new FileReader(f));
            String st,fileContent="";
            while(true){
                st=br.readLine();
                if(st==null)
                    break;
                if(fileContent!="")
                    fileContent+=" ";
                fileContent+=st;
            }
            st="";
            System.out.println(fileContent);
            for(int i=0;i<fileContent.length();i++){
                if(fileContent.charAt(i)==' '){
                    arr[n++]=Integer.parseInt(st);
                    st="";
                }
                else
                    st+=Character.toString(fileContent.charAt(i));
            }
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            m.mergeSort(arr, 0, n);
            for(int i=1;i<=n;i++){
                System.out.print(arr[i]+" ");
            }
            FileWriter fw = new FileWriter(f);
            for(int i=1;i<=n;i++){
                fw.write(Integer.toString(arr[i])+" ");
            }
            fw.close();
            br.close();
            
        }catch(Exception e){
            System.out.println(e);
        }

    }
    void mergeSort(int []ar,int l,int u){
        if(l<u){
            int mid=(l+u)/2;
            mergeSort(ar, l, mid);
            mergeSort(ar, mid+1,u);
            merges(ar,l,mid,u);
        }
    }
    void merges(int a[],int beg,int mid,int end){
        int i, j, k;  
        int n1 = mid - beg + 1;    
        int n2 = end - mid;    
          
       /* temporary Arrays */  
            int LeftArray[] = new int[n1];  
            int RightArray[] = new int[n2];  
          
        /* copy data to temp arrays */  
        for (i = 0; i < n1; i++)    
        LeftArray[i] = a[beg + i];    
        for (j = 0; j < n2; j++)    
        RightArray[j] = a[mid + 1 + j];    
          
        i = 0; /* initial index of first sub-array */  
        j = 0; /* initial index of second sub-array */   
        k = beg;  /* initial index of merged sub-array */  
          
        while (i < n1 && j < n2)    
        {    
            if(LeftArray[i] <= RightArray[j])    
            {    
                a[k] = LeftArray[i];    
                i++;    
            }    
            else    
            {    
                a[k] = RightArray[j];    
                j++;    
            }    
            k++;    
        }    
        while (i<n1)    
        {    
            a[k] = LeftArray[i];    
            i++;    
            k++;    
        }    
          
        while (j<n2)    
        {    
            a[k] = RightArray[j];    
            j++;    
            k++;    
        }    
    }
}
