class NewsPaper {
    String companyName;
    int noOfPages;
    int id;
    String language;

    public NewsPaper() {
        System.out.println(" NewsPaper object is created");
    }

    public NewsPaper(String companyName, int noOfPages, int id, String language) {
        this.companyName = companyName;
        this.noOfPages = noOfPages;
        this.id = id;
        this.language = language;
    }

    public void currentAffairs() {
        System.out.println("Company Name: " + this.companyName);
        System.out.println("Number of Pages: " + this.noOfPages);
        System.out.println("ID: " + this.id);
        System.out.println("Language: " + this.language);
    }
}