import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] count = new int[256];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            count[c]++; 
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(count[c]==1){
                System.out.println(c);
                return;
            }
        }
    }
}
