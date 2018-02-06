package merge_sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestMergeSort 
{
	@Before
	public void setUp() 
	{
	}
	
	@Test
	public void checkArrayIsInsertionSorted() 
	{
		MergeSort mergeSort = new MergeSort();
		int[] inputArray = {12, 11, 13, 5, 6, 7};
		int[] expecteOutput = { 5, 6, 7,11, 12, 13,};
		mergeSort.printArray(inputArray);
		mergeSort.sortArray(inputArray, 0, inputArray.length-1);
		assertArrayEquals(expecteOutput, inputArray);
		mergeSort.printArray(inputArray);
	}
	
	@After
	public void finishTask() 
	{
		
	}
}
