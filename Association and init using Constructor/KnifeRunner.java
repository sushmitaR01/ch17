class KnifeRunner
{
	public static void main(String[] args)
	{
		Knife knife=new Knife(2,7);
		Ananya ananya=new Ananya(9972462345l,knife);
		ananya.details();
		
		System.out.println("=====================================================");
		
		Knife knife1=new Knife(6,9);
		Ananya ananya1=new Ananya(7259462345l,knife1);
		ananya1.details();
	}
}
