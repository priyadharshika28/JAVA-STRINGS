import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String snake = sc.nextLine();
        String camel = snaketocamel(snake);
        System.out.println(camel);
    }
    public static String snaketocamel(String snake){
        StringBuilder sb = new StringBuilder();
        boolean nextupper = false;
        for(char c : snake.toCharArray()){
            if(c == '_'){
                nextupper = true;
            }
            else{
                if(nextupper){
                    sb.append(Character.toUpperCase(c));
                    nextupper = false;
                }else{
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
