import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder rev = new StringBuilder();
        String[] words = s.trim().split(" ");
        for(int i = words.length-1;i>=0;i--){
            rev.append(words[i]).append(" ");
        }
        System.out.print(rev.toString());
    }
}
