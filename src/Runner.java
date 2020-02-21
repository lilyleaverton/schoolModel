public class Runner {
    public static void main(String[] args) {
        School bhigh = new School("Berkeley High");
        Section math = new Section("Math");
        Section biology = new Section("Biology");
        Section compsci = new Section("Computer Science");
        Teacher albinson = new Teacher("Albinson", "Computer Science");
        Teacher two = new Teacher("Mueller", "Biology");
        Teacher three = new Teacher("Austera", "Math");
        Student me = new Student("Lily", 11);
        Student friend1 = new Student("Eliot", 11);
        Student friend2 = new Student("Safi", 11);
        Student friend3 = new Student("Matthew", 11);
        Student friend4 = new Student("Ruby", 9);
        Student friend5 = new Student("Emi", 11);

        bhigh.addSection(math);
        bhigh.addSection(biology);
        bhigh.addSection(compsci);

        math.setTeacher(three);
        biology.setTeacher(two);
        compsci.setTeacher(albinson);

        albinson.addSection(compsci);
        two.addSection(biology);
        three.addSection(math);

        math.addStudent(me);
        math.addStudent(friend1);
        math.addStudent(friend2);
        math.addStudent(friend3);
        math.addStudent(friend4);
        math.addStudent(friend5);

        biology.addStudent(me);
        biology.addStudent(friend1);
        biology.addStudent(friend2);
        biology.addStudent(friend3);
        biology.addStudent(friend4);
        biology.addStudent(friend5);

        compsci.addStudent(me);
        compsci.addStudent(friend1);
        compsci.addStudent(friend2);
        compsci.addStudent(friend3);
        compsci.addStudent(friend4);
        compsci.addStudent(friend5);

        me.addSection(math);
        me.addSection(biology);
        me.addSection(compsci);

        friend1.addSection(math);
        friend1.addSection(biology);
        friend1.addSection(compsci);

        friend2.addSection(math);
        friend2.addSection(biology);
        friend2.addSection(compsci);

        friend3.addSection(math);
        friend3.addSection(biology);
        friend3.addSection(compsci);

        friend4.addSection(math);
        friend4.addSection(biology);
        friend4.addSection(compsci);

        friend5.addSection(math);
        friend5.addSection(biology);
        friend5.addSection(compsci);

        System.out.println(bhigh.toString());
        System.out.println(math.toString());
        System.out.println(biology.toString());
        System.out.println(compsci.toString());
        System.out.println(albinson.toString());
        System.out.println(two.toString());
        System.out.println(three.toString());
        System.out.println(me.toString());
        System.out.println(friend1.toString());
        System.out.println(friend2.toString());
        System.out.println(friend3.toString());
        System.out.println(friend4.toString());
        System.out.println(friend5.toString());

    }
}
