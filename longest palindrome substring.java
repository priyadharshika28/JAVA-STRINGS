import java.util.*;
class Main{
    static String longestpalindrome(String s){
        String res = "";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub = s.substring(i,j+1);
                if(ispalindrome(sub) && sub.length()>res.length()){
                    res = sub;
                }
            }
        }
        return res;
    }
    static boolean ispalindrome(String s){
        return new StringBuilder(s).reverse().toString().equals(s);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(longestpalindrome(s));
    }
}
