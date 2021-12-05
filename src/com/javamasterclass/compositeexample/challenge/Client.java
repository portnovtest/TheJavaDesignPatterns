package com.javamasterclass.compositeexample.challenge;

public class Client {
    public static void main(String[] args) {
        var technologyDean = new Supervisor("Dr. Mike", "Dean of Technology");
        var chairOfMath = new Supervisor("Dr. John", "Chair of Math Dept");
        var chairOfCS = new Supervisor("Dr. Ian", "Chair of CS Dept");

        var mathProf1 = new Professor("Math Professor1", "Adjunct", 302);
        var mathProf2 = new Professor("Math Professor2", "Associate", 303);

        var cseProf1 = new Professor("CSE Professor1", "Adjunct", 507);
        var cseProf2 = new Professor("CSE Professor2", "Professor", 508);
        var cseProf3 = new Professor("CSE Professor3", "Professor", 509);

        technologyDean.add(chairOfMath);
        technologyDean.add(chairOfCS);

        chairOfMath.add(mathProf1);
        chairOfMath.add(mathProf2);

        chairOfCS.add(cseProf1);
        chairOfCS.add(cseProf2);
        chairOfCS.add(cseProf3);

        // Printing the details
        System.out.println("""
                *** COMPOSITE DEMO ***
                The college has the following structure
                """);
        System.out.println(technologyDean.getDetails());
        var chairs = technologyDean.getMyFaculty();
        chairs.forEach(i -> System.out.println("\t" + i.getDetails()));

        var mathProfessors = chairOfMath.getMyFaculty();
        mathProfessors.forEach(i -> System.out.println("\t\t" + i.getDetails()));

        var cseProfessors = chairOfCS.getMyFaculty();
        cseProfessors.forEach(i -> System.out.println("\t\t" + i.getDetails()));

        chairOfCS.remove(cseProf2);
        System.out.println("\n After CSE Professor2 leaving the organization = CSE department has the following ");
        cseProfessors = chairOfCS.getMyFaculty();
        cseProfessors.forEach(i -> System.out.println("\t\t" + i.getDetails()));
    }
}
