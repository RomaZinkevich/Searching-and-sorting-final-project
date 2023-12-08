public class InsertionSort {
    public static <Int extends Comparable<Integer>> Integer[] insertionSort(Integer[] data){
        for (int index = 1; index < data.length; index++){
            int key = data[index];
            int position = index;

            while (position > 0 && data[position-1].compareTo(key) > 0){
                data[position] = data[position-1];
                position--;
            }

            data[position] = key;
        }
        return data;
    }

}
