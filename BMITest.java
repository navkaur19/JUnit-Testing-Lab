
/* Project:  Lab 3
 * Class:    BMITest.java
 * Author:   Navdeep Kaur
 * Date:     March 8, 2021
 * This class tests three different methods from the BMI class. 
 */ 

import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class BMITest {
	
	//---------------------------------------------------------------
	// A test method that tests getHeight(). 
	@Test
	public void testgetHeight() {
		BMI bmi1 = new BMI("Johnny", 18, 145, 70);
		double output = bmi1.getHeight();
		assertEquals(70, output);
		
	}
	
	//---------------------------------------------------------------
	// A test method that tests getName(). 
	@Test 
	public void testgetName() {
		BMI bmi2 = new BMI("Daniel", 20, 129, 65);
		String name = bmi2.getName();
		assertNotNull("Daniel", name);
		
	}
	
	//---------------------------------------------------------------
	// A test method that tests getWeight(). 
	@Test
	public void testgetWeight() {
		BMI bmi3 = new BMI ("Ally", 19, 119.0, 60);
		double output1 = bmi3.getWeight();
		assertNotSame(123, output1);
	}
	
	

}
