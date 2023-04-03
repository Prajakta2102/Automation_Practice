
public class Interview2 



{

	


	public static void main(String[] args)
	{
		//1.max no n min in array
	/*	int a[]= {3,2,5,8,4};//0,1,2,3,4
		int max=a[0],min=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);*/
		
	/*	for(int i=0;i<=a.length-1;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println(min);
*/
		
		
		//2.reverse of array
		/*int a[]= {1,2,3,4,5};
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}*/
		
		
			
		
		//3.duplicate no in array
		/*int a[]= {1,4,5,4,6,6,1,8,3,3};
		int count=0;
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					System.out.print(a[j]+" ");
				}
			}
		}
		*/
		
		//4.ascending and descending
		
	/*	int a[]= {2,1,9,5,44,3},i;
		
		for(  i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]>a[j])
				{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
				//System.out.print(a[i]+" ");
				}
			}
			System.out.print(a[i]+" ");
		}
		System.out.print(a[i-2]);
		System.out.println();
		/*for(  i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]<a[j])
				{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
				//System.out.print(a[i]+" ");
				}
			}
			System.out.print(a[i]+" ");
		}
		System.out.print(a[i-2]);*/
		

		//5.reverse the String
		/*String s="prajakta";
		for(int i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			System.out.print(c);
		}*/
		
		
		//int count=0;
		
		
		//System.out.print(count);
		//6.find the duplicate chr starting string
		
	/*String s[]= {"mango","orange","banana","oak"};
	for(int i=0;i<=s.length-1;i++)
	{
		if(s[i].charAt(0)=='o')
		{
			System.out.println(s[i]);
		}
		
	}*/
		
		//7.find the duplicate string
		/*String s[]= {"mango","peach","mango","banana","banana"};
		for(int i=0;i<=s.length-1;i++)
		{
			for(int j=i+1;j<=s.length-1;j++)
			{
				if(s[i]==s[j])
				{
					System.out.println(s[j]);
				}
			}
		}*/
		
		//8.String is palidrome or not
		/*String s="madam";
		String temp="";
		for(int i=s.length()-1;i>=0;i--)
		{
			temp=temp+s.charAt(i);
			
		}
		if(s.equals(temp))
		{
			System.out.println("palidrome");
		}
		*/
		
		//9.no is palidrome
		/*int n=141;
		int rem,sum=0,temp;
		temp=n;
		while(n>0)
		{
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
			
		}
		if(sum==temp)
		{
			System.out.println("palindrome");
		}*/
		
		
		//10.febonnaci series
	/*	int pre=0,next=1;
		int sum;
		for(int i=1;i<=10;i++)//0 1 1 2 3
		{
			
			
			 sum=pre+next;
			pre=next;
			next=sum;
			
			System.out.println(sum);
		}*/
	
		
		//11.armstrong no
		
	/*	int n=153,sum=0,rem,temp=n;
		while(n>0)
		{
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n/=10;
			
		}
		if(sum==temp)
		{
			System.out.println("armstrong");
		}
		*/
		
		// 12.convert string into single word.
		/*String s=" i am robot";
		String a[]=s.split(" ");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
			
		}*/
		
		
		//13.count total of char in string
		/*String s=" i am robot";
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)!=' ')
			{
				count++;
				
			}
			
		}
		System.out.println(count);
		*/
		
		//14.reverse string at its place.
	/*	String s=" i am robot";
		String a[]=s.split(" ");
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=a[i].length()-1;j>=0;j--)
			{
				String v=a[i];
				a[i].charAt(j);
				System.out.print(v.charAt(j)+" ");
			}
			
		}*/
		
		
		//15.count no of vowel in string.
		/*String s=" i am robot";
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o'))
		
			{
				count++;
				System.out.print(s.charAt(i)+" ");
			}
		}
	    System.out.println(count);
	
	*/
	//16 prime no from array
		
		/*int n[]= {1,3,4,6,75,9,7,5,73};
		int j;
	 for(j=0;j<=n.length-1;j++)
	 {
		 int count=0;
		for(int i=1;i<=n[j];i++)
		{
			if(n[j]%i==0)
			{
				count++;
			}
		}
		if(count==2)
	    {
	    	System.out.println(n[j]);
	    }
	}*/
		//17.prime no

		/*	int n=7,count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
	    if(count==2)
	    {
	    	System.out.println("prime");
	    }*/
		
		//18.odd or  even
		
	/*	int n;
		for(int i=0;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" " +"even");
			}
			else
			{
				System.out.println(i+" "+"odd");
			}
		}*/
		
		
		//19.odd/even from array
		
		/*int n[]= {1,4,3,6,8,67,3,5};
		for(int j=0;j<=n.length-1;j++)
		{
		
		
			if(n[j]%2==0)
			{
				System.out.println(n[j]+" " +"even");
			}
			else
			{
				System.out.println(n[j]+" "+"odd");
			}
		}*/
		
		//20.diamond pattern
		/*	int n=5;
		for(int i=1;i<n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
				
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
				
			}
			for(int k=n;k>=i;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		
		//21.right angle triangle quandrant 1 st n 4th
		
		/*int n=5;
		for(int i=1;i<=n;i++)
		{
		  for(int j=1;j<=i;j++)
		 {
			  System.out.print("*");
		 }
		System.out.println();
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--) 
			{
				System.out.print("*");
			}
			System.out.println(" ");
		 }
		*/
		
		//22.floyed triangle
		/*int n=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(n++);
				
			}
			System.out.println();
		}*/
	/*	for(int i=1;i<=4;i++)
		{
		for(int j=1;j<=i;j++)
		{
		System.out.print(j);
		}
		System.out.println();
		} 
		*/ 
		////23.swapping without 3rd var
	/*	int pre=0,nex=1;
		for(int p=0;p<=10;p++)
		{
		//	0,1,1,2,,3,0+1=1
			pre=nex-pre;
			nex=pre+nex;
			System.out.println(nex);
		}*/
		//22.reverse array without using String function
		/*String s="mdmrgjjf";
		char ch[]=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		*/
		
		//23
		//String = "AaBbCcDD" ,In that change a lowercase ‘a’ to uppercase

	    String s="AaBbCcDD";
	   //String c[]=s.split("Aa");
	    String x="";
	   
	     for(int i=0;i<=s.length()-1;i++)
	     {
	    	 char ch = s.charAt(1);
	         if (Character.isUpperCase(ch))
	           x += Character.toLowerCase(ch);
	         else
	             x += Character.toUpperCase(1);
	    	
	     }
	     System.out.print(x);
	
	}
	
	
}


	 
	   
	  
	

	




