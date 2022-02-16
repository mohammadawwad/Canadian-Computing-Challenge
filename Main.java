import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
    // System.out.println("Enter Numbers");
    String in = sc.nextLine();
    String [] in1 = in.split("\\s+");
    // System.out.println("Numbers");

    String value = "";
    for( String n: in1)
    {
      // System.out.println(n);
      value = n;
    }

    // String numWanted = in1[0];1414
    ArrayList<Integer> total5 = new ArrayList<Integer>();
    ArrayList<Integer> total4 = new ArrayList<Integer>();
    ArrayList<Integer> total4and5 = new ArrayList<Integer>();
    int combinations = 0;

    int wantedValue = Integer.parseInt(value);
    int myTotal5 = 0;
    int myTotal4 = 0;
    int myTotal4and5 = 0;

    int numberof5 = 0;
    int numberof4 = 0;
    int numberof4and5 = 0;

    for(int count = 0; count <=10; count++){

    //finds combinations of 5's
    for(int x = 0; x <= 10; x++){
      total5.add(5);
      myTotal5 += total5.get(x);
      // System.out.println("LIST TOTAL: " + total5);

      if(myTotal5 == wantedValue){
        // System.out.println("MY TOTAL: " + myTotal5);
        numberof5 = total5.size();
        combinations += 1;
        // System.out.println(combinations); combos
      }
    }
 
    //finds combination of 4's
    for(int x = 0; x <= 10; x++){
      total4.add(4);
      myTotal4 += total4.get(x);
      // System.out.println("LIST TOTAL: " + total4);
      if(myTotal4 == wantedValue){
        // System.out.println("MY TOTAL: " + myTotal4);
        numberof4 = total4.size();
        combinations += 1;
        // System.out.println(combinations);combos
      }
    }


    //finds combinations of 4's and 5's
    
    int fakeWantedValue = wantedValue;
    for(int x = 0; x <= 10; x++){
      int testRem = fakeWantedValue % 5;
      // System.out.println("testRem: " + testRem);
      if(testRem != 0){
        total4and5.add(4);
        myTotal4and5 += total4and5.get(x);
        
        fakeWantedValue -= 4;
        // System.out.print("Fake Wanted Value: " + fakeWantedValue);
        
        // if(myTotal4and5 == fakeWantedValue){
        //   combinations += 1;
        // }
      }

      if(testRem == 0){
        total4and5.add(5);
        myTotal4and5 += total4and5.get(x);

       
        if(myTotal4and5 == wantedValue){
          numberof4and5 = total5.size();
          if((total4and5.contains(5)) && (total4and5.contains(4))){
            combinations += 1;
            // System.out.println(total4and5);
            // System.out.println("COMBO FOUND: " + combinations);
          }
        }

      }

    }

  }











    //Total Combinations of combos 
    System.out.println(combinations); 

  } 
}


























// ------------------------------PART 2

