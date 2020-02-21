public class School {
    String name;
    int sectionCount;
    Section[] sections = new Section[200];

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Section[] getSections() {
        return sections;
    }

    public void addSection(Section s) {
        sections[sectionCount] = s;
        sectionCount++;

    }

    public String toString() {
        return "School " + name + " has " + sectionCount + " sections.";
    }
}
