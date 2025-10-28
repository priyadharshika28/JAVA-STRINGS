import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    String[] str = new String[n];
		    for(int i=0;i<n;i++){
		        str[i] = sc.next();
		    }
		    int res = findprefix(str);
		    if(res==0){
		        System.out.println(-1);
		    }
		    else{
		        System.out.println(str[0].substring(0,res));
		    }
		}
	}
	public static int findprefix(String[] str){
		int res = 0;
		for(int i=0;i<str[0].length();i++){
		    for(int j=1;j<str.length;j++){
		        if(str[j].length()<=i){
		            return i;
		        }
		        if(str[0].charAt(i)!=str[j].charAt(i)){
		            return i;
		        }
		        else{
		            res++;
		        }
		    }
	    }
	    return res;
	}
}
