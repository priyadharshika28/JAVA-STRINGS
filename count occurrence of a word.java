import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        String res = sc.nextLine().toLowerCase();
        String[] words = s.trim().split(" ");
        int count = 0;
        for(String word : words){
            if(word.equals(res)){
                count++;
            }
        }
        System.out.println(count);
    }
}
