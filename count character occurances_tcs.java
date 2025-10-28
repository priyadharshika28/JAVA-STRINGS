import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-->0){
		    String s1 = sc.nextLine();
		    String s2 = sc.nextLine();
		    System.out.println(sumofocucurrences(s1,s2));
		}
	}
	public static int sumofocucurrences(String s1,String s2){
	    HashMap<Character,Integer> mp = new HashMap<>();
	    for(int i=0;i<s1.length();i++){
	        char key = s1.charAt(i);
	        if(mp.containsKey(key)){
	            int value = mp.get(key)+1;
	            mp.put(key,value);
	        }
	        else{
	            mp.put(key,1);
	        }
	    }
	    int res = 0;
	    for(int i=0;i<s2.length();i++){
	        if(mp.containsKey(s2.charAt(i))){
	            res+=mp.get(s2.charAt(i));
	            mp.put(s2.charAt(i),0);
	        }
	    }
	    return res;
	}
}

/*
3
helloworld
do
abacabadabacaba
abcd
abc
abcdabcdabcd
Your Output
3
15
3
*/
