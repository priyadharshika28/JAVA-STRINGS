import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int v = 0;
        int co = 0;
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isLetter(c)){
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    v++;
                }
                else{
                    co++;
                }
            }
        }
        System.out.println(v);
        System.out.println(co);
    }
}
