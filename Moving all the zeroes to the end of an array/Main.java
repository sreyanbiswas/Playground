import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int a1[] = new int[n];
        int i,c=0,as1=0;
        for(i=0;i<n;i++)
            arr[i] = sc.nextInt();
        for(i=0;i<n;i++){
            if(arr[i]!=0){
                a1[as1] = arr[i];
                as1++;
            }
        }
        
        for(i=0;i<n;i++){
            if(i<as1)
                arr[i] = a1[i];
            else
                arr[i] = 0;
        }
       for(i=0;i<n;i++)
           System.out.print(arr[i]+" ");
    }
}
