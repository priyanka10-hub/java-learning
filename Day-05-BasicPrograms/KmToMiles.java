import java.util.Scanner;

public class KmToMiles {
    public static void main(String args[]){
    
Scanner in = new Scanner(System.in);

System.out.println("Enter the distance in kilometers: ");
double kilometers = in.nextDouble();

double miles = kilometers * 0.621371;

System.out.println("Distance in miles = " + miles);

in.close();

}

}

