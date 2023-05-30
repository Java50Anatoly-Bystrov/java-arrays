package java_arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
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

}
}
