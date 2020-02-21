import java.util.Arrays;

public class Student extends Person{
    Section[] sections = new Section[10];
    int grade;
    int sectionCount;

    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Section[] getSections() {
        return sections;
    }

    public void addSection(Section s) {
        sections[sectionCount] = s;
        sectionCount++;
    }

    public String toString() {
        return name + " is in " + grade + "th grade and is enrolled in the following sections: " + listSections(sections);
    }

    public String listSections(Section[] s) {
        String a = "";
        for(int i=0; i<sectionCount; i++) {
            a += s[i].name + " (" + s[i].teacher.name + "), ";
        }
        return a;
    }

}
