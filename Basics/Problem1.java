import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
	


          
    
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test>0)
		{
			int size = Integer.parseInt(br.readLine());
			int queue1[] = new int[size];	// Positive
			int queue2[] = new int[size];	// Negetive
			int top1 = -1;
			int top2 = -1;
			int front1 = 0;
			int front2 = 0;

			String input = br.readLine();
			String inp[] = input.split(" ");
			int original[] = new int[size];

			for(int i=0; i<size; i++)
			{
				original[i] = Integer.parseInt(inp[i]);

			}

			for(int j=0; j<size; j++)
			{
				if(original[j]>0)
					queue1[++top1] = original[j];
				else 
				    queue2[++top2] = original[j];
			}


			for(int k=0; k<size; k=k+2)
			{
				original[k] = queue1[front1++];
			}

			for(int l=1; l<=size; l=l+2)
			{
				original[l] = queue2[front2++];
			}

			for(int a:original)
			{
				System.out.print(a);
				System.out.print(" ");
			}

			System.out.println( );





			test--;
		}
		
	}
}