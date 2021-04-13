import java.util.Scanner;

public class LineEqualityUC2 {
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

String n1=Double.toString(D1);
String n2=Double.toString(D2);

  if (n1.equals(n2))
   System.out.println("The distance is equal");
  else
   System.out.println("Not equal");
 }
}
