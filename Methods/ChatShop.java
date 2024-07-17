class GoldShop{

	static String name = "Babanna Pani Puri Center";
	static String ownerName = "Babanna";
	// Datatypes arrayname[] ={value}; syntax of an array...
	
	
	static String chatNames[] = {null,null,null,null,null,null};
	static double chatPrices[] = {0.0,0.0,0.0,0.0,0.0,0.0};
	static int chatNameindex;
	static int chatPriceindex;
	
	
	// add chatName in chatNames index position(ref)
	public static boolean createGoldName (String chatName){
	
	System.out.println("Create chart name started ");
	boolean isChatNameCreated = false;
	//validation
	if(chatNameindex < chatNames.length){
		if(chatName != null){
		chatNames[chatNameindex] = chatName;
		chatNameindex++;
		isChatNameCreated = true;
		}
		else System.out.println("The item list is full ");
	}
	else System.out.println("The item is not found ");
	System.out.println("Create chart name ended ");
	
	
		return isChatNameCreated;
	}
	
	public static boolean createGoldPrice(double chatPrice){
		
			System.out.println("add chrt price started");
				boolean isPriceAdded = false;
				if (chatPrice > 0.0){
					chatPrices[chatPriceindex] = chatPrice;
					chatPriceindex++;
				isPriceAdded = true;
				
				}else System.out.println("please enter the valid amount ");					
		
		return isPriceAdded;
		
	}

	public static void getChatNames(){
	
	System.out.println("Get ChatNames Started ");
	for(String chatName : chatNames)
		System.out.println(chatName);
	for(double chatPrice: chatPrices)
		System.out.println(chatPrice);
	System.out.println("Get method ended");
}
public static boolean updateChatName(String oldChatName , String newChatName)
{
	System.out.println("UpdateChat Name started");
		boolean isChatNameUpadted = false;
	for (int index = 0; index < chatNames.length; index++ ){
		if(oldChatName == chatNames[index]){
			chatNames[index] = newChatName;
			isChatNameUpadted = true;
			
		}
		if (isChatNameUpadted == false)
			System.out.println("The chatname is not found");
	}
	return isChatNameUpadted;
}



}