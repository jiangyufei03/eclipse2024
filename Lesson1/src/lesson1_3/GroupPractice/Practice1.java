package lesson1_3.GroupPractice;

public class Practice1 {

    public static void main(String[] args) {
        
        // Initialize a variable 'sum' to store the sum of all elements in the array.
        int sum = 0;
        
        // Declares and initializes a 2-dimensional array 'arr2' with predefined integer values.
        int[][] arr2 = {{1,2,3,4}, {5,6,7}}; 
        
        // Print all even numbers in the array.
        for(int[] arr_n : arr2) {
            for(int i : arr_n) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
        
        System.out.println("------------------------------");
        
     // Print all array elements in reverse order.
        for (int i = arr2.length - 1; i >= 0; i--) {
            for (int j = arr2[i].length - 1; j >= 0; j--) {
                System.out.println(arr2[i][j]);
            }
        }
        
        
        System.out.println("------------------------------");
        
        // Calculate the sum of all elements in the array.
        for(int[] arr_n : arr2) {
            for(int n : arr_n) {
                sum += n;
            }
        }
        
        // Print the total sum of the array elements.
        System.out.println(sum);
    }
}