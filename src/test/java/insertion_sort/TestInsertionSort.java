package insertion_sort;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestInsertionSort 
{
	ArrayList<Integer> inputArrayList = new ArrayList<Integer>();
	ArrayList<Integer> sortedArrayList = new ArrayList<Integer>();
	@Before
	public void setUp() 
	{
		inputArrayList.add(12);
		inputArrayList.add(11);
		inputArrayList.add(13);
		inputArrayList.add(5);
		inputArrayList.add(6);
		
		sortedArrayList.add(5);
		sortedArrayList.add(6);
		sortedArrayList.add(11);
		sortedArrayList.add(12);
		sortedArrayList.add(13);

	}
	
	@Test
	public void checkArrayIsInsertionSorted() 
	{
		InsertionSort insertionSort = new InsertionSort();
		ArrayList<Integer> alSorterdList = insertionSort.sortList(inputArrayList);
		assertEquals(sortedArrayList, alSorterdList);
	}
	
	@After
	public void finishTask() 
	{
		
	}
}
