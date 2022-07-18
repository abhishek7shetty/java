package com.alkeon.Born;

class Cricketers{
	String cricketername;
	String role;
	double battingavg;
	double bowlingavg;
	char salarygrade;
	void info() {
		System.out.println("cricketername :"+cricketername);
		System.out.println("role :"+role);
		System.out.println("battingavg :"+battingavg);
		System.out.println("bowlingavg :"+bowlingavg);
		System.out.println("salarygrade :"+salarygrade);
	}
}

public class ObjCls {

	public static void main(String[] args) {
		Cricketers players1=new Cricketers();
		players1.cricketername="Virat";
		players1.role="Batter";
		players1.battingavg=56.23;
		players1.bowlingavg=156.23;
		players1.salarygrade='A';
		players1.info();
		
		Cricketers players2=new Cricketers();
		players2.cricketername="Bumrah";
		players2.role="Bowler";
		players2.battingavg=16.23;
		players2.bowlingavg=56.23;
		players2.salarygrade='B';
		players2.info();
	}}