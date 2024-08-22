package com.Array.bicycle.store;
import com.Array.bicycle.data.SideDishData;

public class SideDishStore {
	
	private SideDishData[] datas = new SideDishData[5];
	private int index=0;
	
	public void save(SideDishData data)
	{
		System.out.println("Create a Side Dish..............");
		this.datas[this.index]=data;
		index++;
		
	}
	
	public void display()
	{
		System.out.println("Side dish display..............");
		for(SideDishData data:datas)
		{
			if(data!=null) {
				data.shows();
			}
			else {
				System.out.println("Data is null");
			}
		}
	}
	

}
