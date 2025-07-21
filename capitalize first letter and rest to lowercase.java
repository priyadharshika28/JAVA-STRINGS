import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.trim().split(" ");
        StringBuilder res = new StringBuilder();
        for(String word : words){
            if(!word.isEmpty()){
                res.append(Character.toUpperCase(word.charAt(0)));
                if(word.length()>1){
                    res.append(word.substring(1).toLowerCase());
                }
                res.append(" ");
            }
        }
        System.out.println(res.toString().trim());
    }
}
