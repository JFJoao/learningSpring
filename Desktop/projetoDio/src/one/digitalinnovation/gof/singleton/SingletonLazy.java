package one.digitalinnovation.gof.singleton;

public class SingletonLazy {
	
	/*Criando uma instancia dele mesmo*/
	private static SingletonLazy instancia;
	/*para garantir que ninguem vai instaciar esse padrão de projeto ele deve ter um construtor privado */
	private SingletonLazy() {
		super();
	}
	
	/*garantir que a instacia vai ser exposta para quem chamar. 
	 * Metodo estatico
	 */
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
