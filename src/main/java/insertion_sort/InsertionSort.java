package insertion_sort;

import java.util.ArrayList;

public class InsertionSort
{

	public ArrayList<Integer> sortList(ArrayList<Integer> inputArrayList) 
	{
		int selectedValue;
		
		for(int i=1; i<inputArrayList.size(); i++) 
		{
			selectedValue = inputArrayList.get(i);
			for(int j=i-1; j>=0; j--) 
			{
				if(selectedValue<=inputArrayList.get(j)) 
				{
					inputArrayList.set(j+1, inputArrayList.get(j));
					inputArrayList.set(j, selectedValue);
				}
			}
			
		}
		return inputArrayList;
	}

}
