package com.xworkz.collection.runner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;


public class Runner {

	public static void main(String[] args) {
		
		Predicate<String> pre = (String string) -> {
			System.out.println(string);
			return false;
		};
		boolean display = pre.test("Rain");
		System.out.println("Result : " + display);
		System.out.println("--------------");
		
		
		ObjDoubleConsumer<String> objDouble = (name, age) -> {
			System.out.println("Name : " + name);
			System.out.println("Experience :" + age);
		};
		objDouble.accept("nikhita", 22);
		System.out.println("---------------");
 
		Consumer<Boolean> consumer = (Boolean ) -> {
			System.out.println("Accept in Functional runner : " + b);
		};
		
		Function func = new FunctionalInt();
		func.isConsumer(consumer);
		System.out.println("---------------");

		
		BiConsumer<String, Integer> biConsumer = (brand, quantity) -> {
			System.out.println("Brand :" + brand + " , " + "Quantity :" + quantity);
		};
		func.display(biConsumer);
		System.out.println("---------------");

	
		Supplier<Boolean> supplier = () -> {
			System.out.println("Supplier invoked");
			return true;
		};
		Boolean ref = supplier.get();
		System.out.println("Supplier: " + ref);
		System.out.println("--------------");
		
		Function<Integer, String> function = (i) -> {
			System.out.println("Received: " + i);
			return String.valueOf(i);
		};
		String ref1 = function.apply(30);
		System.out.println("Result: " + ref1);
		System.out.println("---------------");

		
		BiFunction<Integer, Integer, String> biFun = (i, I) -> {
			System.out.println("Bi Function :" + i + " , " + I);
			return "Current Year";

		};
		String ref2 = biFun.apply(2023, 2024);
		System.out.println(ref2);
		System.out.println("---------------");

		
		BiPredicate<Double, Double> biPredicate = (d, D) -> {
			System.out.println(d);
			System.out.println(D);
			return false;
		};
		boolean r = biPredicate.test(6.2, 85.3);
		System.out.println("Same value : " + r);
		System.out.println("---------------");

		
		UnaryOperator<Long> unaryOperation = (mobileNo) -> {
			System.out.println(mobileNo);
			return 9952644296L;
		};
		Long mobile = unaryOperation.apply(9952644296L);
		System.out.println(mobile);
		System.out.println("---------------");


		BinaryOperator<Integer> binaryOperator = (a, b) -> {
			System.out.println(a);
			System.out.println(b);
			return 2;
		};
		int number = binaryOperator.apply(500, 550);
		System.out.println(number);
		System.out.println("---------------");

	
		IntConsumer consumer1 = (int value) -> {
			System.out.println("Accept in lambda runner : " + value);
		};
		func.isConsumer(consumer1);
		System.out.println("---------------");

		
		IntSupplier intSupplier = () -> {
			System.out.println("IntSupplier Method");
			return 50;
		};
		int value = intSupplier.getAsInt();
		System.out.println(value);
		System.out.println("---------------");

		
		IntFunction<String> intFunction = (val) -> {
			System.out.println("IntFunction method");
			String fun = "The value is: " + val;
			return fun;
		};
		System.out.println(intFunction.apply(10)); // Outputs: The value is: 10
		System.out.println("---------------");

		
		IntPredicate intPredicate = (int score) -> {
			System.out.println("intPredicte method");
			System.out.println(score);
			return true;
		};
		boolean check = intPredicate.test(800);
		System.out.println(check);
		System.out.println("---------------");

		
		IntUnaryOperator intUnary = (int operand) -> {
			System.out.println("IntUnaryOperator method");
			System.out.println(operand);
			return operand;
		};
		intUnary.applyAsInt(700);
		System.out.println("---------------");

		
		IntBinaryOperator intBinary = (left, right) -> {
			System.out.println("left value :" + left);
			System.out.println("right value :" + right);
			return left;
		};
		intBinary.applyAsInt(180, 140);
		System.out.println("---------------");

		
		LongConsumer longConsumer = (accountNo) -> {
			System.out.println("LongConsumer method");
			System.out.println("Account No: " + accountNo);
		};
		longConsumer.accept(987654321L);
		System.out.println("--------------");

		
		LongSupplier longSupplier = () -> {
			System.out.println("LongSupplier method");
			return 2435478997L;
		};
		longSupplier.getAsLong();
		System.out.println("---------------");

		
		LongFunction<String> longFunction = (population) -> {
			System.out.println("LongFunction method");
			System.out.println("Karnataka Population :" + population);
			return "Karnataka";
		};
		longFunction.apply(1567390050L);
		System.out.println("--------------");

		
		LongPredicate longPredicate = (store) -> {
			System.out.println("Long predicate method");
			System.out.println("Stored Data :" + store);
			return false;
		};
		longPredicate.test(690072949L);
		System.out.println("----------------");

		
		LongUnaryOperator longUnaryOperator = (phone) -> {
			System.out.println("PhoneNo: " + phone);
			return phone;
		};
		longUnaryOperator.applyAsLong(9905673421L);
		System.out.println("----------------");

		
		LongBinaryOperator longBinary = (binary, Binary) -> {
			System.out.println(binary);
			System.out.println(Binary);
			return binary;
		};
		longBinary.applyAsLong(9483776213L, 896675432L);
		System.out.println("-----------------");

		
		DoubleConsumer doubleConsumer = (price) -> {
			System.out.println("double Consumer method");
		};
		doubleConsumer.accept(1000);
		System.out.println("----------------");


		DoubleSupplier doubleSupplier = () -> {
			System.out.println("Double supplier method");
			return 1000;
		};
		doubleSupplier.getAsDouble();
		System.out.println("----------------");

		
		DoubleFunction<String> doubleFunction = value5 -> "Double value: " + value5;
		System.out.println(doubleFunction.apply(10.5));
		System.out.println("---------------");

	
		DoublePredicate doublePredicate = (double cost) -> {
			System.out.println(cost);
			return true;
		};
		doublePredicate.test(120);
		System.out.println("---------------");

		
		DoubleUnaryOperator doubleUnaryOperator = (operand) -> {
			System.out.println(operand);
			return 700;
		};
		doubleUnaryOperator.applyAsDouble(980);
		System.out.println("---------------");

		
		DoubleBinaryOperator doubleBinaryOperator = (a, b) -> a * b;
		System.out.println("DoubleBinaryOperator result: " + doubleBinaryOperator.applyAsDouble(2.0, 3.0));
		System.out.println("---------------");

		
		ToIntFunction<String> toIntFunction = str -> str.length();
		System.out.println("ToIntFunction length: " + toIntFunction.applyAsInt("Hiii"));
		System.out.println("---------------");

		
		ToDoubleFunction<String> toDoubleFunction = str -> str.length() * 1.0;
		System.out.println("ToDoubleFunction length: " + toDoubleFunction.applyAsDouble("Hiii"));
		System.out.println("---------------");

		
		ToLongFunction<String> toLongFunction = str -> str.length();
		System.out.println("ToLongFunction length: " + toLongFunction.applyAsLong("Hiii"));
		System.out.println("---------------");

		
		ToIntBiFunction<String, String> toIntBiFunction = (s1, s2) -> (s1 + s2).length();
		System.out.println("ToIntBiFunction combined length: " + toIntBiFunction.applyAsInt("Hiii", "Hello"));
		System.out.println("---------------");

		
		ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction = (a, b) -> (a + b) / 2.0;
		System.out.println("ToDoubleBiFunction average: " + toDoubleBiFunction.applyAsDouble(10, 20));
		System.out.println("---------------");

		
		ToLongBiFunction<Integer, Integer> toLongBiFunction = (a, b) -> a + b;
		System.out.println("ToLongBiFunction sum: " + toLongBiFunction.applyAsLong(10, 20));
		System.out.println("---------------");

		
		ObjIntConsumer<Integer> objInt = (size, quantity) -> {
			System.out.println("ObjIntConsumer method");
			System.out.println(size);
			System.out.println(quantity);
		};
		objInt.accept(5, 2);
		System.out.println("---------------");

		
		
		ObjLongConsumer<String> objLong = (name, mobileNumber) -> {
			System.out.println("Name :" + name);
			System.out.println("Mobile :" + mobileNumber);
		};
		objLong.accept("krishav", 7795876988L);
		System.out.println("----------------");

		
		IntToDoubleFunction intToDouble = (int currentYear) -> {
			System.out.println(currentYear);
			return currentYear;
		};
		intToDouble.applyAsDouble(2024);
		System.out.println("---------------");

		
		IntToLongFunction intToLong = (int pastYear) -> {
			System.out.println("Past Year :" + pastYear);
			return 9907865432L;
		};
		intToLong.applyAsLong(2023);
		System.out.println("----------------");

		
		DoubleToIntFunction doubleToInt = (double d) -> {
			System.out.println(d);
			return 4;
		};
		doubleToInt.applyAsInt(100);
		System.out.println("----------------");

		
		LongToIntFunction longToIntFunction = (assign) -> (int) assign;
		System.out.println("LongToIntFunction: " + longToIntFunction.applyAsInt(5000L));
		System.out.println("----------------");

		
		DoubleToLongFunction doubleToLongFunction = (toLong) -> (long) toLong;
		System.out.println("DoubleToLongFunction: " + doubleToLongFunction.applyAsLong(9.11));
		System.out.println("----------------");

		
		LongToDoubleFunction longToDoubleFunction = (toDouble) -> toDouble / 4.0;
		System.out.println("LongToDoubleFunction: " + longToDoubleFunction.applyAsDouble(20000L));
		System.out.println("----------------");

		

	}

}