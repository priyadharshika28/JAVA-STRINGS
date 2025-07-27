import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        Map<String, List<String>> map = new HashMap<>();
        for(String word : words){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sort = new String(ch);
            map.computeIfAbsent(sort,k->new ArrayList<>()).add(word);
        }
        for(List<String> group : map.values()){
            System.out.println(group);
        }
    }
}
