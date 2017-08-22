import java.io.*;

class GFG
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());

		while(test>0)
		{
			String input = br.readLine();
			String inp[] = input.split(" ");
			int n = Integer.parseInt(inp[0]);
			int m = Integer.parseInt(inp[1]);
			int i =1;
			int j = -1;

			// Considereing positive case
			if(n>0)
			{
				if(n%m==0)
					System.out.println(n);
				else
				{
					i = 1;
					while(true)
					{
						i = n+i;
						if(i%m==0)
							break;
						else
							i++;
					}
					while(true)
					{
						j = n-j;
						if(j%m==0)
							break;
						else
							j--;
					}
					if()
				}

			}

			test--;
		}

	}
}