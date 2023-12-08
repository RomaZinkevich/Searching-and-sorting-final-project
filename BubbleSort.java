public class BubbleSort {
    private static SortingCounter sc = new SortingCounter();

    public <Int extends Comparable<Integer>> void bubbleSort(Integer[] data){
        int position, scan;
		
        for (position =  data.length - 1; position >= 0; position--)
        {
            for (scan = 0; scan <= position - 1; scan++)
            {
                if (sc.isMore(data[scan],data[scan+1]))
                    swap(data, scan, scan + 1);
            }
        }
    }	

    private <Int extends Comparable<Integer>> void swap(Integer[] data, int index1, int index2){
        int temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }

    public long getCounter(){
        return sc.getCounter();
    }
}
