public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Language programmingJava = new Language("  Java ", 1995, "  Oracle Corporation");
        Language programmingC = new Language(" C ", 1972, "   Dennis MacAlister and Bell Labs ");
        Language programmingPython = new Language(" Python ", 1991, "   Guido van Rossum");
        programmingJava.displayInfo();
        programmingC.displayInfo();
        programmingPython.displayInfo();
        ProficiencyLevel javaExperience = new ProficiencyLevel("Java", 6);
        ProficiencyLevel pythonExperience = new ProficiencyLevel("Python", 2);
        ProficiencyLevel cExperience = new ProficiencyLevel("C ", 1);
        javaExperience.getExperienceInfo();
        pythonExperience.getExperienceInfo();
        cExperience.getExperienceInfo();
    }
}