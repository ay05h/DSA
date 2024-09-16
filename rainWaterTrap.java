public class rainWaterTrap{
    public static int trap(int[] height) {
        if (height==null||height.length==0) return 0;    
        int low=0, high=height.length - 1,totalWater=0;
        int lmax=height[low], hmax=height[high]; 
        while (low<high) {
            if(lmax<hmax) {
                low++;
                lmax=Math.max(lmax, height[low]);
                totalWater+=lmax-height[low];
            } 
            else{
                high--;
                hmax=Math.max(hmax,height[high]);
                totalWater+=hmax-height[high];
            }
        }
            
        return totalWater;
    }
    
        
    
    
     
    public static  void main(String[] args){
        int[] arr= {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.printf("total Water  : " +trap(arr) );
    }
}



