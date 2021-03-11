private static void checkString(String s)
	{
		String str ="I have 10 apples and 1 banana";
		List<String> list = Arrays.stream(str.split("\\s+")).collect(Collectors.toList());
		
		String ans ="";
		boolean isAlpha=false;
		for(String l : list)
		{
			int cnt=0;
			for(int i=0;i<l.length();i++)
			{
				if(l.charAt(i)>='0' && l.charAt(i)<='9') {
					cnt++;
					isAlpha= true;
				}
			}
			if(cnt>0) {
				 if(cnt==1)
					 ans+="0";
				 else
					 ans+="01";
				 ans+=" ";
				continue;
			}
			if(l.toLowerCase().charAt(0)=='a' || l.toLowerCase().charAt(0)=='e' || l.toLowerCase().charAt(0)=='i' ||
					l.toLowerCase().charAt(0)=='o' || l.toLowerCase().charAt(0)=='u')
			{
				ans+="$"+l.substring(1);
				ans+=" ";
			}
			else
			{
				ans+=l;
				ans+=" ";
			}
			
		}
		System.out.println(str);
		System.out.println(ans);
		if(!isAlpha)
			System.out.println("Not an alphanumaric");


	}
