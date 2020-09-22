package assignment1;

import java.util.Scanner;

public class CalBill {

	public static void main(String[] args) {
		 int previousReading, currentReading  , noOfUnits , ratePerUnit, totalBill;
		 String typeOfConnection ;
		
		 
		   Scanner myObj = new Scanner(System.in);
		   
		    System.out.println("Enter previous month's reading:");
		    previousReading = myObj.nextInt();

		    System.out.println("Enter current month's reading:");
		    currentReading = myObj.nextInt(); 
		    
		    if(currentReading < previousReading) {
		    	System.out.println("Previous reading cannot be greater than Current reading");	
		    	 noOfUnits = 1;
		    }
		    else {
		      noOfUnits = (currentReading - previousReading);	
		    }
		  
		    
		    System.out.println("Enter connection type :Domestic , Agriculture, Commercial)");
		    typeOfConnection = myObj.nextLine(); 
		    
		    switch(typeOfConnection) {
		    
		    case "Domestic" : {
		    	
		    	if (noOfUnits <= 100) {
		    		ratePerUnit = 2;
		    		System.out.println("Domestic connection with less than 100 units " + noOfUnits);
		    	}
		    	else if (100 < noOfUnits && 300 > noOfUnits){
		    		ratePerUnit = 3;
		    		System.out.println("Domestic connection with 100 to 300 units " + noOfUnits);
		    	}
		    	 else {
			    		ratePerUnit = 4;
			    		System.out.println("Domestic connection with greater than 300 units " + noOfUnits);
			    	}
		    	 
		    	  totalBill = noOfUnits * ratePerUnit;
				    System.out.println("Total bill for domestic is " + totalBill);
		    	break;
		    }
		    case "Agriculture" : {
		    	
		    	if (noOfUnits <= 100) {
		    		ratePerUnit = 1;
		    		System.out.println("Agriculture connection with less than 100 units " + noOfUnits);
		    	}
		    	else if (100 < noOfUnits && 300 > noOfUnits){
		    		ratePerUnit = 2;
		    		System.out.println("Agriculture connection with 100 to 300 units " + noOfUnits);	
		    	}
		    	else {
		    		ratePerUnit = 3;
		    		System.out.println("Agriculture connection with greater than 300 units " + noOfUnits);
		    	}
		    	  totalBill = noOfUnits * ratePerUnit;
				    System.out.println("Total bill for Agriculture is " + totalBill);
		    	break;
		    }
		    case "Commercial" : {
		    
		    	if (noOfUnits <= 100) {
		    		ratePerUnit = 3;
		    		System.out.println("Commercial connection with less than 100 units " + noOfUnits);

		    	}
		    	else if (100 < noOfUnits && 300 > noOfUnits){
		    		ratePerUnit = 4;
		    		System.out.println("Commercial connection with 100 to 300 units " + noOfUnits);
		    	}
		    	else {
		    		ratePerUnit = 5;
		    		System.out.println("Commercial connection with greater than 300 units " + noOfUnits);

		    	}
		    	  totalBill = noOfUnits * ratePerUnit;
				    System.out.println("Total bill for Commercial is " + totalBill);
		    	break;
		    }
		  
		  
		    }
		    
		  

	}

}
