
package negocio;

/**
 *
 * @author Davi Reis <davi@davi.pro.br>
 */
public abstract class Calculo implements ICalculo{
    protected float resultado, valor1, valor2;

    public Calculo(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public float getResultado() {
        return resultado;
    }
    
}
