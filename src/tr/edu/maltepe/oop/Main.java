package tr.edu.maltepe.oop;

public class Main {

    public static void main(String[] args) {
     Student myStudent = new Student();
     myStudent.firstName = "Nur";
     myStudent.lastName = "Karakaya";
     myStudent.studentNo = 200704006;
     myStudent.learns();
     myStudent.study();

     Student myStudent2 = new Student();
     myStudent2.firstName = "Ecem";
     myStudent2.lastName = "Kuralay";
     myStudent2.studentNo = 190704028;


     Student myStudent3 = new Student();
     myStudent3.firstName = "Miray";
     myStudent3.lastName = "Sağlam";
     myStudent3.studentNo = 190305004;


     professor myProfessor = new professor();
     myProfessor.firstName = "Ensar";
     myProfessor.lastName = "GÜL";
     myProfessor.teaches();
     myProfessor.helps();

     professor myProfessor2 = new professor();
     myProfessor2.firstName = "Raif";
     myProfessor2.lastName = "ÖNVURAL";



        System.out.println(myStudent.firstName);
        System.out.println(myStudent.lastName);
        System.out.println(myStudent.studentNo);

        System.out.println("      ");

        System.out.println(myStudent2.firstName);
        System.out.println(myStudent2.lastName);
        System.out.println(myStudent2.studentNo);


        System.out.println("      ");


        System.out.println(myStudent3.firstName);
        System.out.println(myStudent3.lastName);
        System.out.println(myStudent3.studentNo);


        System.out.println("      ");

        System.out.println(myProfessor.firstName);
        System.out.println(myProfessor.lastName);

        System.out.println("      ");

        System.out.println(myProfessor2.firstName);
        System.out.println(myProfessor2.lastName);



    }
}
