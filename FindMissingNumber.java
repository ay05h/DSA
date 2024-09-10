public class FindMissingNumber{
    // Below code use Arthematic sum of N number logic to find the missing number 
    public static int missingNumber1(int[] arr){
        int arrSum=0,count=1;
        for(int num : arr){
            arrSum+=num;
            count++;
        }
        return (count*(count+1))/2 - arrSum;
    }

    // Below code use Bit manupilation to find the missing value 
    public static int missingNumber2(int[] arr){
        int len=arr.length;
        int num=len+1;
        int arrXor=0;
        for(int i=0 ;i<len;i++){
            num^=i+1;
            arrXor^=arr[i];
        }
        return arrXor^num;
    }
    
    
    public static  void main(String[] args){
        int[] arr={2};
        int ans =missingNumber1(arr);
        System.out.printf("The missing number is : %d .",ans);
        
        
    }
}
