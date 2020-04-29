import java.util.Scanner;
class Main {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int arr[] = new int[n];
     int i,temp,t=0,j,l;
     for(i=0;i<n;i++)
         arr[i] = sc.nextInt();
      int ar = sc.nextInt();
     for(i=1;i<=ar;i++){
         temp = arr[1];
         for(j=3;j<n;j=j+2){
             arr[j-2] = arr[j];
             t = j;
         }
         arr[t] = temp;
     }
     if(n%2==0)
       l = n-2;
      else
        l = n-1;
     for(i=1;i<=ar;i++){
         temp = arr[l];
         for(j=l;j>0;j=j-2){
             arr[j] = arr[j-2];
             t = j;
         }
         arr[0] = temp;
     }
        for(i=0;i<n;i++)
         System.out.print(arr[i]+" ");
    }
   
}
