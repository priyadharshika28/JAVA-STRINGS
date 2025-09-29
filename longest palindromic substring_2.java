import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(longestpalindromesubstring(s));
    }
    public static String longestpalindromesubstring(String s){
        if(s==null || s.length()<1){
            return "";
        }
        String longest = "";
        for(int i=0;i<s.length();i++){
            String p1 = expandfromcenter(s,i,i);
            String p2 = expandfromcenter(s,i,i+1);
            if(p1.length()>longest.length()){
                longest = p1;
            }
            if(p2.length()>longest.length()){
                longest = p2;
            }
        }
        return longest;
    }
    public static String expandfromcenter(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
}
