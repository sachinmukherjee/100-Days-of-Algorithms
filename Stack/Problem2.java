// Evaluation of Post fix Expression
// http://practice.geeksforgeeks.org/problems/evaluation-of-postfix-expression/0
// Created by sachin mukherjee

import java.io.*;

class Stack
{
	int size;
	int stackarray[];
	int top;

	Stack(int size)
	{
		stackarray = new int[size];
		top = -1;
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
		return top == size-1;
	}
}
class GFG
{
	public static void main(String[] args)  throws IOException
  {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int test = Integer.parseInt(br.readLine());
	while(test>0)
	{
		int num1, num2, answer;
		String input = br.readLine();
		int len = input.length();
		Stack thestack = new Stack(len);
		for(int i=0; i<len; i++)
		{

			char ch = input.charAt(i);
			if(ch>= '0' && ch<= '9')
			{
				thestack.push((int) (ch-'0'));
			}
			else
			{
				num2 = thestack.pop();
				num1 = thestack.pop();

				switch(ch)
				{
					case '+':
					{
						answer = num1 + num2;
						break;
					}
					case '-':
					{
						answer = num1-num2;
						break;
					}
					case '*':
					{
						answer = num1 * num2;
						break;
					}
					case '/':
					{
						answer = num1 / num2;
						break;
					}
					default:
					answer = 0;

				}
				thestack.push(answer);

			}
		} 
		int finalAnswer = thestack.pop();
		System.out.println(finalAnswer);




		test--;
	}
  }
}