class OttAmazon{
	
	static String top10Movies[] = {"The Tomorrow War","Coming 2 America","Borat Subsequent Moviefilm ","Sound of Metal","The Boys in the Band ","One Night in Miami","Salt","Iron Man","Stranger Things","Unicorn Acadmey"};
	
	static String englishMovies[] = {"The Vast of Night","Uncle Frank","Sylvie's Love","OneHome","I'm Your Woman","Red Notice","Don't Look Up","Enola Holmes 2","The Adam Project","Extraction 2","Danzerve","Bridgerton","Stranger Things","The Witcher","Sweet Tooth", "Your Honor","Eric","Outer Banks","Lupin","Sound of Metal","Emily in Paris","Unicorn Academy","The Out-Laws","Godzilla Minus One","The Tomorrow War"};
	
	static String teluguMovies[] ={"Vakeel Saab","Jathi Ratnalu","Uppena","Eega","Krack ","Arjun Reddy","Nishabdham","Maharshi","Mahanati","Middle Class Melodies","Fidaa","Colour Photo","Bheeshma","Jersey","Dear Comrade","Bharat Ane Nenu","Srimanthudu","Hit: The First Case","Ninnu Kori","Oh! Baby","Saaho","Jaanu","Darling","MrPerfect"};
	
	static String hindiMovies[] = {"Dangal","Chopsticks","Andhadhun","Article 15","Choked: Paisa Bolta Hai","Drishyam","Kuch Kuch Hota Hai","Kabir Singh","Ludo","The White Tiger","Bulbbul","The Kargil Girl","Pagglait","Sardar Udham","Stree","Thappad","Mimi","Sanju","Dil Dhadakne Do","Bareilly Ki Barfi","Drishyam","Pink","3 idiots","ye jawan ye diwani","quaitl"};
	
	public static void main(String amazon[]){
		System.out.println("Top 10 Movies: ");
		for (String top10Movie: top10Movies){
			
		System.out.println(top10Movie);
		
		}
		System.out.println("The English Movies : ");
		for (String englishMovie:englishMovies){
			
			System.out.println(englishMovie);
		}
		System.out.println("The Hindi MOvies are : ");
		for (int index = 0; index < hindiMovies.length; index++){
			
			System.out.println(hindiMovies[index]);
		}
	
	
	
		
	
	}

}