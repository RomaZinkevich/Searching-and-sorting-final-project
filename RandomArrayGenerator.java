import java.util.Random;

public class RandomArrayGenerator {
    public static Integer[] generateRandomArray(int size){
        Random random = new Random();
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++){
            //Random number is in range [-10000,10000]
            array[i] = random.nextInt(10000 - (-10000) + 1) + (-10000); 
        }
        return array;
    }
}
