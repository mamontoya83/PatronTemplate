package adapter;

public abstract class Motor {
	public final void recorrido(){
		System.out.println("*********************************");
		System.out.println("RECORRIDO\n"+this.getClass().getSimpleName());
		System.out.println(encender());
		System.out.println(acelarar());
		System.out.println(apagar());
		System.out.println("*********************************\n");
	}
	public abstract String encender();
	public abstract String acelarar();
	public abstract String apagar();
}
