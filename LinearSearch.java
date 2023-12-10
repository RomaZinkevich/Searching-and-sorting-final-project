public class LinearSearch {
    public static <Int> boolean linearSearch(Integer[] data, int min, int max, int target)
        {
        int index = min;
        boolean found = false;

        while (!found && index <= max)
        {
            found = data[index].equals(target);
            index++;
        }

        return found;
    }
}

