import java.util.Scanner;

public class Grassed{ 
  public static void main(String args[]){  
    Scanner kb= new Scanner(System.in);
    double c= kb.nextDouble();
    if(0<c && c<=100){
      int l=kb.nextInt();
      double sum=0;
      if(1<=l && l<=100){
        for(int i=1;i<=l;i++) sum+=kb.nextDouble()*kb.nextDouble();
        System.out.print(sum*c);
      }

    }
 
  }  
} 