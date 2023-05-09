public class Caja {
    private final int ancho;
    private final int alto;
    private final int fondo;
    private final double factorConversion;
    private String etiqueta;

    public enum Unidad {
        CM,
        M
    }

    public Caja(int ancho, int alto, int fondo, Unidad unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;

        if (unidad == Unidad.CM) {
            this.factorConversion = 0.000001;
        } else if (unidad == Unidad.M) {
            this.factorConversion = 1;
        } else {
            throw new IllegalArgumentException("Unidad de medida no soportada.");
        }
    }

    public double getVolumen() {
        double volumen = (ancho * alto * fondo) * factorConversion * factorConversion * factorConversion;
        return volumen;
    }

    public void setEtiqueta(String etiqueta) {
        if (etiqueta.length() <= 30) {
            this.etiqueta = etiqueta;
        } else {
            throw new IllegalArgumentException("La etiqueta no puede superar los 30 caracteres.");
        }
    }

    public String toString() {
        return "Caja [ancho=" + ancho + " cm, alto=" + alto + " cm, fondo=" + fondo + " cm, etiqueta=" + etiqueta + "]";
    }
}
