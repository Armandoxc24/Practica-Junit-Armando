/**
 * Una clase calculadora simple que realiza operaciones aritméticas básicas.
 *
 * @author Armando Xaixo
 */
public class Calculadora {

	/**
	 * Almacena el último resultado calculado.
	 */
	private float lastResult;

	/**
	 * Almacena la última operación realizada.
	 */
	private String lastOp;

	/**
	 * Método getter para recuperar el último resultado calculado.
	 *
	 * @return El último resultado obtenido de un cálculo.
	 */
	public float getLastResult() {
		return this.lastResult;
	}

	/**
	 * Método getter para recuperar la última operación realizada.
	 *
	 * @return La última operación aritmética (por ejemplo, "Suma", "Resta").
	 */
	public String getLastOp() {
		return this.lastOp;
	}

	/**
	 * Suma dos números y almacena el resultado y la operación.
	 *
	 * @param op1 El primer operando.
	 * @param op2 El segundo operando.
	 * @return La suma de los dos operandos.
	 */
	public float suma(float op1, float op2) {
		float result = op1 + op2;
		this.lastResult = result;
		this.lastOp = "Suma";
		return result;
	}

	/**
	 * Resta dos números y almacena el resultado y la operación.
	 *
	 * @param op1 El primer operando (minuendo).
	 * @param op2 El segundo operando (sustraendo).
	 * @return La diferencia de los dos operandos.
	 */
	public float resta(float op1, float op2) {
		float result = op1 - op2;
		this.lastResult = result;
		this.lastOp = "Resta";
		return result;
	}

	/**
	 * Multiplica dos números y almacena el resultado y la operación.
	 *
	 * @param op1 El primer operando (multiplicando).
	 * @param op2 El segundo operando (multiplicador).
	 * @return El producto de los dos operandos.
	 */
	public float multiplica(float op1, float op2) {
		float result = op1 * op2;
		this.lastResult = result;
		this.lastOp = "Multiplica";
		return result;
	}

	/**
	 * Divide dos números y almacena el resultado y la operación.
	 *
	 * @param op1 El primer operando (dividendo).
	 * @param op2 El segundo operando (divisor).
	 * @return El cociente de los dos operandos.
	 */
	public float divideix(float op1, float op2) {
		float result = op1 / op2;
		this.lastResult = result;
		this.lastOp = "Divideix";
		return result;
	}

	/**
	 * Compara dos números y devuelve verdadero si el primero es mayor que el segundo.
	 *
	 * @param op1 El primer operando.
	 * @param op2 El segundo operando.
	 * @return Verdadero si op1 es mayor que op2, falso en caso contrario.
	 */
	public boolean majorQue(float op1, float op2) {
		return op1 > op2;
	}

	/**
	 * Restablece el estado interno de la calculadora borrando el último resultado y la operación.
	 */
	public void restablecer() {
		this.lastResult = 0;
		this.lastOp = "Ninguna";
	}
}





