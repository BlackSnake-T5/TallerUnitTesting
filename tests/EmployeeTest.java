package tests;

import static org.junit.Assert.*;


import org.junit.Test;

import tallerpruebas.Employee;
import tallerpruebas.EmployeeType;

public class EmployeeTest {
	
	
	
	/*
	 * Prueba sueldo de Worker en USD en mes par
	 */
	@Test
	public void testUSDWorkerPar() {
		Employee e = new Employee(100,  "USD", 10,EmployeeType.Worker);
	    assertEquals("Prueba fallida para sueldo de Worker en USD en mes par",100.0f, e.cs(),0.001);
	}
	
	/*
	 * Prueba sueldo de Worker en EU en mes par
	 */
	@Test
	public void testNoUSDWorkerPar() {
		Employee e = new Employee(100, "EU", 10,EmployeeType.Worker);
	    assertEquals("Prueba fallida para sueldo de Worker en EU en mes par",95.0f, e.cs(),0.001);
	}
	
	/*
	 * Prueba sueldo de Supervisor en USD en mes par
	 */
	@Test
	public void testUSDSupervisorPar() {
		Employee e = new Employee(100,  "USD", 10,EmployeeType.Supervisor);
	    assertEquals("Prueba fallida para sueldo de Supervisor en USD en mes par",103.5f, e.cs(),0.001);
	}
	
	
	/*
	 * Prueba sueldo de Supervisor en EU en mes par
	 */
	@Test
	public void testNoUSDSupervisorPar() {
		Employee e = new Employee(100, "EU", 10,EmployeeType.Supervisor);
	    assertEquals("Prueba fallida para sueldo de Supervisor en EU en mes par",98.5f, e.cs(),0.001);
	}
	
	/*
	 * Prueba sueldo de Manager en USD en mes par
	 */
	@Test
	public void testUSDManagerPar() {
		Employee e = new Employee(100,  "USD", 10,EmployeeType.Manager);
	    assertEquals("Prueba fallida para sueldo de Manager en USD en mes par",107.0f, e.cs(),0.001);
	}
	
	/*
	 * Prueba sueldo de Manager en EU en mes par
	 */
	@Test
	public void testNoUSDManagerPar() {
		Employee e = new Employee(100, "EU", 10,EmployeeType.Manager);
	    assertEquals("Prueba fallida para sueldo de Manager en EU en mes par",102, e.cs(),0.001);
	}
	
	/*
	 * Prueba sueldo de Worker en USD en mes impar
	 */
	@Test
	public void testUSDWorkerImpar() {
		Employee e = new Employee(100,  "USD", 10,EmployeeType.Worker);
	    assertEquals("Prueba fallida para sueldo de Worker en USD en mes impar",164.3333, e.cs(),0.001);
	}
	
	
	/*
	 * Prueba sueldo de Worker en EU en mes impar
	 */
	@Test
	public void testNoUSDWorkerImpar() {
		Employee e = new Employee(100, "EU", 10,EmployeeType.Worker);
	    assertEquals("Prueba fallida para sueldo de Worker en EU en mes impar",159.3333, e.cs(),0.001);
	}
	
	/*
	 * Prueba sueldo de Supervisor en USD en mes impar
	 */
	@Test
	public void testUSDSupervisorImpar() {
		Employee e = new Employee(100,  "USD", 10,EmployeeType.Supervisor);
	    assertEquals("Prueba fallida para sueldo de Supervisor en USD en mes impar",167.8333, e.cs(),0.001);
	}
	
	/*
	 * Prueba sueldo de Supervisor en EU en mes impar
	 */
	@Test
	public void testNoUSDSupervisorImpar() {
		Employee e = new Employee(100, "EU", 10,EmployeeType.Supervisor);
	    assertEquals("Prueba fallida para sueldo de Supervisor en EU en mes impar",162.8333, e.cs(),0.001);
	}
	
	/*
	 * Prueba sueldo de Manager en USD en mes impar
	 */
	@Test
	public void testUSDManagerImpar() {
		Employee e = new Employee(100,  "USD", 10,EmployeeType.Manager);
	    assertEquals("Prueba fallida para sueldo de Manager en USD en mes impar",171.3333, e.cs(),0.001);
	}
	
	/*
	 * Prueba sueldo de Manager en EU en mes impar
	 */
	@Test
	public void testNoUSDManagerImpar() {
		Employee e = new Employee(100, "EU", 10,EmployeeType.Manager);
	    assertEquals("Prueba fallida para sueldo de Manager en EU en mes par",166.3333, e.cs(),0.001);
	}
	
	
	/*
	 * Prueba bono anual de Worker en USD
	 */
	@Test 
	public void TestUSDWorkerYearBonus() {
		Employee e = new Employee(100,"USD",0,EmployeeType.Worker);
		assertEquals("Prueba fallida para bono anual de Worker en USD",(float)386.0,e.CalculateYearBonus(),0);
		
	}
	
	/*
	 * Prueba bono anual de Supervisor en USD
	 */
	@Test 
	public void TestUSDSupervisorYearBonus() {
		Employee e = new Employee(100,"USD",0,EmployeeType.Supervisor);
		assertEquals("Prueba fallida para bono anual de Supervisor en USD",293f,e.CalculateYearBonus(),0.01f);
		
	}
	
	/*
	 * Prueba bono anual de Manager en USD
	 */
	@Test 
	public void TestUSDManagerYearBonus() {
		Employee e = new Employee(100,"USD",0,EmployeeType.Manager);
		assertEquals("Prueba fallida para bono anual de Manager en USD",486f,e.CalculateYearBonus(),0);
		
	}
	
	/*
	 * Prueba bono anual de Worker en EU
	 */
	@Test
	public void testNoUSDWorkerYearBonus() {
		Employee emp = new Employee(100, "EU", 10, EmployeeType.Worker);
		assertEquals("Prueba fallida para bono anual de Worker en EU",386, emp.CalculateYearBonus(), 0);
	}
	
	/*
	 * Prueba bono anual de Supervisor en EU
	 */
	@Test
	public void testNoUSDSupervisorYearBonus() {
		Employee emp = new Employee(100, "EU", 10, EmployeeType.Supervisor);
		assertEquals("Prueba fallida para bono anual de Supervisor en EU",288, emp.CalculateYearBonus(), 0);
	}
	
	/*
	 * Prueba bono anual de Manager en EU
	 */
	@Test
	public void testNoUSDManagerYearBonus() {
		Employee emp = new Employee(100, "EU", 10,EmployeeType.Manager);
	    assertEquals("Prueba fallida para bono anual de Manager en EU",481, emp.CalculateYearBonus(),0);
	}

}
