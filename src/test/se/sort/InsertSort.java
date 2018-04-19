package se.sort;

/**
 * Created by wang on 2018/2/6.
 */
public class InsertSort {
    public static void main(String[] args) {
        int a[]={23,1,45,32,7,89,34,65};
        printArray(a);

    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
    }
    public static void sort(int arr[]){
        int j;
        int k;
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            k=i;
            for(j=i;j<arr.length-1;j++){
                if(arr[j+1]<temp){
                    temp=arr[j+1];
                    k=j+1;
                }
            }
            if(k>i){
                /*arr[]*/
            }
        }
    }
}
