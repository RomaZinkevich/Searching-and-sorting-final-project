// Utility class for counting comparisons during sorting operations.
public class SortingCounter {
    private long counter=0;

    public boolean isEqual(int object1, int object2){
        counter++;
        return object1==object2;
    }

    public boolean isMore(int object1, int object2){
        counter++;
        return object1>object2;
    }

    public boolean isLess(int object1, int object2){
        counter++;
        return object1<object2;
    }

    public long getCounter(){
        return counter;
    }
}
