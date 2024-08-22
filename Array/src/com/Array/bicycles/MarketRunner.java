package com.Array.bicycles;
import com.Array.bicycle.store.MarketStore;
import com.Array.bicycle.data.MarketData;

public class MarketRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarketStore marketStore=new MarketStore();
		marketStore.display();
		
		MarketData data1=new MarketData("Gandhi Bazaar", "Basavanagudi");
		marketStore.save(data1);
		marketStore.display();
		
		
		MarketData data2=new MarketData("K R Market", "Krishnarajendra Market");
		marketStore.save(data2);
		marketStore.display();
		
		
		MarketData data3=new MarketData("Chikkapete", " Electric Market");
		marketStore.save(data3);
		marketStore.display();
		
		
		MarketData data4=new MarketData("MG Road", "Near manipal hospital");
		marketStore.save(data4);
		marketStore.display();
		
		
		MarketData data5=new MarketData("Malleswaram Market", "Ring Road banglore");
		marketStore.save(data5);
		marketStore.display();
		

	}

}
