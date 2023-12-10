public class InsertionSort {
    private static SortingCounter sc = new SortingCounter();

    public <Int extends Comparable<Integer>> Integer[] insertionSort(Integer[] data){
        for (int index = 1; index < data.length; index++){
            int key = data[index];
            int position = index;

            while (position > 0 && sc.isMore(data[position-1], key)){ // sc.isMore() is comparison "x > y" but with counter inside
                data[position] = data[position-1];
                position--;
            }

            data[position] = key;
        }
        return data;
    }

    public long getCounter(){//returns amount of comparisons made during sorting
        return sc.getCounter();
    }

}
