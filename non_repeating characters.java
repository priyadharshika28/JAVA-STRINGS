import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] count = new int[26];
        for(int i=0;i<s.length();i++){
            char c = Character.toLowerCase(s.charAt(i));
            if(c>='a' && c<='z'){
                count[c-'a']++;
            }
        }
        for(int i=0;i<s.length();i++){
            char c = Character.toLowerCase(s.charAt(i));
            if(c>='a' && c<='z' && count[c-'a']==1){
                System.out.print(s.charAt(i));
            }
        }
    }
}
