import java.util.Arrays;

public class Section {
    String name;
    Teacher teacher;
    int currentSize;
    Student[] students = new Student[50];

    public Section(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student s) {
        students[currentSize] = s;
        currentSize++;
    }

    public String toString() {
        return name + " is taught by " + teacher.name + " and has " + currentSize + " students: " + listStudents(students);
    }

    public String listStudents(Student[] s) {
        String a = "";
        for(int i=0; i<currentSize; i++) {
            a += s[i].name + ", ";
        }
        return a;
    }
}
