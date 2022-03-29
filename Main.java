import java.util.Scanner;
class Main {
  public static void main (String[] args)
  {
    String choinka = "*";
    int x = 5;
    
    for(int i=0;i<x;i++)
      {
        for(int j=x;j>0;j--)
          {
            if(j<(x-i) || j>(x+i))
            {
              System.out.print(" ");
            }
            else
            {
              System.out.print(choinka);
            }
          }
        System.out.println("");
      }
  }
}