public class QuickSort {
    public static <Int extends Comparable<Integer>> Integer[] quickSort(Integer[] data){
        quickSort(data, 0, data.length - 1);
        return data;
    }

    private static <Int extends Comparable<Integer>> void quickSort(Integer[] data, int min, int max){
        if (min < max){
            int indexofpartition = partition(data, min, max);
            quickSort(data, min, indexofpartition - 1);
            quickSort(data, indexofpartition +1, max);
        }
    }

    private static <Int extends Comparable<Integer>> int partition(Integer[] data, int min, int max){
        int partitionelement;
        int left, right;
        int middle = (min + max) / 2;
        partitionelement = data[middle];
        swap(data, middle, min);

        left = min;
        right = max;
        while (left < right){
            while (left < right && data[left].compareTo(partitionelement) <= 0)
                left++;
            while (data[right].compareTo(partitionelement) > 0)
                right--;
            if (left < right)
                swap(data, left, right);
        }
        swap(data, min, right);
        return right;
    }

    private static <Int extends Comparable<Integer>> void swap(Integer[] data, int index1, int index2){
        int temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }
}
