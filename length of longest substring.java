import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int res = longestsubstringlen(s);
        System.out.println(res);
    }
    public static int longestsubstringlen(String s){
        HashSet<Character> set = new HashSet<>();
        int left =0;
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            maxlen = Math.max(maxlen,i-left+1);
        }
        return maxlen;
    }
}
