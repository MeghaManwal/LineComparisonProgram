import java.util.Scanner;

public class LineConstructUC1 {
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in);

System.out.println("Enter the value for x1:");
int x1=s.nextInt();

System.out.println("Enter the value for y1:");
int y1=s.nextInt();

System.out.println("Enter the value for x2:");
int x2=s.nextInt();

System.out.println("Enter the value for y2:");
int y2=s.nextInt();

double dist=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
System.out.println("The distance b/w the points: "+dist);
 }
}
