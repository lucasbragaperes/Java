package negocio;

/**
 *
 * @author Gabriel
 */
public abstract class Calculo implements ICalculo {

    @Override
    public float calcular() {
        return 1.6f;
    }

    public abstract float somar(float v1, float v2);

    public abstract float subtrair(float v1, float v2);

    public abstract float multiplicar(float v1, float v2);

    public abstract float dividir(float v1, float v2);
}
