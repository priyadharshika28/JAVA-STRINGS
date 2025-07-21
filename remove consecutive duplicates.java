import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i==0||s.charAt(i)!=s.charAt(i-1)){
                res.append(s.charAt(i));
            }
        }
        System.out.println(res.toString());
    }
}
