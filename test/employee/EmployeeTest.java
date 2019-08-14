/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CltControl
 */
public class EmployeeTest {
    
    public EmployeeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cs method, of class Employee.
     * En este caso estamos probando a usar el metodo cs con la currency de dolares USD, pero mandando el parametro currency con minusculas
     * o sea "usd", lo que pasara es que el parametro deberia ser validado de tal manera que el campo currency no falle independientemente
     * si el campo es mayusculas o minusculas.
     */
    @Test
    public void testCs() {
        System.out.println("cs");
        Employee instance = new Employee(250,"usd",200,EmployeeType.Worker);
        float expResult = 250.0F;
        float result = instance.cs();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }
    /**
    *Test of cs method, of class Employee
    * En este caso validamos que se calcule correctamente el salario al ingresar el currency esperado
    **/
    @Test
    public void testCs1() {
        System.out.println("cs");
        Employee instance = new Employee(250,"USD",200,EmployeeType.Worker);
        float expResult = 250.0F;
        float result = instance.cs();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of CalculateYearBonus method, of class Employee.
     * Validamos que no se acpeten salarios negativos
     */
    @Test
    public void testCalculateYearBonus() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(-300,"USD",100,EmployeeType.Supervisor);
        float expResult = 0.0F;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
     
    }
    /**
     * Test of CalculateYearBonus method, of class Employee.
     * Validamos los casos donde si se envian valores positivos en los campos salary y bonusPercentage
     */
    @Test
    public void testCalculateYearBonus1() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(300,"USD",100,EmployeeType.Supervisor);
        float expResult = 493;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
     
    }
    
}
