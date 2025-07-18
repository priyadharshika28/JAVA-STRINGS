import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        HashSet<Character> set = new HashSet<>();
        for(char c:s.toCharArray()){
            if(c>='a' && c<='z')
            set.add(c);
        }
        if(set.size()==26){
            System.out.println("panagram");
        }
        else{
            System.out.println("not");
        }
    }
}
