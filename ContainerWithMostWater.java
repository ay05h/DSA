class ContainerWithMostWater {
    public static  int maxAreaFound(int[] height) {
        int maxArea=0;
        int left =0, right= height.length-1;
        while(left<right){
            int area=Math.min(height[left],height[right]);
            area*=(right-left);
            maxArea=Math.max(maxArea,area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
  public static void main(String args[]){
    int arr={1,8,6,2,5,4,8,3,7};
    int ans=maxAreaFound(arr);
    System.out.println("The maximun water can be stored :"+ans);
}
