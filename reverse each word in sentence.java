import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder rev = new StringBuilder();
        String[] words = s.trim().split(" ");
        for(String word:words){
            char[] c = word.toCharArray();
            int l = 0;
            int r = word.length()-1;
            while(l<r){
                char temp = c[l];
                c[l] = c[r];
                c[r] = temp;
                l++;
                r--;
            }
            rev.append(new String(c)).append(" ");
        }
        System.out.println(rev.toString().trim());
    }
}
