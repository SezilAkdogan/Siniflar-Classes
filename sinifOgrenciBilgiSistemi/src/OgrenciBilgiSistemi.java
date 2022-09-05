public class OgrenciBilgiSistemi {
    public static void main(String[] args) {

        Course mathematics = new Course("Mathematics", "M101", "MATH");
        Course physics = new Course("Physics", "P202", "PHYSICS");
        Course english = new Course("English", "E303", "ENG");

        Teacher teacher1 = new Teacher("Burak", "0500", "MATH");
        mathematics.addTeacher(teacher1);
        Teacher teacher2 = new Teacher("Ayşe", "0501", "PHYSICS");
        physics.addTeacher(teacher2);
        Teacher teacher3 = new Teacher("Ali", "0502", "ENG");
        english.addTeacher(teacher3);


        Student student1 = new Student("Sezil", "110", 4, mathematics, physics, english);
        student1.addBulkmidtermNote(70, 80, 90);
        student1.addBulkfinalNote(70, 80, 90);
        student1.isPass();

        Student student2 = new Student("Sezilce", "387", 4, mathematics, physics, english);
        student2.addBulkmidtermNote(90, 80, 70);
        student2.addBulkfinalNote(70, 80, 90);
        student2.isPass();

        Student student3 = new Student("Sezillerce", "008", 4, mathematics, physics, english);
        student3.addBulkmidtermNote(40, 50, 60);
        student3.addBulkfinalNote(50, 60, 70);
        student3.isPass();

    }
}
