package com.busyqa.coursework.wk3_answer;

/*
 * Instructions:
 * 
 * Complete the code in your editor by writing an overridden getNumberOfTeamMembers
 * method that prints the same statement as the superclass' getNumberOfTeamMembers 
 * method, except that it replaces n with 11 (the number of players in a Soccer team).
 * 
 * When executed, your completed code should print the following:
 * 
 *     Generic Sports
 *     Each team has n players in Generic Sports
 *     Soccer Class
 *     Each team has 11 players in Soccer Class
 * 
 */

class Sports {

	String getName() {
		return "Generic Sports";
	}

	void getNumberOfTeamMembers() {
		System.out.println("Each team has n players in " + this.getName());
	}
}

class Soccer extends Sports {
	@Override
	String getName() {
		return "Soccer Class";
	}

	@Override
	void getNumberOfTeamMembers() {
		System.out.println("Each team has 11 players in " + this.getName());
	}

	/*
	 * Write your overridden getNumberOfTeamMembers method here!!!
	 */
}

public class Overriding {

	public static void main(String[] args) {

		Sports c1 = new Sports();
		Soccer c2 = new Soccer();

		System.out.println(c1.getName());
		c1.getNumberOfTeamMembers();

		System.out.println(c2.getName());
		c2.getNumberOfTeamMembers();
	}
}