
class string{
	public static void main(String[]args)
	{
		String s="NOSHIN";
		String s1="";
		int ascii;
		
	for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90)
			{
				ascii=s.charAt(i)+32;
				s1=s1+(char)ascii;
			}
		}
		
		System.out.println(s1);
	}
}
    