import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        LinkedHashMap<Character,Integer>map = new LinkedHashMap<>();
        for(char c: s.toCharArray()){
           map.put(c,map.getOrDefault(c,0)+1); 
        }
        for(Map.Entry<Character,Integer> res:map.entrySet()){
            if(res.getValue()==1){
                System.out.println(res.getKey());
                return;
            }
        }
    }
}
