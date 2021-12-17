/* Project:  Lab 3
 * Class:    UseBMIClass.java
 * Author:   Navdeep Kaur
 * Date:     March 8, 2021
 * This class gets the BMI according to the height and weight 
 */ 
public class UseBMIClass {
  public static void main(String[] args) {
    BMI bmi1 = new BMI("John Doe", 18, 145, 70);
    System.out.println("The BMI for " + bmi1.getName() + " is "
      + bmi1.getBMI());
    
    BMI bmi2 = new BMI("Peter King", 215, 70);
    System.out.println("The BMI for " + bmi2.getName() + " is "
      + bmi2.getBMI() );
  }
}
