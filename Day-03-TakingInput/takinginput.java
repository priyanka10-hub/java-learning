import java.util.Scanner;
public class takinginput{
public static void main(String args[]){
System.out.println("Taking input from the user");
Scanner in = new Scanner(System.in);
System.out.println("Enter number 1");
int a=in.nextInt();
System.out.println("Enter number 2");
int b=in.nextInt();
int sum=a+b;
System.out.println("The sum of these number is");
System.out.println(sum);
}
}