import java.util.Scanner;

public class Percentage
{
public static void main(String args[]){
Scanner in = new Scanner(System.in);
System.out.println("Enter the marks of 5 subjects:");

System.out.println("Subject 1:");
 int sub1 = in.nextInt();

System.out.println("Subject 2:");
 int sub2 = in.nextInt();

System.out.println("Subject 3:");
 int sub3 = in.nextInt();

System.out.println("Subject 4:");
 int sub4 = in.nextInt();

System.out.println("Subject 5:");
 int sub5 = in.nextInt();

int total = sub1 + sub2 + sub3 + sub4 + sub5;

float percentage = (total/500.0f)* 100;

System.out.println("Total Marks  = " + total);
System.out.println("Percentage = " + percentage + "%");

in.close();

}
}