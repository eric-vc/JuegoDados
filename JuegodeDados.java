
public class JuegodeDados {

	private Dado tirada1, tirada2, tirada3;

	public JuegodeDados() {
		tirada1 = new Dado();
		tirada2 = new Dado();
		tirada3 = new Dado();

	}

	private void resultado() {
		tirada1.tirar();
		tirada1.imprimir();
		tirada2.tirar();
		tirada2.imprimir();
		tirada3.tirar();
		tirada3.imprimir();

		if (tirada1.retornarValor() == tirada2.retornarValor() && tirada1.retornarValor() == tirada3.retornarValor()) {
			System.out.println("TRIPLE, has ganado!!!");

		} else {
			System.out.println("Has perdido!!!");

		}

	}

	public static void main(String[] args) {
		JuegodeDados juego = new JuegodeDados();
		juego.resultado();

	}

}
