public class MergeSort {
    private static SortingCounter sc = new SortingCounter();

    public <Int extends Comparable<Int>> void mergeSort(Integer[] data){
        mergeSort(data, 0, data.length - 1);
	}
	
    //Recursion method
	private <T extends Comparable<T>> void mergeSort(Integer[] data, int min, int max){
        if (min < max)
        {
            int mid = (min + max) / 2;
            mergeSort(data, min, mid);
            mergeSort(data, mid+1, max);
            merge(data, min, mid, max);
        }
	}		

	private <Int extends Comparable<Int>> void merge(Integer[] data, int first, int mid, int last){
        Integer[] temp = new Integer[data.length];
		
        int first1 = first, last1 = mid; 
        int first2 = mid+1, last2 = last;  
        int index = first1;  
		
        while (first1 <= last1 && first2 <= last2)
        {
            if (sc.isLess(data[first1], data[first2])) //comparison "x < y" but with counter inside
            {
                temp[index] = data[first1];
                first1++;
            }
            else
            {
				temp[index] = data[first2];
				first2++;
            }
            index++;
        }
		
        while (first1 <= last1)
        {
            temp[index] = data[first1];
            first1++;
            index++;
        }
		
        while (first2 <= last2)
        {
            temp[index] = data[first2];
            first2++;
            index++;
        }
		
        for (index = first; index <= last; index++)
            data[index] = temp[index];
    }		

    public long getCounter(){//returns amount of comparisons made during sorting
        return sc.getCounter();
    }
}
