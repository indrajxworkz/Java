class NewsPaper{
    
	String companyName;
	int noOfPages;
	String language;
	
  public boolean createNewsPaper(String companyName,int noOfPages,String language){
	  System.out.println("To read all information");
	  
	  boolean isNewsPaperCreated=false;
	  if(companyName!=null && noOfPages>0 && language!=null){
	  this.companyName=companyName;
	  this.noOfPages=noOfPages;
	  this.language=language;
	  isNewsPaperCreated=true;
  }
  return isNewsPaperCreated;
  
  } 
  public void displayInfo(){
	  
	  System.out.println("The company name of the news paper is :"+this.companyName);
	  System.out.println("The No of pages are :"+this.noOfPages);
	  System.out.println("The Language of the news paper is :"+ this.language);
	  
}
  }