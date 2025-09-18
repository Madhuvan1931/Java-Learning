// import java.util.Arrays;
// import java.util.Collections;

public class Sorting {

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        printArray(arr);
        System.out.println("Bubble Sort");
        bubbleSort(arr);
        printArray(arr);
        // System.out.println("Selection Sort");
        // selectionSort(arr);
        // printArray(arr);

        // System.out.println("Insertion Sort");
        // insertionSort(arr);
        // printArray(arr);

        // Inbuilt Sort
        // System.out.println("Inbuilt Sort");
        // Arrays.sort(arr);
        // printArray(arr);
        // Arrays.sort(arr, 0,4);
        // printArray(arr);

        // Integer arr1[] = {1,6,2,8,4,9,3};
        // Arrays.sort(arr1, Collections.reverseOrder());
        // printArrayInteger(arr1);

        int arr2[] = {1,4,5,4,6,3,8,3,7,3,6,7,1};
        printArray(arr2);
        System.out.println("Counting Sort: ");
        countingSort(arr2);
        printArray(arr2);
    }

// Counting Sort
public static void countingSort(int arr[]){
    int n = arr.length;

    int max = Integer.MIN_VALUE;
    for(int i=0; i<n; i++){
        max = Math.max(max, arr[i]);
    }
    int count[] = new int[max+1];
    
    for(int i=0; i<n; i++){
        count[arr[i]]++;
    }

    int index = 0;
    for(int i=0; i<count.length; i++){
        while(count[i]>0){
            arr[index] = i;
            index++;
            count[i]--;
        }
    }


}

// Insertion Sort
public static void insertionSort(int arr[]){
    for(int i=1; i<arr.length; i++){
        int current = arr[i];
        int previous = i-1;
        // Finding out the correct position to insert
        while(previous>=0 && arr[previous]>current){
            arr[previous+1] = arr[previous];
            previous--;
        }
        // insertion
        arr[previous+1]  = current;
    }
}

// Selection Sort
public static void selectionSort(int arr[]){
    for(int i=0; i<arr.length-1; i++){
        int minPos = i;
        for(int j=i+1; j<arr.length; j++){
            if(arr[minPos]<arr[j]){
                minPos = j;
            }
        }
        int temp = arr[minPos];
        arr[minPos] = arr[i];
        arr[i] = temp;
    }
}

// Bubble Sort Algorithms Code
public static void bubbleSort(int[] arr){
    for(int turn=0; turn<arr.length-1; turn++){
        int count = 0;
        for(int j=0; j<arr.length-turn-1; j++){
            if(arr[j]<arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                count++;
            }
        }
        if(count==0){
            return;
        }
    }
}


// Print Array Function
public static void printArray(int[] arr){
    System.out.print("[ ");
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]);
        if(i<arr.length-1){
            System.out.print(", ");
        }
    }
    System.out.print("]");
    System.out.println();
}

// Print Array Function Integer
public static void printArrayInteger(Integer[] arr){
    System.out.print("[ ");
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]);
        if(i<arr.length-1){
            System.out.print(", ");
        }
    }
    System.out.print("]");
    System.out.println();
}
}
