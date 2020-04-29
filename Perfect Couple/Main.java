import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      int i,j;
      for(i=0;i<n;i++)
        arr[i] = sc.nextInt();
      int v = sc.nextInt();
      for(i=0;i<n;i++){
        int s=0;
        for(j=i+1;j<n;j++){
          s=arr[i]+arr[j];
          if(v==s)
            System.out.println(arr[i]+","+" "+arr[j]);
        }
      }
    }
}