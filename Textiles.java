import java.util.Arrays;
class Textiles{
	static String  TextilesName = "Sliks";
	
	static String materialNames[] = {null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int materialNameindex;
	
	public static boolean addMaterial(String materialName){
	
		boolean isCreatematerial = false;
		System.out.println("brand name list is started");
		if(materialNameindex < materialNames.length){
			if(materialName != null){
				materialNames[materialNameindex] = materialName;
				materialNameindex++;
				isCreatematerial = true;	
			}
			else System.out.println("brand length is full");
		}
		else System.out.println("brand name is not found");
		
		System.out.println("brand name list is ended");
		return isCreatematerial;
		
	}
	
	public static void getAllmaterialNames()
		{
			for(String materialName:materialNames)
				System.out.println(materialName);
		}



	public static boolean updatematerialName (String oldmaterialName, String newmaterialName){
		boolean isUpdatematerial = false;
		System.out.println("update list is started");
		for(int index = 0; index < materialNames.length; index++){
			if(oldmaterialName == materialNames[index]){
				materialNames[index] = newmaterialName;
			isUpdatematerial = true;
			}
			
		}
		if (isUpdatematerial == false)
			System.out.println("The brand is not found");
		System.out.println("update list is ended");
		return isUpdatematerial;
	}
	
	public static boolean deleteMaterialName(String materialNameTobeDeleted)
	{
		System.out.println("Delete method started");
		boolean isMaterialNameDeleted = false;
		int newIndex, oldIndex;
		for(newIndex = 0,oldIndex = 0; oldIndex < materialNames.length;oldIndex++)
		{
			if(materialNames[oldIndex] != materialNameTobeDeleted)
			{
				materialNames[newIndex] = materialNames[oldIndex];
				newIndex++;
			
				
			}else{
				isMaterialNameDeleted = true;
			}
		}
		
			materialNames = Arrays.copyOf(materialNames, newIndex);
			

			if(isMaterialNameDeleted == false)
			{
				System.out.println(materialNameTobeDeleted + " not found");
			}
			System.out.println("Delete method ended");
		
	
			
	return isMaterialNameDeleted;
	}
	
}