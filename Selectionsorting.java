
public class Selectionsorting {
    public static void printarr(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};

        //selection sorting
        for(int i = 0; i< arr.length-1; i++){
            int smallest = i;          // assume the min element is the current element
            for(int j= i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;             // Update the index of the minimum element
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];        // swapping min element with current element
            arr[i] = temp;
        }
        printarr(arr);

    }
}