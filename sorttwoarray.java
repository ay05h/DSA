public class sorttwoarray{

    public static void swap(int[] nums1,int[] nums2, int pointer1, int pointer2) {
        if (pointer1 != pointer2) {
            nums1[pointer1] += nums2[pointer2];
            nums2[pointer2] = nums1[pointer1] - nums2[pointer2];
            nums1[pointer1] -= nums2[pointer2];
        }
    }
    public static void sort2array(int[] nums1, int[] nums2) {
        int lenArr1=nums1.length , lenArr2=nums2.length;
        int mid=(lenArr1+ lenArr2+ 1)/2; 
        while(mid>0) {
            int i=0, j=mid;
            while(j <(lenArr1+lenArr2)) {              
                if (i <lenArr1 && j< lenArr1) {
                    if (nums1[i]> nums1[j]) {
                        swap(nums1,nums1,i,j);
                    }
                }
                else if (i<lenArr1 && j>=lenArr1) {
                    if (nums1[i]>nums2[j- lenArr1]) {
                        swap(nums1,nums2,i,j-lenArr1);
                    }
                }
                else if (i>= lenArr1 && j>=lenArr1) {
                    if (nums2[i-lenArr1]>nums2[j-lenArr1]) {
                        swap(nums2,nums2,i-lenArr1,j-lenArr1);
                    }
                }
                i++;
                j++;
            }
            if (mid == 1) break;
            mid = (mid + 1) / 2;
        }
    }

    public static void printArr(int[] arr){
        System.out.printf("Array : ");
        for(int num :arr){
            System.out.printf( "%d ",num );
        } 
        System.out.printf( "\n");
    }
     
    public static  void main(String[] args){
        int[] arr= {1, 3, 5, 7};
        int[] arr2={2, 4, 6, 8};
        sort2array(arr,arr2); 
        printArr(arr);
        printArr(arr2);
    }
}



