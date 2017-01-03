package br.com.usecabeca;

public class GumballMachine {
	
	private final State soldOutState;
	private final State noQuarterState;
	private final State hasQuarterState;
	private final State soldState;
	private final State winnerState;
	
	private State state;
	private int count = 0;
	
	public GumballMachine(final int numberGumballs) {
		super();
		this.soldOutState = new SoldOutState(this);
		this.noQuarterState = new NoQuarterState(this);
		this.hasQuarterState = new HasQuarterState(this);
		this.soldState = new SoldState(this);
		this.winnerState = new WinnerState(this);
		this.state = soldOutState;
		this.count = numberGumballs;
		if (numberGumballs > 0)
			state = noQuarterState;
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCranck();
		state.dispense();
	}
	
	public void refill(final int numerOfGoma) {
		if (this.state instanceof SoldOutState) {
			this.count += numerOfGoma;
			setState(noQuarterState);
		} 
	}

	public void setState(final State state) {
		this.state = state;
	}
	
	protected void releaseBall() {
		System.out.println("A gumball comes a rolling out the slot...");
		if (count != 0)
			count -= 1;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getWinnerState() {
		return winnerState;
	}

	public int getCount() {
		return count;
	}
}
