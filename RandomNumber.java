import java.io.*;
import java.util.*;

class RandomNumber{
  public static void main(String[] args){
    Scanner MyScan = new Scanner(System.in);

    System.out.println("Enter a negative number");
    int min = MyScan.nextInt();
    String grt = Math.abs(min) + "";
    System.out.println("Enter a positive number greater than "+grt);
    int max = MyScan.nextInt();
    String n1 = (Math.round(Math.random()*(max-min)) + min)+"";
    String n2 = (Math.round(Math.random()*(max-min)) + min)+"";
    System.out.println("You got "+ n1 +" and " + n2);


    Scanner madLib = new Scanner(System.in);

    System.out.println("Any decimal");
    double num1 = madLib.nextDouble();
    String w6 = num1 + ""; 
    System.out.println("Another decimal");
    double num2 = madLib.nextDouble(); 
    String w7 = num2 + "";

    System.out.println("Positive Number");
    int num3 = madLib.nextInt();
    String w1 = num3 + "";
    System.out.println("A time, ex:6:00");
    String w2 = madLib.next();
    System.out.println("Adjective");
    String w3 = madLib.next();
    System.out.println("Positive Number");
    int num4 = madLib.nextInt();
    String w4 = num4 + "";
    System.out.println("Noun");
    String w5 = madLib.next();

    System.out.println("I went fishing with "+w1+" people at "+w2+" in the morning on a "+w3+" day. We each caught "+w4+" fish and one "+w5+". The biggest fish we caught was "+w6+" pounds and "+w7+" inches long, with a total of "+(num3*(1+num4))+" catches");
  }

}
