package br.com.usecabeca;

public class SoldOutState implements State {
	
	private final GumballMachine gumballMachine;
	
	public SoldOutState(final GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can't insert a quarter, the machine is sold out");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You can't eject, you haven't inserted a quarter yet");
	}

	@Override
	public void turnCranck() {
		System.out.println("You turned, but there are no gumballs");
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}
}
