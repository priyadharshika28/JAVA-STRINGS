import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        String small = words[0];
        for(String word:words){
            if(word.length()<small.length()){
                small = word;
            }
        }
        System.out.println(small);
    }
}
