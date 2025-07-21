import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        for(char c:s.toCharArray()){
            if(!set.add(c)){
                System.out.println("not unique");
                return;
            }
        }
        System.out.println("unique");
    }
}
