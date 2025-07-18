import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean[] count = new boolean[26];
        for(char c : s.toCharArray()){
            if(c>='a' && c<='z'){
                count[c-'a']=true;
            }
        }
        for(boolean res:count){
            if(!res){
                System.out.println("not panagram");
                return;
            }   
        }
        System.out.println("panagram");
    }
}
