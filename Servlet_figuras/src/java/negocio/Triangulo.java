package negocio;

public class Triangulo extends Figura {

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return base * altura / 2;
    }

    @Override
    public float calcularPerimetro() {
        return base * 3;
    }
}
