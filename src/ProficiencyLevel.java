public class ProficiencyLevel {
    public String language;
    private int yearsOfExperience;

    public ProficiencyLevel(String language, int yearsOfExperience) {
        this.language = language;
        this.yearsOfExperience = yearsOfExperience;
    }

    public void getExperienceInfo() {
        System.out.println("Language: " + this.language);
        System.out.println(" Years of Experience: " + this.yearsOfExperience);
        System.out.println(" Proficiency Level: " + this.getProficiencyLevel());
    }

    public String getProficiencyLevel() {
        if (this.yearsOfExperience >= 5) {
            return "Professional";
        } else {
            return this.yearsOfExperience >= 2 ? "Intermediate" : "Beginner";
        }
    }
}
