class Zamato{
	public double takeOrder(String[] food){
		//"Pizza"=="Pizza";
		if(foodName=="Pizza"){
			return 99.00;
		}
	if(foodName=="Burger"){
		return 120.00;
}
else{
	System.out.println("the food not found");
}
return 0.0;

}}
class ZamatoRun{
	public static void main(String[] food){
		Zamato.takeOrder(food);
	}
}
		