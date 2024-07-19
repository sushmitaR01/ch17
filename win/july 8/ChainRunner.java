class ChainRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in ChainRunner");
		String carat=Chain.carat();
		System.out.println("carat return type:"+carat);
		
		double cost1pergram=Chain.costpergram();
		System.out.println("cost1pergram return type:"+cost1pergram);
		
		String typeofgold=Chain.type();
		System.out.println("typeofgold return type:"+typeofgold);
		
		String qualityofgold=Chain.quality();
		System.out.println("qualityofgold return type:"+qualityofgold);
		
		int quantity=Chain.quantity();
		System.out.println("quantity return type:"+quantity);
		
		String wastageofgold=Chain.wastage();
		System.out.println("wastageofgold return type:"+wastageofgold);
		
		
		String serviceCharge=Chain.serviceCharge();
		System.out.println("serviceCharge return type:"+serviceCharge);
		
		
		String GST=Chain.GST();
		System.out.println("GST return type:"+GST);
		
	}
}
		
		
		