package com.Array.bicycles;
import com.Array.bicycle.data.SideDishData;
import com.Array.bicycle.store.SideDishStore;
public class SideDishRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SideDishStore sideDishStore=new SideDishStore();
		sideDishStore.display();
		
		
		SideDishData data1=new SideDishData("Gobi", 100, "Veg");
		sideDishStore.save(data1);
		sideDishStore.display();
		
		SideDishData data2=new SideDishData("Papad", 50, "Veg");
		sideDishStore.save(data2);
		sideDishStore.display();
		
		SideDishData data3=new SideDishData("Corn pizza", 200, "Veg");
		sideDishStore.save(data3);
		sideDishStore.display();
		
		SideDishData data4=new SideDishData("Kabab", 250, "Non Veg");
		sideDishStore.save(data4);
		sideDishStore.display();
		
		SideDishData data5=new SideDishData("Leg piece", 3500, "Non Veg");
		sideDishStore.save(data5);
		sideDishStore.display();
		
	}

}
