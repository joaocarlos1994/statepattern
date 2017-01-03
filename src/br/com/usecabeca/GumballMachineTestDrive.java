package br.com.usecabeca;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		
		final GumballMachine gumballMachine = new GumballMachine(10);
		
		//System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println();
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println();
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
	}

}
