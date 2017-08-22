// Infix to Postfix conversion
// http://practice.geeksforgeeks.org/problems/infix-to-postfix/0
// created by Sachin Mukherjee

import java.io.*;

class Stack
{
	int size;
	int stackarray[] = new int[size];
	int top ;

	Stack(int top, size)
	{
		this.top = top;
		this.size = size;

	}

	void push(int data)
	{
		stackarray[++top] = data;
	}

	int pop()
	{
		return stackarray[top--];
	}

	boolean isEmpty()
	{
		return top== size -1;
	}
}

class GFG
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
	}
}