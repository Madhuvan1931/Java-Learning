public class practice {
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        int n = arr.length;
        printArray(arr);
        // bubbleDescending(arr, n);
        // selectionDescending(arr, n);
        // insertionDescending(arr, n);
        countingDescending(arr, n);
        printArray(arr);
    }

// Bubble Sort in DESCENDING order
public static void bubbleDescending(int arr[], int n){
    for(int i=1; i<n; i++){
        for(int j=0; j<n-i; j++){
            if(arr[j]<arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}
// Selection Sort in DESCENDING order
public static void selectionDescending(int arr[], int n){
    for(int i=0; i<n; i++){
        int min = i;
        for(int j=1+i; j<n; j++){
            if(arr[j]>arr[min]){
                min = j;
            }
        }
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }
}
// Insertion Sort in DESCENDING order
public static void insertionDescending(int arr[], int n){
    for(int i=1; i<n; i++){
        int cur = arr[i];
        int pre = i-1;
        while(pre>=0 && arr[pre] < cur){
            arr[pre+1] = arr[pre];
            pre--;
        }
        arr[pre+1] = cur;
    }
}
// Counting Sort in DESCENDING order
public static void countingDescending(int arr[], int n){
    int max = Integer.MIN_VALUE;
    for(int i=0; i<n; i++){
        max = Math.max(max, arr[i]);
    }
    int count[] = new int[max+1];
    
    for(int i=0; i<n; i++){
        count[arr[i]]++;
    }

    int index = 0;
    for(int i=count.length-1; i>=0; i--){
        while(count[i] > 0){
        arr[index] = i;
        index++;
        count[i]--;
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
}
