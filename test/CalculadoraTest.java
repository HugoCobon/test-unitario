/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hugo_Cobon "hcholc@miumg.edu.gt"
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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

    @Test
    public void testSomeMethod() {
         Calculadora calc = new Calculadora();
    
    // Prueba con números positivos
    int resultadoPositivos = calc.sumar(10, 20);
    assertEquals("La suma de 10 + 20 debe ser 30", 30, resultadoPositivos);
    
    // Prueba con números negativos
    int resultadoNegativos = calc.sumar(-10, -20);
    assertEquals("La suma de -10 + (-20) debe ser -30", -30, resultadoNegativos);
    
    // Prueba con un número positivo y uno negativo
    int resultadoMixtos = calc.sumar(10, -5);
    assertEquals("La suma de 10 + (-5) debe ser 5", 5, resultadoMixtos);
    
    // Prueba con cero
    int resultadoConCero = calc.sumar(0, 0);
    assertEquals("La suma de 0 + 0 debe ser 0", 0, resultadoConCero);
    }
    
}
