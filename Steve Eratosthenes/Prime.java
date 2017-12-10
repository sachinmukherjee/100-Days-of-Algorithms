// Used for Prime Number Generation upto a ceratin number //

import java.io.*;

class Prime
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());

		boolean prime[] = new boolean[number+1];

		// first mark all as prime
		for(int i=0; i<number; i++)
			prime[i] = true;

		// check square root of a number is smaller than original number given by user
		for(int p = 2; p*p <= number; p++)
		{
			if(prime[p] == true)		// if that number is marked as prime then
			{
				for(int j = p*2; j <= number; j = j+p)		// marked all the number than are multiple of that number as not prime
				{
					prime[j] = false;
				}
			}
		}

		for(int a=2; a<=number; a++)
		{
			if(prime[a] == true)
				System.out.println(a);
		}
	}
}