import java.util.Scanner;
/**
 * Write a description of class main here.
 *
 * @author Jeff Grockowski
 * @version 11/05/2019
 */
public class main
{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        
        Temperature a = new Temperature();
        System.out.println("The First Temperature is " + a.getDegreeInCelsius() + " C");
        System.out.println("The First Temperature is " + a.getDegreeInFahrenheit() + " F");
        
        System.out.println("Set the degree (a number) and scale (F or C) of the first temperature");
        
        System.out.println("First set the degree: ");
        a.setDegree(input.nextDouble());
        System.out.println("now set the scale: ");
        a.setDegree(input.next().charAt(0));
        
        System.out.println();
        System.out.println("The First Temperature is " + a.getDegreeInCelsius() + " C");
        System.out.println("The First Temperature is " + a.getDegreeInFahrenheit() + " F");
        
        Temperature b = new Temperature(32.0);
        System.out.println("The second Temperature has been created using the constructor with a double argument.");
        System.out.println("Which set degree to this argument and the scale to a default value of C.");
        System.out.println("In my code, I passed 32 to the double argument. so");
        
        System.out.println("The Second Temperature is " + b.getDegreeInCelsius() + " C");
        System.out.println("The Second Temperature is " + b.getDegreeInFahrenheit() + " F");
        
        System.out.println("First set the degree: ");
        b.setDegree(input.nextDouble());
        System.out.println();
        System.out.println("now set the scale: ");
        b.setDegree(input.next().charAt(0));
        System.out.println("The Second Temperature is " + b.getDegreeInCelsius() + " C");
        System.out.println("The Second Temperature is " + b.getDegreeInFahrenheit() + " F");
        
        
        System.out.println("A third temperature has been created using the constructor whic ");
    }
}
