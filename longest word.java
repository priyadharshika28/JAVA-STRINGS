import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        String longest = "";
        for(String word:words){
            if(word.length()>longest.length()){
                longest = word;
            }
        }
        System.out.println(longest);
    }
}
