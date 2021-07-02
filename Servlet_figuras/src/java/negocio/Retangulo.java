package negocio;

public class Retangulo extends Figura {

    public Retangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return base * altura;
    }

    @Override
    public float calcularPerimetro() {
        return (base + altura) * 2;
    }

}
