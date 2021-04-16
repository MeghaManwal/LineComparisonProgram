import java.util.Scanner;

 class Const {
     int x1;
     int y1;
     int x2; 
     int y2;
     double dist;

 public void Cordinates(int num) {
    System.out.println("The coordinates for the line: "+num);
      Scanner s=new Scanner(System.in);
      int x1=s.nextInt();
      int y1=s.nextInt();
      int x2=s.nextInt();
      int y2=s.nextInt();
  }

 double distance() {
   dist=(double)Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
   return dist;
   }
 }

public class LineConstructusingOOPsUC4 {
public static void main(String[] args) {

   Const L1=new Const();
   L1.Cordinates(1);
   double D1=L1.distance();
   System.out.println("The distance b/w the cordinates for line 1:"+D1);

   Const L2=new Const();
   L2.Cordinates(2);
   double D2=L2.distance();
   System.out.println("The distance b/w the cordinates for line 2:"+D2);

   String n1=Double.toString(D1);
   String n2=Double.toString(D2);

//to check Equality using equal method
  if (n1.equals(n2)) {
   System.out.println("The distance is equal");
  }
  else {
  System.out.println("Not equal");
  }
//to compare length using compare method
  if (Double.compare(D1, D2) > 0) {
     System.out.println("The length p1 is greater than length p2");
  }
  else if (Double.compare(D1, D2) < 0) {
     System.out.println("The length D1 is less than length D2");
  }
  else {
     System.out.println("The length D1 is equal to length D2");
  }
 }
}
