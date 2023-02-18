import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Data {
	public static ArrayList<String> name=new ArrayList();
	public static ArrayList<String> rating=new ArrayList();
	public static ArrayList<String> milege=new ArrayList();
	public static ArrayList<String> comfort=new ArrayList();
	public static ArrayList<String> passanger=new ArrayList();
	
	public static ArrayList<String> rent=new ArrayList();
	public static ArrayList<String> category=new ArrayList();
	public static ArrayList<String> in_cat=new ArrayList();

	

	 public static void load()
		{
			  String line = "";
		      String mydata = null;
		      ArrayList data=new ArrayList();
		        try
		        {
		            FileReader fileReader = new FileReader("cars.txt");
		            
		            // always wrap the FileReader in BufferedReader
		            BufferedReader bufferedReader = new BufferedReader(fileReader);
		            
		            while((line = bufferedReader.readLine()) != null)
		            {
		           
		                String[] parts = line.split("-");
		                name.add(parts[0].toLowerCase()) ; // 004
		                rating.add(parts[1]);
		                milege.add(parts[2]);
		                comfort.add(parts[3].toLowerCase());
		                passanger.add(parts[4].toLowerCase());
		                rent.add(parts[5].toLowerCase());
		                category.add(parts[6].toLowerCase());
		                in_cat.add(parts[7].toLowerCase());
//		                System.out.println(parts[0]);
//		                System.out.println(parts[1]);
//		                System.out.println(parts[2]);
//		                System.out.println(parts[3]);
//		                System.out.println(parts[4]);
//		                System.out.println(parts[5]);
//		                System.out.println(parts[6]);
//		                System.out.println(parts[7]);
		
		                
		            }
//		          
		            bufferedReader.close();
		        }
		        catch(IOException ex)
		        {
		            System.out.println("\nError occurred");
		            System.out.println("Exception Name: " +ex);
		        }
		       
		}	

	

}
