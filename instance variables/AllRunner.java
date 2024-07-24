class AllRunner {
	
    public static void main(String[] args) {
  
        Matrimony matrimony = new Matrimony();
        matrimony.name = "John Doe";
        matrimony.age = 30;
        matrimony.isMarried = false;
        System.out.println("Updated Matrimony Name: " + matrimony.name);
        System.out.println("Updated Matrimony Age:"+matrimony.age);
		System.out.println("Updated Matrimony isMarried:"+matrimony.isMarried);
		
		System.out.println("=============================================================");		
		
        Application application = new Application();
        application.appName = "ChatGPT";
        application.version = "1.0";
        application.isRunning = true;
        System.out.println("Updated Application Name: " + application.appName);
        System.out.println("Updated Application version:"+application.version);
		System.out.println("Updated Application Running:"+application.isRunning);
		
        
		System.out.println("=============================================================");		


        Fruit fruit = new Fruit();
        fruit.fruitName = "Apple";
        fruit.weight = 150.5;
        fruit.isRipe = true;
        System.out.println("Updated Fruit Name: " + fruit.fruitName + ", " + fruit.weight + ", " + fruit.isRipe);
        System.out.println("Updated Fruit Weight: " +fruit.weight);
		System.out.println("Updated Fruit isRipe: " +fruit.isRipe);
		
		
		System.out.println("=============================================================");
		
		
        Juice juice = new Juice();
        juice.juiceName = "Orange Juice";
        juice.volume = 250.0;
        juice.isFresh = true;
        System.out.println("Updated Juice Name: " + juice.juiceName);
		System.out.println("Updated Juice Volume: " +juice.volume);
		System.out.println("Updated Juice isFresh: " +juice.isFresh);

        
		System.out.println("=============================================================");
		
		
		
		Place place = new Place();
        place.placeName = "Paris";
        place.country = "France";
        place.isTouristSpot = true;
        System.out.println("Updated Place Name: " + place.placeName + ", " + place.country + ", " + place.isTouristSpot);
		System.out.println("Updated Place Country: " +place.country);
		System.out.println("Updated Place isTouristSpot: " +place.isTouristSpot);
		
		
        System.out.println("=============================================================");
		
		
		
        AlcoholBrand alcoholBrand = new AlcoholBrand();
        alcoholBrand.brandName = "Jack Daniel's";
        alcoholBrand.alcoholPercentage = 40.0;
        alcoholBrand.isAvailable = true;
        System.out.println("Updated AlcoholBrand Name: " + alcoholBrand.brandName);
		System.out.println("Updated AlcoholBrand alcoholPercentage: " +alcoholBrand.alcoholPercentage);
		System.out.println("Updated AlcoholBrand isAvailable: " +alcoholBrand.isAvailable);
		
		
        System.out.println("=============================================================");
        
		
		Candy candy = new Candy();
        candy.candyName = "Skittles";
        candy.price = 1.5;
        candy.isSweet = true;
        System.out.println("Updated Candy Name: " + candy.candyName);
		System.out.println("Updated Candy price: " +candy.price);
		System.out.println("Updated Candy isSweet: " +candy.isSweet);
		

        System.out.println("=============================================================");
		
		
		Medicine medicine = new Medicine();
        medicine.medicineName = "Paracetamol";
        medicine.dosage = 500;
        medicine.isPrescriptionRequired = false;
        System.out.println("Updated Medicine Name: " + medicine.medicineName);
		System.out.println("Updated Medicine dosage: " +medicine.dosage);
		System.out.println("Updated MedicineisPrescriptionRequired: " +medicine.isPrescriptionRequired);
		
		
        System.out.println("=============================================================");
		
		
		
        Food food = new Food();
        food.foodName = "Pasta";
        food.calories = 300;
        food.isVegetarian = true;
        System.out.println("Updated Food Name: " + food.foodName);
		System.out.println("Updated Food calories: " +food.calories);
		System.out.println("Updated Food isVegetarian: " +food.isVegetarian);
    }
}