import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String words[] = s.trim().split(" ");
        int maxlen = 0;
        LinkedHashSet<String> longestword = new LinkedHashSet<>();
        for(String word:words){
            if(word.length()>maxlen){
                maxlen = word.length();
                longestword.clear();
                longestword.add(word);
            }
            else if(word.length()==maxlen){
                longestword.add(word);
            }
        }
        System.out.println(longestword);
    }
}
