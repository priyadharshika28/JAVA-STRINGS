import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.trim().split(" ");
        int minlen = Integer.MAX_VALUE;
        LinkedHashSet<String> smallword = new LinkedHashSet<>();
        for(String word:words){
            if(word.length()<minlen){
                minlen = word.length();
                smallword.clear();
                smallword.add(word);
            }
            else if(word.length()==minlen){
                smallword.add(word);
            }
        }
        for(String word : smallword){
            System.out.print(word+" ");
        }
    }
}
