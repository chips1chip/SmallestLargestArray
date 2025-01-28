public class largestsmallestinArray {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 0}; 
        int smallest = arr[0], largest = arr[0]; // Initialize smallest and largest
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) largest = arr[i]; // Update largest if needed
            else if (arr[i] < smallest) smallest = arr[i]; // Update smallest if needed
        }
        System.out.println("The smallest number in the array is = " + smallest); 
        System.out.println("The largest number in the array is = " + largest); 
    }
}
