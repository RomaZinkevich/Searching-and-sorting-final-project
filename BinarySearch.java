public class BinarySearch {
    public static <Int> boolean binarySearch(Integer[] data, int min, int max, Integer target)
        {
        int minIndex = min;
        int maxIndex = max;
        boolean found = false;

        while (minIndex <= maxIndex){
            int midIndex = (minIndex + maxIndex) / 2;
            if (data[midIndex] == target){
                found = true;
                break;
            }
            else if (data[midIndex] < target){
                minIndex = midIndex + 1;
            }
            else{
                maxIndex = midIndex - 1;
            }
        }

        return found;
    }
}

