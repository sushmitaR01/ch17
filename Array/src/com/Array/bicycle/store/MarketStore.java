package com.Array.bicycle.store;
import com.Array.bicycle.data.MarketData;

public class MarketStore {
	
	private MarketData[] datas =new MarketData[5];
	private int index=0;
	
	public void save(MarketData data)
	{
		System.out.println("Created a Market ");
		this.datas[this.index]=data;
		index++;
		
	}
	
	public void display() {
		System.out.println("Dispaly info..........");
		for(MarketData data:datas)
		{
			if(data!=null)
			{
				data.show();
			}
			else {
				System.out.println("data is null");
			}
		}
	}

}
