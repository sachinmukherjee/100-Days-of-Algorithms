import java.io.*;

class GFG
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test>0)
		{
			String s = br.readLine();
			String ss[] = s.split(" ");

			int size = Integer.parseInt(ss[0]);
			int value = Integer.parseInt(ss[1]);
			String inp = br.readLine();
			String array[] = inp.split(" ");
			int input[] = new int[size];

			for(int i=0; i<size; i++)
			{
				input[i] = Integer.parseInt(array[i]);
			}

			int first =0;
			int last = 0;
			
			FirstLabel:
			for(int a=0; a<size; a++)
			{
				if(input[a] == value)
				{
					first = a;
					break FirstLabel;
				}
			}

			LastLabel:
			for(int b= size-1; b>=0; b--)
			{
				if(input[b] == value)
				{
					last = b;
					break LastLabel;
				}
			}
			if(first == 0 && last == 0)
				System.out.println(-1);
			else
				System.out.println(first+" "+last);





			test--;
		}
	}
}