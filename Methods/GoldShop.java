import java.util.*;
class GoldShop{

	static String name = "Sri Sai Gold Palace";
	static String ownerName = "Sri Sai";
	// Datatypes arrayname[] ={value}; syntax of an array...
	
	
	static String goldNames[] = {null,null,null,null,null,null,null};
	static double goldPrices[] = {0.0,0.0,0.0,0.0,0.0,0.0,0.0};
	static int goldNameindex;
	static int goldPriceindex;
	
	
	// add chatName in chatNames index position(ref)
	public static boolean createGoldName (String goldName){
	
	System.out.println("Create list started ");
	boolean isGoldNameCreated = false;
	//validation
	if(goldNameindex < goldNames.length){
		if(goldName != null){
		goldNames[goldNameindex] = goldName;
		goldNameindex++;
		isGoldNameCreated = true;
		}
		else System.out.println("The item list is full ");
	}
	else System.out.println("The item is not found ");
	System.out.println("Create list ended ");
	
	
		return isGoldNameCreated;
	}
	
	public static boolean addGoldPrice(double goldPrice){
		
			System.out.println("add list price started");
				boolean isGoldPriceAdded = false;
				if (goldPrice > 0.0){
					goldPrices[goldPriceindex] = goldPrice;
					goldPriceindex++;
				isGoldPriceAdded = true;
				
				}else System.out.println("please enter the valid amount ");					
		
		return isGoldPriceAdded;
		
	}

	public static void getGoldNames(){
	
	System.out.println("Get Gold Names Started ");
	for(String goldName : goldNames)
		System.out.println(goldName);
	for(double goldPrice: goldPrices)
		System.out.println(goldPrice);
	System.out.println("Get Gold method ended");
}
public static boolean updateGoldName(String oldGoldName , String newGoldName)
{
	System.out.println("Update gold Name started");
		boolean isGoldNameUpadted = false;
	for (int index = 0; index < goldNames.length; index++ ){
		if(oldGoldName == goldNames[index]){
			goldNames[index] = newGoldName;
			isGoldNameUpadted = true;
			
		}
		
	}
			if (isGoldNameUpadted == false)
						System.out.println("The gold name is not found");
	return isGoldNameUpadted;
}

public static boolean deleteGoldItem(String goldNameToBeDeleted){
			System.out.println("deleted item list is started");
			boolean isDeletedGoldItem = false;
			int newIndex, oldIndex;
				for(newIndex = 0, oldIndex = 0; oldIndex < goldNames.length ; oldIndex++){
					if(goldNames[oldIndex] != goldNameToBeDeleted){
							goldNames[newIndex] = goldNames[newIndex];
							newIndex++;
					
					}
					else{
					
					isDeletedGoldItem = true;
					}
					
				}
				goldNames = Arrays.copyOf(goldNames, newIndex);
				
				if (isDeletedGoldItem == false)
				{
				
					System.out.println("not found" + goldNameToBeDeleted );
				}
			System.out.println("deleted item list is ended");
			return isDeletedGoldItem;
		
		}

}