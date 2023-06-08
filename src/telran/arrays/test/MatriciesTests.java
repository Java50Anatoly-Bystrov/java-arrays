package telran.arrays.test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.arrays.*;

import static telran.arrays.MatriciesInt.*;

public class MatriciesTests {
	
	@Test
	void getColumnTest()
	{
		int [][] src = {{1,10,20,50},{30,10,15,34}};
		int [] expected = {50,34};
		assertArrayEquals(expected, getColumn(src, 3));
		int [] expected2 = {10,10};
		assertArrayEquals(expected2, getColumn(src, 1));
	}
	@Test
	void getTranspMatrixTest()
	{
		int [][] src = {{1,10,20},{30,10,15}};
		int [][] expected = {{1,30},{10,10},{20,15}};
		assertArrayEquals (expected, transpMatrix(src));
		int [][] src1 = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] expected1 = {{1,4,7},{2,5,8},{3,6,9}};
		assertArrayEquals (expected1, transpMatrix(src1));
	}
	@Test
	void getMaxWithNegativeTest() {
	short[] array = {1, 1, 1,-1, 20,100,200, 100-100,-100,-20,-40, 80};
	short[] array1 = {-40, 1,-40,-6, 2, 3, 40};
	short[] array2 = {40, 1, 2, 3, 40,-30};
	assertEquals(100, interviewTasks.getMaxWithNegativePresentation(array));
	assertEquals(40, interviewTasks.getMaxWithNegativePresentation(array1));
	assertEquals(-1, interviewTasks.getMaxWithNegativePresentation(array2));
	}
	
	@Test
	void sortTest()
	{
		short [] array = {1,2,3,3,4,4,5,6,9,8,7};
		int index = ArraysInt.getRandomInt(0,10);
		interviewTasks.sort(array);
		assertTrue(array[index] <= array[index+1]);
		index = ArraysInt.getRandomInt(0,10);
		assertTrue(array[index+1] >= array[index]);
	}
	

}


