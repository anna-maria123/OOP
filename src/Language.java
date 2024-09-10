public class Language {
    public String name;
    private int yearCreated;
    public String developer;

    public Language(String name, int yearCreated, String developer) {
        this.name = name;
        this.yearCreated = yearCreated;
        this.developer = developer;
    }

    public void displayInfo() {
        System.out.println("Name" + this.name);
        System.out.println("Year" + this.yearCreated);
        System.out.println("Developer" + this.developer);
    }
}
