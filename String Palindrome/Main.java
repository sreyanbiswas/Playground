import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int l = str.length();
    String s="";
    int i;
    for(i=l-1;i>=0;i--){
      s = s+str.charAt(i);
    }
    if(str.equals(s))
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}