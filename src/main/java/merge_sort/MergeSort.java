package merge_sort;

import java.util.ArrayList;

public class MergeSort {

	public int[] sortArray(int[] inputArray, int start, int end) 
	{
		if(start<end) 
		{
			int mid = (start+end)/2;
			sortArray(inputArray, start, mid);
			sortArray(inputArray, (mid+1), (inputArray.length-1));
			merge(inputArray, start, mid, end);
		}
		
		return inputArray;
	}

	private void merge(int[] inputArray, int start, int mid, int end) 
	{
		int leftArraySize = mid-start+1;
		int rightArraySize = end-mid;
		int i =0;
		int j =0;
		int k = start;
		
		int[] leftArray = new int[leftArraySize];
		int[] rightArray = new int[rightArraySize];
		
		for(int l=0; l<leftArraySize; ++l) 
		{
			leftArray[l] = inputArray[start+l];
		}
		for(int m=0; m<rightArraySize; ++m) 
		{
			rightArray[m] = inputArray[mid+1+m];
		}
		
		
		
		while(i<leftArraySize && j<rightArraySize) 
		{
			if(leftArray[i]<=rightArray[j]) 
			{
				inputArray[k] = leftArray[i];
				i++;
			}
			else 
			{
				inputArray[k] = rightArray[j];
				j++;
			}
			k++;
		}
		
		while(i<leftArraySize) 
		{
			inputArray[k] = leftArray[i];
			i++;
			k++;
		}
		while(j<rightArraySize) 
		{
			inputArray[k] = rightArray[j];
			j++;
			k++;
		}
		
	}
	
	public void printArray(int[] inputArray) 
	{
		for(int i=0; i<inputArray.length; i++) 
		{
			System.out.print(inputArray[i]+" ");
		}
		System.out.println("");
	}

}
