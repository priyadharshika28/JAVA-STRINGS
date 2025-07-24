import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] freq = new int[256];
        for(char c : s.toCharArray()){
            freq[c]++;
        }
        StringBuilder res = new StringBuilder();
        boolean[] visited = new boolean[256];
        for(char c : s.toCharArray()){
            if(!visited[c]){
                res.append(c).append(freq[c]);
                visited[c]=true;
            }
        }
        System.out.println(res.toString());
    }
}
