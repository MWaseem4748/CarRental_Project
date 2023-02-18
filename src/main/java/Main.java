import java.util.ArrayList;
import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;

public class Main {
	static int num_of_pass,num_of_days;
	static double approx_milage;
	public static ArrayList<String> cars=new ArrayList();
	public static ArrayList<String> cost_of_trip=new ArrayList();
	static Data p=new Data();

	public static void main(String args[])
	{
		
		Data.load();
		welcomemenu();
	}
	public static void welcomemenu()
	{
		Scanner sc=new Scanner(System.in);
		Scanner out=new Scanner(System.in);
		System.out.println("---Welcome to Car Rental System---");
		System.out.println("Provide the following information and we'll find the best suited car for you");
		
		System.out.print("Enter Number of Passangers :");
		num_of_pass=sc.nextInt();
		if(num_of_pass>7)
		{
			System.out.println("passenger should be less then 7");
			welcomemenu();
		}
		System.out.print("Enter Number of rental days :");
		num_of_days=sc.nextInt();
		System.out.print("Approx. mileage for the trip :");
		approx_milage=out.nextDouble();
		calculation();
		
	}
	public static void calculation()
	{
		
		
		if(num_of_pass<=4)
		{
			for(int i=0;i<p.name.size();i++)
			{
			
				if(p.passanger.get(i).equals("4"))
				{
					
					double petrol=approx_milage/Double.parseDouble(p.milege.get(i));
					double total_petrprice=petrol*2.25;
					//System.out.println(p.name.get(i)+" "+ total_petrprice);
					double total_price=Double.parseDouble(p.rent.get(i))*num_of_days;
					double total_cost=total_price+total_petrprice;
					cars.add(p.name.get(i));
					cost_of_trip.add(Double.toString(total_cost));
					
					
					
				}
				
				
			}
			bestselection();
		}
		
		if(num_of_pass>4 && num_of_pass<=5)
		{
			for(int i=0;i<p.name.size();i++)
			{
			
				if(p.passanger.get(i).equals("5"))
				{
					
					double petrol=approx_milage/Double.parseDouble(p.milege.get(i));
					double total_petrprice=petrol*2.25;
					//System.out.println(p.name.get(i)+" "+ total_petrprice);
					double total_price=Double.parseDouble(p.rent.get(i))*num_of_days;
					double total_cost=total_price+total_petrprice;
					cars.add(p.name.get(i));
					cost_of_trip.add(Double.toString(total_cost));
					
					
					
				}
				
				
			}
			bestselection();
		}
		if(num_of_pass>5 && num_of_pass<=7)
		{
			for(int i=0;i<p.name.size();i++)
			{
			
				if(p.passanger.get(i).equals("7"))
				{
					
					double petrol=approx_milage/Double.parseDouble(p.milege.get(i));
					double total_petrprice=petrol*2.25;
				//	System.out.println(p.name.get(i)+" "+ total_petrprice);
					double total_price=Double.parseDouble(p.rent.get(i))*num_of_days;
					double total_cost=total_price+total_petrprice;
					cars.add(p.name.get(i));
					cost_of_trip.add(Double.toString(total_cost));
					
					
					
				}
				
				
			}
		
			bestselection();
		}
		
	}
	public static void bestselection()
	{
		double min = Double.parseDouble(cost_of_trip.get(0));
		double max = Double.parseDouble(cost_of_trip.get(0));
		String maxcar = cars.get(0);
		String mincar = cars.get(0);
        // store the length of the ArrayList in variable n
		int n = cost_of_trip.size();
  
        // loop to find minimum from ArrayList
        for (int i = 1; i < n; i++) {
            if ( Double.parseDouble(cost_of_trip.get(i)) < min) {
            	  mincar=cars.get(i);
            	 
                min = Double.parseDouble(cost_of_trip.get(i));
              
  
            }
        }
		
        System.out.println("****Best Available Cheapeast Car on Rent****");
        //System.out.println(maxcar +" Maximum is : " + max);
        System.out.println("Car Make and model: "+mincar);
        System.out.println("Total Passenger: "+num_of_pass);
        System.out.println("Total Cost Associated with trip: "+min);
        System.exit(0);
        
	}
	
}
