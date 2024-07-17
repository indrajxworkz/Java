class Gym{

	static String gymName = "Classic Fittness";
	static String ownerName = "N Nagraja";
	static String gymEquips[] = {null,null,null,null,null,null,null,null};
	static int gymindex;
	
	public static boolean createGymEquipments(String gymEquip){
	
	System.out.println("List of equipments strated");
		boolean isListCreated = false;
		if(gymEquips != null){
		gymEquips[gymindex] = gymEquip;
		gymindex++;
		isListCreated = true;
		}
		System.out.println("List of equipments ended");
		return isListCreated;
	} 
	public static void getEquipments(){
	System.out.println("Getting the list ");
	
	for(String gymEquip : gymEquips)
	System.out.println(gymEquip);

	System.out.println("Got the list");
	}
}