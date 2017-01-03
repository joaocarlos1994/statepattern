package br.com.usecabeca;

/**
 * Padrao State permite que um objeto altere o
 * seu comportamento quando o seu estado interno
 * muda. O objeto parecera ter mudado de classe.
 * */
public interface State {
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCranck();
	public void dispense();
}
