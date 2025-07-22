import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder rev = new StringBuilder(s);
        rev.reverse();
        System.out.println(rev.toString());
    }
}
