package telran.arrays.test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import telran.arrays.ArraysInt;
public class ArraysTests {
@Test
void initalTest() {
int[]ar1 = {1,2,3};
int[]ar2 = {1,2,3};
int[]ar2_3 =ar2;
assertFalse(ar1==ar2);
assertTrue(ar2==ar2_3);
assertArrayEquals(ar1,ar2);
ar2_3[0]=10;
ar1[0]=10;
assertArrayEquals(ar1,ar2);
}
@Test
void copyOfIntTest(){
int [] ar1 = {10,5,15};
int [] expected1 = {10,5,15};
int [] expected2 = {10,5};
int [] expected3 = {10,5,15,0,0};

assertArrayEquals(expected1,Arrays.copyOf(ar1, 3));
assertArrayEquals(expected2,Arrays.copyOf(ar1, 2));
assertArrayEquals(expected3,Arrays.copyOf(ar1, 5));
}
@Test
void addNumberTest(){
	int [] ar1 = {10,5,15};
	int number = 20;
	int [] expected = {10,5,15,number};
	assertArrayEquals(expected,ArraysInt.addNumber(ar1, number));
}
@Test 
void arrayCopyTest(){
	int [] src = {1,2,3,4,5,6,7};
	int [] dest = {10,20,30,40,50,60,70};
	int[] expected4 = {10,20,30,40,1,2,3};
	System.arraycopy(src, 0, dest, 4, 3);
	assertArrayEquals(expected4,dest);
}
@Test
void insertNumberTest() {
	int [] src = {1,2,3,4,5,6,7};
	int number = 20;
	int index = 3;
	int[] expected5 = {1,2,3,20,4,5,6,7};
	assertArrayEquals(expected5,ArraysInt.insertNumber(src, index, number));
	number = 30;
	index = 0;
	int[] expected6 = {30,1,2,3,4,5,6,7};
	assertArrayEquals(expected6,ArraysInt.insertNumber(src, index, number));
	number = 40;
	index = 7;
	int[] expected7 = {1,2,3,4,5,6,7,40};
	assertArrayEquals(expected7,ArraysInt.insertNumber(src, index, number));
}
@Test
void removeNumberTest() {
    int[] array = {1, 2, 3, 4, 5};
    int index = 2;
    int[] expected1 = {1, 2, 4, 5};
    int[] newArray = ArraysInt.removeNumber(array, index);
    assertArrayEquals(expected1, newArray);

    array = new int[]{1, 2, 3, 4, 5};
    index = 3;
    int[] expected2 = {1, 2, 3, 5};
    newArray = ArraysInt.removeNumber(array, index);
    assertArrayEquals(expected2, newArray);

    array = new int[]{1, 2, 3, 4, 5};
    index = 4;
    int[] expected3 = {1, 2, 3, 4};
    newArray = ArraysInt.removeNumber(array, index);
    assertArrayEquals(expected3, newArray);
}

@Test
void binarySearchTest() {
    int[] array = {1, 2, 3, 4, 5};
    assertEquals(0, Arrays.binarySearch(array, 1));
    assertEquals(1, Arrays.binarySearch(array, 2));
    assertEquals(2, Arrays.binarySearch(array, 3));
    assertEquals(3, Arrays.binarySearch(array, 4));
    assertEquals(4, Arrays.binarySearch(array, 5));
    assertEquals(-1, Arrays.binarySearch(array, 0));
    assertEquals(-6, Arrays.binarySearch(array, 6));
}

@Test
void insertSortedTest() {
    int[] array = {1, 2, 4, 5};
    int[] newArray = ArraysInt.insertNumberSorted(array, 3);
    assertArrayEquals(new int[]{1, 2, 3, 4, 5}, newArray);

    array = new int[]{1, 2, 3, 5};
    newArray = ArraysInt.insertNumberSorted(array, 4);
    assertArrayEquals(new int[]{1, 2, 3, 4, 5}, newArray);

    array = new int[]{1, 2, 3, 4};
    newArray = ArraysInt.insertNumberSorted(array, 5);
    assertArrayEquals(new int[]{1, 2, 3, 4, 5}, newArray);

    array = new int[]{2, 3, 4, 5};
    newArray = ArraysInt.insertNumberSorted(array, 1);
    assertArrayEquals(new int[]{1, 2, 3, 4, 5}, newArray);
}
}
