import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Numbers");
    String in = sc.nextLine();
    String [] in1 = in.split("\\s+");
    System.out.println("Numbers");
    for( String n: in1)
    {
      System.out.println(n);
    }
  } 
}