package one.digitalinnovation.gof.singleton;

public class SingletonLazyHolder {
	/*encapsula a intancia em uma classe estatica externa */
	private static class InstanceHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}
