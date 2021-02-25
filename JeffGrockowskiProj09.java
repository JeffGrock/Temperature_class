
/**
 * Write a description of class jeffgrockowskiProj9 here.
 *
 * @author Jeff Grockowski
 * @version 11/06/2019
 */
public class Temperature
{
    private double degree;
    private char scale;
    
    public Temperature(){
        degree = 0.0;
        scale = 'C';
    }
    
    public Temperature(double new_degree){
        degree = new_degree;
        scale = 'C';
    }
    
    public Temperature(char new_scale){
        scale = new_scale;
        degree = 0.0;
    }
    
    public Temperature(double new_degree, char new_scale){
        degree = new_degree;
        scale = new_scale;
    }
    
    public double getDegreeInCelsius(){
        if (scale == 'C') {
            return degree;
        }
        else {
            return ((degree - 32) * (5/9));
        }
    }
    
    public double getDegreeInFahrenheit(){
        if (degree == 'F'){
            return degree;
        }
        else{
            return ((1.8*degree) + 32);
        }
    }
    
    public void setDegree(double new_degree){
        degree = new_degree;
    }
    
    public void setDegree(char new_scale){
        scale = new_scale;
    }
    
    public void setDegree(double new_degree, char new_scale){
        degree = new_degree;
        scale = new_scale;
    }
    
    public boolean equals(Temperature a) {
        if (a.scale == this.scale) {
            if (this.degree == a.degree){
                return true;
            }
            else {
                return false;
            }
        }
        else if (this.scale == 'F') {
            if (this.degree == a.getDegreeInFahrenheit()) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (this.degree == a.getDegreeInCelsius()){
                return true;
            }
            else {
                return false;
            }
        }
    }
    public boolean isLessThan(Temperature a) {
        if (a.scale == this.scale) {
            if (this.degree < a.degree){
                return true;
            }
            else {
                return false;
            }
        }
        else if (this.scale == 'F') {
            if (this.degree < a.getDegreeInFahrenheit()) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (this.degree < a.getDegreeInCelsius()){
                return true;
            }
            else {
                return false;
            }
        }
    }
    public boolean isGreaterThan(Temperature a){
        if (a.scale == this.scale) {
            if (this.degree > a.degree){
                return true;
            }
            else {
                return false;
            }
        }
        else if (this.scale == 'F') {
            if (this.degree > a.getDegreeInFahrenheit()) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (this.degree > a.getDegreeInCelsius()){
                return true;
            }
            else {
                return false;
            }
        }
    }
}
/*The first Temperature has been created using the default constructor which sets 
the degree to a deafault value of 0.0 and the scale to a default value of C.
The first Temperature is 0.00 C.
The first Temperature is 32.00 F.
Set the degree (a number) and the scale (F or C) of the first Temperature.
First set the degree: 77
Now set the scale: C
Now the first Temperature is 77.00 C.
which is 170.60 F.

The second Temperature has been created using the constructor with a double argument. 
Which set degree to this argument and the scale to a default value of C.
In my code, I passed 32 to the double argument. So
The second Temperature is 32.00 C.
The second Temperature is 89.60 F.
Set the degree (a number) and the scale (F or C) of the second Temperature.
First set the degree: 77
Now set the scale: F
The second Temperature is 25.00  C.
The second Temperature is 77.00  F.

The third Temperature has been created using the constructer which sets 
the degree to a default value of 0.0 and the scale to the argument.
I passed 'F' to the argument. So 
The third Temperature is 0.00 F.
which is -17.78 C.
Set the degree (a number) and the scale (F or C) of the third Temperature.
First set the degree: 25
Now set the scale: C
The third Temperature is 25.00 C.
which is 77.00 F.

The fourth Temperature has been created using the constructer which sets 
the degree to double argument and and the scale to char argument.
I passed 98.6 and 'F' to the arguments. So 
The fourth Temperature is 37.00 C.
The fourth Temperature is 98.60 F.
Set the degree (a number) and the scale (F or C) of the fourth Temperature.
First set the degree: 100
Now set the scale: C
The fourth Temperature is 100.00 C.
which is 212.00 F.

In order of creation the Temperatures in Celcius are: 77.00, 25.00, 25.00, 100.00
In order of creation the Temperatures in Fahrenheit are: 170.60, 77.00, 77.00, 212.00

The first Temperature is not equal to the second.
The first Temperature is not less than the second.
The first Temperature is greater than the second.

The first Temperature is not equal to the third.
The first Temperature is not less than the third.
The first Temperature is greater than the third.

The first Temperature is not equal to the fourth.
The first Temperature is less than the fourth.
The first Temperature is not greater than the fourth.

The second Temperature is equal to the third.
The second Temperature is not less than the third.
The second Temperature is not greater than the third.

The second Temperature is not equal to the fourth.
The second Temperature is less than the fourth.
The second Temperature is not greater than the fourth.

The third Temperature is not equal to the fourth.
The third Temperature is less than the fourth.
The third Temperature is not greater than the fourth.

 * 
 * 
 * 
 * /
 */