class CountryRunner
{
	public static void main(String[] args)
	
	{
		System.out.println("main is running in CountryRunner");
		
		String[] statesNames={"Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh"};
		Country.states(statesNames);
		System.out.println("================================================");
		
		String[] statesNamesBackward={"Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh"};
		Country.statesBackward(statesNamesBackward);
		System.out.println("================================================");
		
		
		
		
	    int[] pincodeNo={560002, 560061, 560020, 560020,560091,587124 ,587124 ,560025,560018,560040};
		Country.pincode(pincodeNo);
		System.out.println("================================================");
		
		
		 int[] pincodeNopincodeNoBackward={560002, 560061, 560020, 560020,560091,587124 ,587124 ,560025,560018,560040};
		Country.pincodeBackward(pincodeNopincodeNoBackward);
		System.out.println("================================================");
		
		
		
			
		String[] primeministerName={"Jawaharlal Nehru","Gulzarilal Nanda","Lal Bahadur Shastri","Gulzarilal Nanda","Indira Gandhi","Morarji Desai","Charan Singh","Indira Gandhi","Rajiv Gandhi","Vishwanath Pratap Singh","Chandra Shekhar","P. V. Narasimha Rao","Atal Bihari Vajpayee","H. D. Deve Gowda","I. K. Gujral","Atal Bihari Vajpayee","Manmohan Singh","Narendra Modi"};
		Country.primeminister(primeministerName);
		System.out.println("================================================");
		
		
		String[] primeministerNameBackward={"Jawaharlal Nehru","Gulzarilal Nanda","Lal Bahadur Shastri","Gulzarilal Nanda","Indira Gandhi","Morarji Desai","Charan Singh","Indira Gandhi","Rajiv Gandhi","Vishwanath Pratap Singh","Chandra Shekhar","P. V. Narasimha Rao","Atal Bihari Vajpayee","H. D. Deve Gowda","I. K. Gujral","Atal Bihari Vajpayee","Manmohan Singh","Narendra Modi"};
		Country.primeministerBackward(primeministerNameBackward);
		System.out.println("================================================");
		
		
		
		
		String[] CabinetMinistersNames={"Narendra Modi","Rajnath Singh","Amit Shah","Nirmala Sitharaman","S. Jaishankar","Nitin Gadkari" ,"Piyush Goyal","Dharmendra Pradhan","Smriti Irani" ,"Pralhad Joshi","Arjun Munda","Narendra Singh Tomar","Gajendra Singh Shekhawat ","Kiren Rijiju ","Mansukh Mandaviya" };
		Country.Cabinetministers(CabinetMinistersNames);
		System.out.println("================================================");
		
		String[] CabinetMinistersNamesBackward={"Narendra Modi","Rajnath Singh","Amit Shah","Nirmala Sitharaman","S. Jaishankar","Nitin Gadkari" ,"Piyush Goyal","Dharmendra Pradhan","Smriti Irani" ,"Pralhad Joshi","Arjun Munda","Narendra Singh Tomar","Gajendra Singh Shekhawat ","Kiren Rijiju ","Mansukh Mandaviya" };
		Country.CabinetministersBackward(CabinetMinistersNamesBackward);
		System.out.println("================================================");
		
		
		
		
		
		
		String[] politicalPartiesNamesBackwardss={"Bharatiya Janata Party (BJP)","Indian National Congress (INC)","Communist Party of India (CPI)","Communist Party of India (Marxist) (CPI(M))","Nationalist Congress Party (NCP)","Bahujan Samaj Party (BSP)","All India Trinamool Congress (AITC)","National People's Party (NPP)"};
		Country.politicalPartiesBackward(politicalPartiesNamesBackwardss);
		System.out.println("================================================");
	}
	
}