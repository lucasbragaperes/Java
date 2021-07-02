package negocio;

/**
 *
 * @author Gabriel
 */
public class Adicao extends Calculo {

    @Override
    public float somar(float v1, float v2) {
        return v1 + v2;
    }

    @Override
    public float subtrair(float v1, float v2) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public float multiplicar(float v1, float v2) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public float dividir(float v1, float v2) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
