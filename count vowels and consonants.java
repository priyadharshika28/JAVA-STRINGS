import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int v = 0;
        int co = 0;
        s = s.toLowerCase();
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                if("aeiou".indexOf(ch)!=-1){
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
