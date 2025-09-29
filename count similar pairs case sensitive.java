import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(countpairs(str));
    }
    public static int countpairs(String str){
        int count = 0;
        for(int i=0;i<str.length()-1;i++){
            char c1 = str.charAt(i);
            char c2 = str.charAt(i+1);
            if(Character.toLowerCase(c1) == Character.toLowerCase(c2)){
                if((Character.isLowerCase(c1))&&(Character.isUpperCase(c2)) || (Character.isUpperCase(c1))&&(Character.isLowerCase(c2))){
                    count++;
                }
            }
        }
        return count;
    }
}
