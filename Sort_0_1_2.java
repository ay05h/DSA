public class Sort_0_1_2{
    // This function aims to sort the given array of 0's , 1's and 2's in assending order with time complecity of O(n) and spae complexity of O(1)
    public static void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){ 
            if(nums[mid]==2){// Place the 2 at the end of the array 
                nums[mid]=nums[high];
                nums[high--]=2;
            }
            else if(nums[mid]==1) mid++;

            else {  // Place the 0 at the stating of the array 
               nums[mid]=nums[low];
               nums[low++]=0;
               mid++;
            }

        }
    }
    // this function is to print the array 
    public static void printArr(int[] arr){
        System.out.printf("Array : ");
        for(int num :arr){
            System.out.printf( "%d ",num );
        } 
        System.out.printf( "\n");
    }
    public static  void main(String[] args){
        int[] arr={0, 1, 2, 1, 0, 2, 1, 0};
        printArr(arr);
        sortColors(arr);
        printArr(arr);
    }
}
