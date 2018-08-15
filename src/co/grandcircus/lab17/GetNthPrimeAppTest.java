package co.grandcircus.lab17;

import static org.junit.jupiter.api.Assertions.*;

import static co.grandcircus.lab17.GetNthPrimeApp.isPrime;
import static co.grandcircus.lab17.GetNthPrimeApp.getNthPrime;


import org.junit.jupiter.api.Test;

class GetNthPrimeAppTest {
	
	// Tests for isPrime
	@Test
	void test2isPrime() {
		boolean expected = true;
		
		boolean actual = isPrime(2);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test1isNotPrime() {
		boolean expected = false;
		
		boolean actual = isPrime(1);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test29isNotPrime() {
		boolean expected = true;
		
		boolean actual = isPrime(29);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test30isNotPrime() {
		boolean expected = false;
		
		boolean actual = isPrime(30);
		
		assertEquals(expected, actual);
	}

	
	// Tests for getNthPrime
	@Test
	void testGet1stPrime() {
		int expected = 2;
		
		int actual = getNthPrime(1);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testGet10thPrime() {
		int expected = 29;
		
		int actual = getNthPrime(10);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testGet100thPrime() {
		int expected = 541;
		
		int actual = getNthPrime(100);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testGet10000thPrime() {
		int expected = 7919;
		
		int actual = getNthPrime(1000);
		
		assertEquals(expected, actual);
	}
	
}
