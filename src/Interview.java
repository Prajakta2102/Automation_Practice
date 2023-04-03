
public class Interview {

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		
	/*	int sum;
		//swapping logic
		sum=a;
		a=b;
		b=sum;
		System.out.println("a"+"="+a);
		System.out.println("b"+"="+b);*/
		
		//a=a+b-a;
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a"+"="+a);
		System.out.println("b"+"="+b);
		
		
int z[]= {1,4,5,7,3,7};
		for(int y=1;y<=z.length-1;y++)
		{
			int count=0;
		
		for(int i=1;i<=z[y];i++)
		{
		if(z[y]%i==0)
		{
			
		count++;
		}
		}
		if(count==2)
		{
			System.out.println(z[y]+"prime");	
		}
		
		}
		
		
	int	pre=0,next=1,c=1;//0,1,1,2,3...
	for(int i=0;i<10;i++)
	{
		//int sum=pre+next;
		pre=next;
		next=pre+next;
		//c=pre+next;
		System.out.println();
	}
	
	String s1="Java,select,Testng,Mavaen";
	 String s2[]=s1.split(",");
	for(int i=0;i<=s2.length-1;i++)
	{
	System.out.println(s2[i]);
	}

String Str1="aBC";
String str2="Xyz";
String str3="Pqr";

System.out.println("ABC"+"XYZ"+"PQR");

System.out.println(Str1.concat(str2).concat(str3));	
	}

}
       
         
