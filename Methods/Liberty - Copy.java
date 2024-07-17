import java.util.*;
class Liberty{
	static String  LibertyName = "zara";
	
	static String brandShoeNames[] = {null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int brandShoeNameindex;
	
	
	public static boolean addShoeBrands(String brandShoeName){
	
		boolean isCreateBrandShoeName = false;
		System.out.println("brand name list is started");
		if(brandShoeNameindex < brandShoeNames.length){
			if(brandShoeName != null){
				brandShoeNames[brandShoeNameindex] = brandShoeName;
				brandShoeNameindex++;
				isCreateBrandShoeName = true;	
			}
			else System.out.println("brand length is full");
		}
		else System.out.println("brand name is not found");
		
		System.out.println("brand name list is ended");
		return isCreateBrandShoeName;
		
	}
	
	public static void getAllShoeBrands(){
		for(String brandShoeName:brandShoeNames)
			System.out.println(brandShoeName);
	}



	public static boolean updateShoeBrand (String oldBrandShoeName, String newBrandShoeName){
		boolean isUpdateShoe = false;
		System.out.println("update list is started");
		for(int index = 0; index < brandShoeNames.length; index++){
			if(oldBrandShoeName == brandShoeNames[index]){
				brandShoeNames[index] = newBrandShoeName;
			isUpdateShoe = true;
			}
			
		}
		if (isUpdateShoe == false)
			System.out.println("The brand is not found");
		System.out.println("update list is ended");
		return isUpdateShoe;
	}
public static boolean deleteMaterialName(String shoeNameTobeDeleted)
	{
		System.out.println("Delete method started");
		boolean isShoeNameDeleted = false;
		int newIndex, oldIndex;
		for(newIndex = 0,oldIndex = 0; oldIndex < brandShoeNames.length;oldIndex++)
		{
			if(brandShoeNames[oldIndex] != shoeNameTobeDeleted)
			{
				brandShoeNames[newIndex] = brandShoeNames[oldIndex];
				newIndex++;
			
				
			}else{
				isShoeNameDeleted = true;
			}
		}
		
			brandShoeNames = Arrays.copyOf(brandShoeNames, newIndex);
			

			if(isShoeNameDeleted == false)
			{
				System.out.println(shoeNameTobeDeleted + " not found");
			}
			System.out.println("Delete method ended");
		
	
			
	return isShoeNameDeleted;
	}
	
}