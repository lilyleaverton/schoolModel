import java.util.Arrays;

public class Teacher extends Person{
    Section[] sections = new Section[10];
    String subject;
    int sectionCount;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;

    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Section[] getSections() {
        return sections;
    }

    public void addSection(Section s) {
        sections[sectionCount] = s;
        sectionCount++;
    }

    public String toString() {
        return name + " teaches the following sections: " + listSections(sections);
    }

    public String listSections(Section[] s) {
        String a = "";
        for(int i=0; i<sectionCount; i++) {
            a += s[i].name + "(" + s[i].currentSize + "), ";
        }
        return a;
    }

}
