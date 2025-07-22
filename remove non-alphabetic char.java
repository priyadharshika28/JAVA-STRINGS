import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder res = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                res.append(c);
            }
        }
        System.out.println(res.toString());
    }
}
