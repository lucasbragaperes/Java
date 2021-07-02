
package negocio;

/**
 *
 * @author Davi Reis <davi@davi.pro.br>
 */
public class Massa implements IMassa {

    @Override
    public float converterQuiloParaLibra(float peso) {
        return peso * 2.2046f;
    }

    @Override
    public float converterLibraParaQuilo(float peso) {
        return peso / 2.2046f;
    }
    
}
