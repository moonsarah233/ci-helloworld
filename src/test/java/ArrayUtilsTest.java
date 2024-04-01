import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.*;

public class ArrayUtilsTest {

    @Test
    public void testFindLastNull() {
        // Do not execute fault
        assertThrows(NullPointerException.class, () -> {ArrayUtils.findLast(null, 3);});
    }


    @Test
    public void testFindLastEmpty() {
        // For any input where y appears in the second or later position, there is no error. Also,
        // if x is empty, there is no error.
        assertEquals(-1, ArrayUtils.findLast(new int[]{}, 3));
    }

    @Test
    public void testFindLastNonExistent() {
        assertEquals(-1, ArrayUtils.findLast(new int[]{1, 2}, 3));
    }

    @Test
    public void testFindLastExistsFirstElement() {
        assertEquals(0, ArrayUtils.findLast(new int[]{2, 3, 5}, 2));
    }

    @Test
    public void testOddOrPosNull() {
        // Do not execute fault
        assertThrows(NullPointerException.class, () -> {ArrayUtils.oddOrPos(null);});
    }


    @Test
    public void testOddOrPosAllPositives() {
        // Any nonempty x with only non-negative elements works, because the first part of the
        // compound if-test is not necessary unless the value is negative.
        assertEquals(3, ArrayUtils.oddOrPos(new int[]{1, 2, 3}));
    }

    @Test
    public void testOddOrPositiveBothPositivesAndNegatives() {
        assertEquals(3, ArrayUtils.oddOrPos(new int[]{-3, -2, 0, 1, 4}));
    }

    @Test
    public void testCountOfSingleOccurrence() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        int expectedCount = 1;
        int actualCount = ArrayUtils.countOf(array, target);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testCountOfMultipleOccurrences() {
        int[] array = {1, 2, 3, 4, 3, 5, 3};
        int target = 3;
        int expectedCount = 3;
        int actualCount = ArrayUtils.countOf(array, target);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testCountOfNoOccurrence() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 6; // Number not present in the array
        int expectedCount = 0;
        int actualCount = ArrayUtils.countOf(array, target);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testCountOfEmptyArray() {
        int[] array = {};
        int target = 5; // Target doesn't matter as the array is empty
        int expectedCount = 0;
        int actualCount = ArrayUtils.countOf(array, target);
        assertEquals(expectedCount, actualCount);
    }
}