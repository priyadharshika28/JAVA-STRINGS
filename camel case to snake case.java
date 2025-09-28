import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String camel = sc.nextLine();
        String snake = cameltosnake(camel);
        System.out.println(snake);
    }
    public static String cameltosnake(String camel){
        StringBuilder snake = new StringBuilder();
        for(char c:camel.toCharArray()){
            if(Character.isUpperCase(c)){
                snake.append("_").append(Character.toLowerCase(c));
            }
            else{
                snake.append(c);
            }
        }
        return snake.toString();
    }
}
