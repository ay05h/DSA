import java.util.ArrayList;
public class findLeader{
    //Below code will solve the problem in Time complexity of O(n)
    public static ArrayList<Integer> leader(int[] nums){
        ArrayList<Integer> ans=new  ArrayList<>(); // Used ArrayList to store the leaders as the size is dynamic 
        int lenNums=nums.length -1;
        if(lenNums<0) return ans;
        int maxNum=nums[lenNums];
        ans.add(maxNum);
        if(lenNums==0) return ans;
        for(int i=lenNums-1;i>=0;i--){
            if(maxNum < nums[i]){
                maxNum=nums[i];
                ans.add(maxNum);
            }
        }
        int low=0,high=ans.size()-1; // All inbuilt functions are avoided accept the necessary once
        while(low<high){
            int temp = ans.get(low);
            ans.set(low, ans.get(high));
            ans.set(high, temp);
            low++;
            high--;
        }
        return ans;
    }

     
    public static  void main(String[] args){
        int[] arr= {};
        System.out.printf("Leaders : " +leader(arr) );
    }
}



