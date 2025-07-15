import java.util.Scanner;
import java.util.LinkedHashSet;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer res = new StringBuffer();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(char ch:s.toCharArray()){
            set.add(ch);
        }
        for(char ch : set){
            res.append(ch);
        }
        System.out.println(res);
    }
}
