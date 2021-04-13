import java.util.Scanner;
import java.lang.Double;

public class LineCompareUC3 {
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in);

System.out.println("The coordinates of I line: ");
      System.out.println("Enter the value of x1: ");
	int x1=s.nextInt();
      System.out.println("Enter the value of y1: ");
	int y1=s.nextInt();
      System.out.println("Enter the value of x2: ");
	int x2=s.nextInt();
      System.out.println("Enter the value of y2: ");
	int y2=s.nextInt();

    double D1=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
  System.out.println("The length of the first line: "+D1);

System.out.println("The coordinates of II line: ");
      System.out.println("Enter the value of r1: ");
	int r1=s.nextInt();
      System.out.println("Enter the value of s1: ");
	int s1=s.nextInt();
      System.out.println("Enter the value of r2: ");
	int r2=s.nextInt();
      System.out.println("Enter the value of s2: ");
	int s2=s.nextInt();

    double D2=Math.sqrt((r2-r1)*(r2-r1) + (s2-s1)*(s2-s1));
  System.out.println("The length of the second line: "+D2);

if (Double.compare(D1, D2) > 0) {
      System.out.println("The length D1 is greater than length D2");
   }
else if (Double.compare(D1, D2) < 0) {
     System.out.println("The length D1 is less than length D2");
   }
else {
     System.out.println("The length D1 is equal to length D2");
   }
 }
}
