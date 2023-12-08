
public class PerformanceAnalyzator {

    public static  void analyzing(){
        int[] sizes = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000};
        String[] algorithms = {"bubbleSort", "insertionSort", "mergeSort", "quickSort"};
        System.out.print("\t\t\t\t\t");
        for (int size : sizes) {
            System.out.printf("%-15s", size);
        }
        System.out.println();
        for (String algorithm : algorithms) {
            System.out.printf("%-40s", algorithm+",random,comparisons");
            for (int size : sizes) {
                Integer[] array = RandomArrayGenerator.randomArrayGenerator(size);
                long counter = sortAndCount(array, algorithm);
                System.out.printf("%-15d", counter);
            }
            System.out.println();
            System.out.printf("%-40s", algorithm+",random,ms");
            for (int size : sizes) {
                Integer[] array = RandomArrayGenerator.randomArrayGenerator(size);
                long startTime = System.currentTimeMillis();
                sortAndCount(array, algorithm);
                long endTime = System.currentTimeMillis();
                long elapsedTime = endTime - startTime;
                System.out.printf("%-15d", elapsedTime);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static long sortAndCount(Integer[] array, String algorithm){
        long counter=0;
        switch (algorithm) {
            case "bubbleSort":
                BubbleSort bs = new BubbleSort();
                bs.bubbleSort(array);
                counter = bs.getCounter();
                break;
            case "insertionSort":
                InsertionSort is = new InsertionSort();
                is.insertionSort(array);
                counter = is.getCounter();
                break;
            case "mergeSort":
                MergeSort ms = new MergeSort();
                ms.mergeSort(array);
                counter = ms.getCounter();
                break;
            case "quickSort":
                QuickSort qs = new QuickSort();
                qs.quickSort(array);
                counter = qs.getCounter();
                break;
        }
        return counter;
    }
}