//N.K Nkidi 45979278
/**
 * Write a description of class SelectionSortingAlgorithm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SelectionSortingAlgorithm
{
    //Initiaze a meethod to perform selectionSortAlgorithm on an array
    public static void selectionSortAlgorithm(int[] array) {
        int lengthOfArray = array.length; //Initializing variable to store length of array

        for (int i = 0; i < lengthOfArray - 1; i++) {
            System.out.println("\nPass " + (i + 1) + ":");
            //Placing and assuming i is the minimum index
            int minimumIndex = i;
            for (int j = i + 1; j < lengthOfArray; j++) {
                //Displayal of compared values
                System.out.println("Currently comparing " + array[minimumIndex] + " and " + array[j]);
                //Element at j less than minimumIndex element then update minimum index
                if (array[j] < array[minimumIndex]) {
                    System.out.println("Now updating minimum index to " + j);
                    minimumIndex = j;
                    
                }
            }

            
            System.out.println("Then swapping the elements :" + array[minimumIndex] + " and " + array[i]);
            swap(array, minimumIndex, i);
            //Displayal of array after each pass
            System.out.println("Array after Pass " + (i + 1) + ":");
            displayalOfArray(array);
        }
    }

    //method for swapping elements at index j and i
    public static void swap(int[] array, int i, int j) {
        //Storing element i in a tempoprary variable
        int tempoprary = array[i];
        //Swapping the elements
        array[i] = array[j];
        array[j] = tempoprary;
    }

    //method for display elements of the array
    public static void displayalOfArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    //main method
    public static void main(String[] args) {
        int[] array = {566, 20, 6678, 1, 78, 0, 23 , 35 , 90 , 91 ,10003 , 5473};

        //Display unsorted array
        System.out.println("The unsorted array:");
        displayalOfArray(array);

        //calling the selectionSortAlgorithm method to perfrom  sorting on the array
        selectionSortAlgorithm(array);

        //Display sorted array
        System.out.println("The sorted array:");
        displayalOfArray(array);
    }
    
}
