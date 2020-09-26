package tests;

import static org.junit.Assert.*;


import org.junit.Test;

import tallerpruebas.Employee;
import tallerpruebas.EmployeeType;

public class EmployeeTest {
	
	
	

	@Test
	public void testUSDWorkerPar() {
		Employee e = new Employee(100,  "USD", 10,EmployeeType.Worker);
	    assertEquals(100.0f, e.cs(),0.001);
	}
	
	@Test
	public void testNoUSDWorkerPar() {
		Employee e = new Employee(100, "EU", 10,EmployeeType.Worker);
	    assertEquals(95.0f, e.cs(),0.001);
	}
	
	@Test
	public void testUSDSupervisorPar() {
		Employee e = new Employee(100,  "USD", 10,EmployeeType.Supervisor);
	    assertEquals(103.5f, e.cs(),0.001);
	}
	
	@Test
	public void testNoUSDSupervisorPar() {
		Employee e = new Employee(100, "EU", 10,EmployeeType.Supervisor);
	    assertEquals(98.5f, e.cs(),0.001);
	}
	
	@Test
	public void testUSDManagerPar() {
		Employee e = new Employee(100,  "USD", 10,EmployeeType.Manager);
	    assertEquals(107.0f, e.cs(),0.001);
	}
	
	@Test
	public void testNoUSDManagerPar() {
		Employee e = new Employee(100, "EU", 10,EmployeeType.Manager);
	    assertEquals(102, e.cs(),0.001);
	}
	
	
	@Test
	public void testUSDWorkerImpar() {
		Employee e = new Employee(100,  "USD", 10,EmployeeType.Worker);
	    assertEquals(164.3333, e.cs(),0.001);
	}
	
	@Test
	public void testNoUSDWorkerImpar() {
		Employee e = new Employee(100, "EU", 10,EmployeeType.Worker);
	    assertEquals(159.3333, e.cs(),0.001);
	}
	
	@Test
	public void testUSDSupervisorImpar() {
		Employee e = new Employee(100,  "USD", 10,EmployeeType.Supervisor);
	    assertEquals(167.8333, e.cs(),0.001);
	}
	
	@Test
	public void testNoUSDSupervisorImpar() {
		Employee e = new Employee(100, "EU", 10,EmployeeType.Supervisor);
	    assertEquals(162.8333, e.cs(),0.001);
	}
	
	@Test
	public void testUSDManagerImpar() {
		Employee e = new Employee(100,  "USD", 10,EmployeeType.Manager);
	    assertEquals(171.3333, e.cs(),0.001);
	}
	
	@Test
	public void testNoUSDManagerImpar() {
		Employee e = new Employee(100, "EU", 10,EmployeeType.Manager);
	    assertEquals(166.3333, e.cs(),0.001);
	}
	
	@Test 
	public void TestUSDWorkerYearBonus() {
		Employee e = new Employee(100,"USD",0,EmployeeType.Worker);
		assertEquals((float)386.0,e.CalculateYearBonus(),0);
		
	}
	
	@Test 
	public void TestUSDSupervisorYearBonus() {
		Employee e = new Employee(100,"USD",0,EmployeeType.Supervisor);
		assertEquals(293f,e.CalculateYearBonus(),0.01f);
		
	}
	
	@Test 
	public void TestUSDManagerYearBonus() {
		Employee e = new Employee(100,"USD",0,EmployeeType.Manager);
		assertEquals(486f,e.CalculateYearBonus(),0);
		
	}
	
	@Test
	public void testNoUSDWorkerYearBonus() {
		Employee emp = new Employee(100, "EU", 10, EmployeeType.Worker);
		assertEquals(386, emp.CalculateYearBonus(), 0);
	}
	
	@Test
	public void testNoUSDSupervisorYearBonus() {
		Employee emp = new Employee(100, "EU", 10, EmployeeType.Supervisor);
		assertEquals(288, emp.CalculateYearBonus(), 0);
	}
	
	@Test
	public void testNoUSDManagerYearBonus() {
		Employee emp = new Employee(100, "EU", 10,EmployeeType.Manager);
	    assertEquals(481, emp.CalculateYearBonus(),0);
	}

}
