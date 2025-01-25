public class largestsmallestinArray {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,0};
        int smallest = arr[0];
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            } else if (arr[i] < smallest) { 
                smallest = arr[i];
            }
        }
        System.out.println("The smallest number in the array is = ");
        System.out.println(smallest);
        System.out.println("The largest number in the array is = ");
        System.out.println(largest);
    }
}