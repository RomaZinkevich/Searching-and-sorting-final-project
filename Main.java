import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean isRunning=true;
        // Integer[] array = {1, 12 ,5};
        // boolean result = LinearSearch.linearSearch(array,0,3,12);
        // System.out.println(result);
        Scanner scanner = new Scanner(System.in);
        while (isRunning){
            System.out.print("Menu of Searching and Sorting Testbed.\n\n1)  Linear searching\n2)  Binary searching\n3)  O(n^2) type of sorting\n4)  O(n*log(n)) type of sorting\n5)  Sorting performance\n\nq/Q) Quit\n\nYour choice: ");
            String choice = scanner.next();
            switch (choice) {
                case "1":
                    linearSearching(scanner);
                    break;
                case "2":
                    binarySearching(scanner);
                    break;
                case "3":
                    quadraticSorting(scanner);
                    break;
                case "4":
                    logarithmicSorting(scanner);
                    break;
                case "5":
                    System.out.println("This function has not been implemented yet!");
                    break;
                case "q":
                case "Q":
                    System.out.println("Goodbye!");
                    isRunning=false;
                    break;
                default:
                    System.out.println("Man wtf there was no option like that. Let's pretend it didn't happen and try again!");
                    break;
            }
        }
        scanner.close();
    }

    public static void linearSearching(Scanner scanner){
        System.out.print("In the list are values 0, ..., 9; which value would you like to search with linear search? ");
        int value = scanner.nextInt();
        System.out.println("\n");
        Integer[] array = {0, 1, 2 , 3, 4, 5, 6, 7, 8, 9};
        boolean result = LinearSearch.linearSearch(array,0,9,value);
        if (result) System.out.println("Found\n\n");
        else System.out.println("Not found\n\n");                  
    }

    public static void binarySearching(Scanner scanner){
        System.out.print("In the list are values 0, ..., 9; which value would you like to search with binary search? ");
        int value = scanner.nextInt();
        System.out.println("\n");
        Integer[] array = {0, 1, 2 , 3, 4, 5, 6, 7, 8, 9};
        boolean result = BinarySearch.binarySearch(array,0,9,value);
        if (result) System.out.println("Found\n\n");
        else System.out.println("Not found\n\n");                  
    }

    public static void quadraticSorting(Scanner scanner){
        Integer[] randomArray = RandomArrayGenerator.randomArrayGenerator(10);
        System.out.println("\nData set before insertion sorting:");
        printArray(randomArray);
        System.out.println("\n\nData set after insertion sorting:");
        Integer[] sortedArray = InsertionSort.insertionSort(randomArray);
        printArray(sortedArray);
        System.out.println("\n");
    }

    public static void logarithmicSorting(Scanner scanner){
        Integer[] randomArray = RandomArrayGenerator.randomArrayGenerator(10);
        System.out.println("\nData set before quicksort:");
        printArray(randomArray);
        System.out.println("\n\nData set after quicksort:");
        Integer[] sortedArray = QuickSort.quickSort(randomArray);
        printArray(sortedArray);
        System.out.println("\n");
    }

    public static void printArray(Integer[] array){
        for (int i = 0; i < 10; i++){
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }

}
