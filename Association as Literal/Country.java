class Country
{
	String name;
   String continent;
   State state=new State("Karnataka","Kannada");
   
   Country()
   {
	   System.out.println("Created a Country with no parm args");
   }
   Country(String name,String continent)
   {
	   this.name=name;
	   this.continent=continent;
   }
   public void display()
   {
	   System.out.println("Country name:"+name);
	   System.out.println("Country continent:"+continent);
	   state.display();
   }
}
