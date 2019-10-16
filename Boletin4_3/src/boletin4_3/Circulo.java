package boletin4_3;

/**
 *
 * @author cfigueirasvalverde
 */
class Circulo {
    private double radio;
    private final double PI = 3.14;

    public Circulo() {
        this.radio = 0;
    }

    public Circulo(double r) {
        this.radio = r;
    }

    public void setRadio(double r) {
        this.radio = r;
    }

    public double getRadio() {
        return this.radio;
    }

    public double area() {
        return Math.pow(this.radio, 2) * PI;
    }

    public double longitud() {
        return 2 * this.radio * PI;
    
}
}