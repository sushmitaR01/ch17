package com.xworks.research.examples;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Certificate {
	
	public static void main(String[] args) {
		
	        String fileName = "C:\\Users\\sushm\\eclipse-workspace\\RND\\src\\com\\xworks\\research\\examples\\details.txt";
	        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                System.out.println(line); // Print each line of the file to the console
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}