package com.Array.bicycle.store;
import com.Array.bicycle.data.SandleData;

public class SandleStore {
	
	private SandleData[] datas=new SandleData[5];
	private int index=0;
	
	
	public void save(SandleData data)
	{
		System.out.println("Created a SandleData");
		this.datas[this.index]=data;
		index++;
		
	}
	
	public void details()
	{
		System.out.println("Sandles details");
		for(SandleData data:this.datas)
		{
			if (data != null) {
				data.display();
				} else {
				System.out.println("Data is null");
				}
		}
	}
	
	
	
	
	

}
