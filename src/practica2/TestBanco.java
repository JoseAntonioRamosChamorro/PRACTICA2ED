package practica2;
/**
 *  
 * @author JoseAnt
 * @version 1.0
 */
public class TestBanco {

	public static void main(String[] args) {
		/**
		 * 
		 */
		/* Antonio y Beatriz se hacen cliente del banco */
		Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n");
		Cliente beatriz = new Cliente("987654321A", "Beatriz Benítez", "Calle Sol, 4");
 
		/* Por defecto, todas las cuentas nuevas tienen 100€ */
		Cuenta cuentaAntonio = new Cuenta(48151, 100, antonio);
		Cuenta cuentaBeatriz = new Cuenta(62342, 100, beatriz);
 
		/* Antonio y Beatriz consultan el saldo */
		SaldoInicial(cuentaAntonio, cuentaBeatriz);
 
		/* Beatriz transfiere 50€ a Antonio */
		PrimeraTransferencia(cuentaAntonio, cuentaBeatriz);
 
		/* Antonio y Beatriz vuelven a consultar para comprobar que todo ha ido bien */
		ConsultarSaldoActual(cuentaAntonio, cuentaBeatriz);
 
		/* Antonio gana 100€ en una rifa y hace un ingreso en su cuenta */
		Rifa(cuentaAntonio);
 
		/* Beatriz tiene que pagar 30€ a hacienda y retira el dinero */
		PagarHacienda(cuentaBeatriz);
 
		/* Antonio transfiere 50€ a Beatriz */
		TransferenciaAntonio_Beatriz(cuentaAntonio, cuentaBeatriz);
	}

	private static void SaldoInicial(Cuenta cuentaAntonio, Cuenta cuentaBeatriz) {
		
		System.out.println("La cuenta de " + cuentaAntonio.getCliente().getNombre() + " tiene "
				+ cuentaAntonio.getSaldo() + " euros.");
		System.out.println("La cuenta de " + cuentaBeatriz.getCliente().getNombre() + " tiene "
				+ cuentaBeatriz.getSaldo() + " euros.");
	}
/**
 * 
 * @param cuentaAntonio contiene la informacion de la cuenta de de Antonio
 * @param cuentaBeatriz contiene la informacion de la cuenta de de Beatriz
 */
	private static void TransferenciaAntonio_Beatriz(Cuenta cuentaAntonio, Cuenta cuentaBeatriz) {
		int transferencia = 50;
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() - transferencia);
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() + transferencia);
	}
/**
 * 
 * @param cuentaBeatriz contiene la informacion de la cuenta de de Beatriz
 * 
 */
	private static void PagarHacienda(Cuenta cuentaBeatriz) {

		int pago = 30;
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - pago);
	}

/**
 * 
 * @param cuentaAntonio contiene la informacion de la cuenta de de Antonio
 */
	private static void Rifa(Cuenta cuentaAntonio) {
		int conseguidoenlaloteria = 100;
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + conseguidoenlaloteria);
	}

	/**
	 * 
	 * @param cuentaAntonio contiene la informacion de la cuenta de de Antonio
	 * @param cuentaBeatriz contiene la informacion de la cuenta de de Beatriz
	 */
	private static void ConsultarSaldoActual(Cuenta cuentaAntonio, Cuenta cuentaBeatriz) {
		System.out.println("La cuenta de " + cuentaAntonio.getCliente().getNombre() + " tiene "
				+ cuentaAntonio.getSaldo() + " euros.");
		System.out.println("La cuenta de " + cuentaBeatriz.getCliente().getNombre() + " tiene "
				+ cuentaBeatriz.getSaldo() + " euros.");
	}
/**
 * 
 * @param cuentaAntonio contiene la informacion de la cuenta de de Antonio
 * @param cuentaBeatriz contiene la informacion de la cuenta de de Beatriz
 */
	private static void PrimeraTransferencia(Cuenta cuentaAntonio, Cuenta cuentaBeatriz) {
		int transferir = 50;
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - transferir);
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + transferir);
	}
}
