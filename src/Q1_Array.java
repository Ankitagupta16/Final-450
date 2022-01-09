import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1_Array
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            new Reverse();
			System.out.println(Reverse.reverseWord(str));
        }
    }
}

class Reverse
{
    public static String reverseWord(String str)
    {
    	 int n = str.length();
         char ch[] = str.toCharArray();
         for(int i=0 ; i<n/2 ; i++){
             char t = ch[i];
             ch[i] = ch[n-i-1];
             ch[n-i-1] = t;
         }
         return new String(ch);
    }
}