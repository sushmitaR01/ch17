package com.Array.bicycles;
import com.Array.bicycle.store.SandleStore;
import com.Array.bicycle.data.SandleData;

public class SandleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SandleStore sandleStore=new SandleStore();
		sandleStore.details();
		
		
		SandleData SandleData1=new SandleData("Bata", 'M', 500, "Black");
		sandleStore.save(SandleData1);
		sandleStore.details();
		
		SandleData SandleData2=new SandleData("Crocs", 'L', 1000, "Grey");
		sandleStore.save(SandleData2);
		sandleStore.details();
		
		SandleData SandleData3=new SandleData("Woodland", 's', 5000, "Brown");
		sandleStore.save(SandleData3);
		sandleStore.details();
		
		SandleData SandleData4=new SandleData("Liberty", 'M', 800, "Pink");
		sandleStore.save(SandleData4);
		sandleStore.details();
		
		SandleData SandleData5=new SandleData("Nike", 'X', 1000, "Black");
		sandleStore.save(SandleData5);
		sandleStore.details();
		
		
		
		
		

	}

}
