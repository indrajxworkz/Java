class Girias{

	static String shopNmae = "Girias";
	static String ownerName = "N Nagraja";
	static String homeAppliances[] = {null,null,null,null,null,null,null,null,null,null,null,null};
	static int homeindex;
	
	public static boolean createhomeAppliance(String homeAppliance ){
	
		System.out.println("List of equipments strated");
			boolean isListCreated = false;
			if(homeAppliances != null)
			{
				
				homeAppliances[homeindex] = homeAppliance;
				homeindex++;
				isListCreated = true;
			
			}
		System.out.println("List of equipments ended");
			return isListCreated;
	} 
	
	
	public static void getAppliancesList(){
	System.out.println("Getting the list ");
	
		for(String homeAppliance : homeAppliances)
		System.out.println(homeAppliance);

	System.out.println("Got the list");
	}
}
