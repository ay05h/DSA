public class FindDuplicates{
    public static int findDuplicate(int[] arr){
        if(arr.length<2) {
            System.out.println("Either no duplicates are present in thr array or enterd array is empty .");
            return -1;
        }
        int pointer1=arr[0], pointer2=arr[0];
        do {
            pointer1=arr[pointer1]; 
            pointer2= arr[arr[pointer2]]; 
        }while(pointer1!=pointer2);
        pointer1=arr[0]; 
        while (pointer1!= pointer2) {
            pointer1 =arr[pointer1]; 
            pointer2 =arr[pointer2]; 
        }
        return pointer2;
    }
     
    public static  void main(String[] args){
        int[] arr={1,1};
        int ans =findDuplicate(arr);
        System.out.printf("The duplicate values in the given array is/are  : %d .",ans);
        
        
    }
}
