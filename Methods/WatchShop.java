import java.util.*;
class WatchShop{

	static String name = "Tanishq Watch Palace";
	static String ownerName = "TATA";

	
	
	static String watchNames[] = {null,null,null,null,null,null,null};
	//static double watchPrices[] = {0.0,0.0,0.0,0.0,0.0,0.0,0.0};
	static int watchNameindex;

	
	
	
	public static boolean createWatchName (String watchName){
	
	System.out.println("Create list started ");
	boolean isWatchNameCreated = false;
	//validation
	
	if(watchNameindex < watchNames.length){
		if(watchName != null){
		watchNames[watchNameindex] = watchName;
		watchNameindex++;
		isWatchNameCreated = true;
		}
		else System.out.println("The item list is full ");
	}
	else System.out.println("The item is not found ");
	System.out.println("Create list ended ");
	
	
		return isWatchNameCreated;
	}
	
	/*public static boolean addWatchPrice(double watchPrice){
		
			System.out.println("add list price started");
				boolean isWatchPriceAdded = false;
				if (watchPrice > 0.0){
					watchPrices[watchPriceindex] = watchPrice;
					watchPriceindex++;
				isWatchPriceAdded = true;
				
				}else System.out.println("please enter the valid amount ");					
		
		return isWatchPriceAdded;
		
	}*/

	public static void getWatchNames(){
	
	System.out.println("Get Watch Names Started ");
	for(String watchName : watchNames)
		System.out.println(watchName);
	/*for(double watchPrice: watchPrices)
		System.out.println(watchPrice);
	System.out.println("Get Watch method ended");*/
}
public static boolean updateWatchName(String oldWatchName, String newWatchName)
{
	System.out.println("Update Watch Name started");
		boolean isWatchNameUpadted = false;
	for (int index = 0; index < watchNames.length; index++ ){
		if(oldWatchName == watchNames[index]){
			watchNames[index] = newWatchName;
			isWatchNameUpadted = true;
			
		}
		
	}
			if (isWatchNameUpadted == false)
						System.out.println("The Watch name is not found");
					System.out.println("update list is ended");
	return isWatchNameUpadted;
}

	
	public static boolean deleteWatchName(String watchNameTobeDeleted)
	{
		System.out.println("Delete method started");
		boolean isWatchNameTobeDeleted = false;
		int newIndex, oldIndex;
		for(newIndex = 0,oldIndex = 0; oldIndex < watchNames.length;oldIndex++)
		{
			if(watchNames[oldIndex] != watchNameTobeDeleted)
			{
				watchNames[newIndex] = watchNames[oldIndex];
				newIndex++;
			
				
			}else{
				isWatchNameTobeDeleted = true;
			}
		}
		
			watchNames = Arrays.copyOf(watchNames, newIndex);
			

			if(isWatchNameTobeDeleted == false)
			{
				System.out.println(watchNameTobeDeleted + " not found");
			}
			System.out.println("Delete method ended");
		
	
			
	return isWatchNameTobeDeleted;
	}


}