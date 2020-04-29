import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int p = n/3;
    int arr[] = new int[n];
    int i,j,t=0,y=3;
    int s = 0,s1 = 0;
    int f = 1;
    for(i=0;i<n;i++)
      arr[i] = sc.nextInt();
    for(i=0;i<3;i++)
      s = s+arr[i];
    for(i=1;i<=p;i++){
      s1 = 0;
      for(j=t;j<y;j++)
        s1 = s1+arr[j];
      t = y;
      y = y+3;
      if(s!=s1){
        f = -1;
        break;
      }
    }
  if(f==1)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
}