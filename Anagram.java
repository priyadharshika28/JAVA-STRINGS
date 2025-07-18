import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int[] count = new int[26];
        if(s1.length()!=s2.length()){
            System.out.println("not anagaram");
            return;
        }
        for(int i=0;i<s1.length();i++){
            char c1 = Character.toLowerCase(s1.charAt(i));
            char c2 = Character.toLowerCase(s2.charAt(i));
            count[c1-'a']++;
            count[c2-'a']--;
        }
        for(int i=0;i<26;i++){
            if(count[i]!=0){
                System.out.println("not anagram");
                return;
            }
        }
        System.out.println("anagram");
    }
}
