package com.alkeon.Born;
class Students {
    String name;
    char division;
    int rolnum;

    void info() {
        System.out.println("name : " + name);
        System.out.println("division : " + division);
        System.out.println("rolnum : " + rolnum);

    }

}

public class Create {

    public static void main(String[] args) {
        Students student1 = new Students();
        student1.name = "Abhi";
        student1.division = 'c';
        student1.rolnum = 401;
        student1.info();
        Students student2 = new Students();
        student2.name = "drashys";
        student2.division = 'a';
        student2.rolnum = 402;
        student2.info();

    }
}