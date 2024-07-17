class SwiggyRunner{

		public static void main(String foodName[]){
			System.out.println("Swiggy takeOrder Started");
			 double price = Swiggy.takeOrder("Just Poori's");
				System.out.println(price);
			
			System.out.println("Swiggy takeOrder ended");
			
			
		}
		
	
}