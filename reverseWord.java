public class reverseWord{
    public static String reverseWordOfString(String s) {
        String ans="";
        int high=s.length();
        int pointer=high - 1;
        while(pointer> 0) {
            if (s.charAt(pointer) == ' ') {
                ans +=s.substring(pointer+1,high)+" ";
                high = pointer;
            }
            pointer--;
        }
        ans+=s.substring(0, high);
        return ans;
    }
    public static  void main(String[] args){
        String s="My name is Ayush";
        System.out.printf("Reversed String is :%s ", reverseWordOfString(s));
    }
}



