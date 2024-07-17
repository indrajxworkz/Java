import java.util.Arrays;
class BrandShop{
	static String  BrandShopName = "mrp";
	
	static String brandNames[] = {null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int brandNameindex;
	
	public static boolean addWineBrands(String brandName){
	
		boolean isCreateBrandName = false;
		System.out.println("brand name list is started");
		if(brandNameindex < brandNames.length){
			if(brandName != null){
				brandNames[brandNameindex] = brandName;
				brandNameindex++;
				isCreateBrandName = true;	
			}
			else System.out.println("brand length is full");
		}
		else System.out.println("brand name is not found");
		
		System.out.println("brand name list is ended");
		return isCreateBrandName;
		
	}
	
	public static void getAllBrands(){
		for(String brandName:brandNames)
			System.out.println(brandName);
	}



	public static boolean updateWineBrand(String oldBrandName, String newBrandName){
		boolean isUpdateWine = false;
		System.out.println("update list is started");
		for(int index = 0; index < brandNames.length; index++){
			if(oldBrandName == brandNames[index]){
				brandNames[index] = newBrandName;
			isUpdateWine = true;
			}
			
		}
		if (isUpdateWine == false)
			System.out.println("The brand is not found");
		System.out.println("update list is ended");
		return isUpdateWine;
	}
	
	public static boolean deleteBrandName(String brandNameTobeDeleted)
	{
		System.out.println("Delete method started");
		boolean isBrandNameDeleted = false;
		int newIndex, oldIndex;
		for(newIndex = 0,oldIndex = 0; oldIndex < brandNames.length;oldIndex++)
		{
			if(brandNames[oldIndex] != brandNameTobeDeleted)
			{
				brandNames[newIndex] = brandNames[oldIndex];
				newIndex++;
			
				
			}else{
				isBrandNameDeleted = true;
			}
		}
		
			brandNames = Arrays.copyOf(brandNames, newIndex);
			

			if(isBrandNameDeleted == false)
			{
				System.out.println(brandNameTobeDeleted + " not found");
			}
			System.out.println("Delete method ended");
			return isBrandNameDeleted;
	}
	
	
}