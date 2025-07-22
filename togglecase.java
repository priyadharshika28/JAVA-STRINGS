import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isUpperCase(c)){
                sb.append(Character.toLowerCase(c));
            }
            else if(Character.isLowerCase(c)){
                sb.append(Character.toUpperCase(c));
            }
            else{
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
