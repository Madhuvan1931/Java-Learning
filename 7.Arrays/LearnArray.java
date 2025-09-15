import java.util.*;
public class LearnArray {

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

// Update an Array
public static void update(int[] arr){
    for(int i=0; i<arr.length; i++){
        arr[i] = arr[i]+1;
    }
}

// Linear Search
public static int linearSearch(int arr[], int key){
    for(int i=0; i<arr.length; i++){
        if(arr[i]==key){
           return i;
        }
    }
    return -1;
}

// Largest in Array
public static int largestElement(int[] arr){
    int max = arr[0];
    for(int i=0; i<arr.length; i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
    return max;
}

// Smallest in Array
public static int smallestElement(int[] arr){
    int min = arr[0];
    for(int i=0; i<arr.length; i++){
        if(arr[i]<min){
            min = arr[i];
        }
    }
    return min;
}

// Binary Search Algorithm
public static int binarySearch(int[] arr,int target){
    int start = 0;
    int end = arr.length-1;
    for(;start<=end;){
        int mid = (start+end)/2;
        if(arr[mid]==target){
            return mid;
        } else if(arr[mid]>target){
            end = mid-1;
        } else{
            start = mid+1;
        }
    }
    return -1;
}

// Reverse an Array
public static void reverseArray(int arr[]){
    int start = 0;
    int end = arr.length-1;
    for(;start<end;){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}

// Pairs in an Array
public static void pairsArray(int[] arr){
    for(int i=0;i<arr.length; i++){
        for(int j=i+1; j<arr.length; j++){
            System.out.print("("+arr[i]+", "+arr[j]+")");
        }
        System.out.println();
    }
}

// Print Subarrays
public static void subArrays(int[] arr){
    for(int i=0;i<arr.length; i++){
        for(int j=i; j<arr.length; j++){
            for(int k=i; k<=j; k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
    }
}

// Max Subarray Sum-I (Brute Force)
public static void maxSubarraySumI(int arr[]){
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;
    for(int i=0;i<arr.length; i++){
        for(int j=i; j<arr.length; j++){
            for(int k=i; k<=j; k++){
                currSum+=arr[k];
            }
            if(currSum>maxSum)
            maxSum = currSum;
            currSum = 0;
        }
    }
    System.out.println("Max Sum = "+ maxSum);
}
// Max Subarray Sum-II (Prefix Sum)
public static void maxSubarraySumII(int arr[]){
    int prefix[] = new int[arr.length];
    prefix[0] = arr[0];
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;
    for(int i=1; i<arr.length; i++){
        prefix[i] = prefix[i-1] + arr[i];
    }
    for(int i=0; i<arr.length; i++){
        currSum = 0;
        for(int j=i; j<arr.length; j++){
            currSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
            if(maxSum<currSum){
                maxSum = currSum;
            }
        }
    }
    System.out.println("Max Sum = "+ maxSum);
} 
// Max Subarray Sum-III (Kadane's Algorithm)
public static void maxSubarraySumKadanes(int arr[]){
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;
    for(int i=0; i<arr.length; i++){
        currSum += arr[i];
        if(currSum<0)
        currSum = 0;
        maxSum = Math.max(maxSum, currSum);
    }
    System.out.println("Max Sum = "+ maxSum);
}

// Trapping Rainwater Problem:

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        {// Creating an array
            // int marks[] = new int[50];
            // int num[] = {1,2,3,4};
            // int numbers[] =  {5,6,7,8};
            // marks = new int[] {12,3,4,5,6,7,8,9};
            // String fruits[] = {"Apple", "Banana", "Guavava"};

        }

        {//input in array
            // int marks[] = new int[4];
            // marks[0] = sc.nextInt();
            // marks[1] = sc.nextInt();
            // marks[2] = sc.nextInt();
            // marks[3] = sc.nextInt();
            
            // // update
            // marks[2] = 95;
            // printArray(marks);
            
            // int percentage = (marks[0]+marks[1]+marks[2]+marks[3])/4;
            // System.out.println("Percentage = "+percentage);
        }

        {//Arrays are pass by Reference
            // int[] marks = {45,67,89};
            // printArray(marks);
            // update(marks);
            // printArray(marks);
        }

        {//Linear Search
            // int arr[] = {2,4,6,8,10,12,14,16};
            // int key = 10;
            // if(linearSearch(arr, key)==-1){
            //     System.out.println(key+" is not found");
            // }else{
            //     System.out.println(key+" is present at index: "+linearSearch(arr, key));
            // }
        }

        {//Largest and Smallest in Array
            // int arr[] = {2,4,6,8,1,10,12,45,14,16};
            // System.out.println("Lasrest Element in Array is = "+largestElement(arr));
            // System.out.println("Smallest Element in Array is = "+smallestElement(arr));
        }
        
        {//Binary Search
            // int arr[] = {2,4,6,8,10,12,14,16,18,20};
            // int target = 12;
            // if(binarySearch(arr, target)== -1){
            //     System.out.println(target+" is not found");
            // } else{
            //     System.out.println(target+" found at index: "+binarySearch(arr, target));
            // }
        }
        
        {// Reverse Array
            // int arr[] = {1,2,3,4,5,6,7,8,9,10};
            // reverseArray(arr);
            // printArray(arr);
        }

        {//Pairs in an Array
            // int arr[] = {2,4,6,8,10};
            // pairsArray(arr);
        }
        
        {// Print Subarrays
            // int arr[] = {1,2,3,4,5};
            // subArrays(arr);
        }

        {// Max Subarray Sum
            int arr[] = {1,-2,6,-1,3};
            maxSubarraySumI(arr);
            maxSubarraySumII(arr);
            maxSubarraySumKadanes(arr);
        }

       
        sc.close();
    }
}
