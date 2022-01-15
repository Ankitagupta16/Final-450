import java.util.HashSet;

// Union of 2 arrays

public class Q6_Array {
	public static void main(String[] args)
	{
	    int a[] = { 1, 2, 5, 6, 2, 3, 5, 7, 3 }; 
	    int b[] = { 2, 4, 5, 6, 8, 9, 4, 6, 5, 4 }; 

	    doUnion(a, 9, b, 10); 
	}


    public static void doUnion(int a[], int n, int b[], int m) 
    {
       
        //Set stores only unique data
    	HashSet<Integer> set = new HashSet<>();
    	
    	for(int x:a)
    		set.add(x);
    	for(int x:b)
    		set.add(x);
    	
    	System.out.println(set.toString());
    }
} 