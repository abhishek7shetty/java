package com.alkeon.Born;

class Studentis {
    String Studentname;
    int regnum;
    char div;
    static String college = "Sapthagiri College of Engineering";
 
    Studentis(String Studentname, int regnum, char div) {
        this.Studentname = Studentname;
        this.regnum = regnum;
        this.div = div;

    }

    void display() {
        System.out.println("name=" + Studentname + "\nnumber=" + regnum + "\ndivision=" + div+"\n"+college);
    }
}

public class Dc {
    public static void main(String[] args) {
    	
        Studentis sc1 = new Studentis("Abhi", 400, 'A');
        Studentis sc2 = new Studentis("kartik", 401, 'B');
        sc1.display();
        sc2.display();

    }
}