class GymRun{

	public static void main(String[] args){
	
	boolean isAdded = Gym.createGymEquipments("Dumbells");
	System.out.println("The equip added is :  " + isAdded);
	
	 isAdded = Gym.createGymEquipments("Bars & Plates");
	System.out.println("The equip added is :  " + isAdded);
	
	 isAdded = Gym.createGymEquipments("Handles");
	System.out.println("The equip added is :  " + isAdded);
	
	 isAdded = Gym.createGymEquipments("Tread mill");
	System.out.println("The equip added is :  " + isAdded);
	
	 isAdded = Gym.createGymEquipments("Rowing machine");
	System.out.println("The equip added is :  " + isAdded);
	
	 isAdded = Gym.createGymEquipments("Power rack");
	System.out.println("The equip added is :  " + isAdded);
	
	 isAdded = Gym.createGymEquipments("Leg Press ");
	System.out.println("The equip added is :  " + isAdded);
	
	 isAdded = Gym.createGymEquipments("Bench Press");
	System.out.println("The equip added is :  " + isAdded);
	

	Gym.getEquipments();
	
	}

}