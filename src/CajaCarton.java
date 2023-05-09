public class CajaCarton extends Caja {

    private double getAlto() {
        return 0;
    }

    private double getFondo() {
        return 0;
    }

    private double getAncho() {
        return 0;
    }

    public CajaCarton(int ancho, int alto, int fondo) {
        super(ancho, alto, fondo, Unidad.CM);
    }

    public double getVolumen() {
        double volumenReal = super.getVolumen();
        double volumenUtil = volumenReal * 0.8;
        return volumenUtil;
    }


    public static double getSuperficieTotal(CajaCarton[] cajas) {
        double superficieTotal = 0;
        for (int i = 0; i < cajas.length; i++) {
            double areaBase = cajas[i].getAncho() * cajas[i].getFondo();
            double areaLateral1 = cajas[i].getAncho() * cajas[i].getAlto();
            double areaLateral2 = cajas[i].getFondo() * cajas[i].getAlto();
            double superficieCaja = 2 * areaBase + 2 * areaLateral1 + 2 * areaLateral2;
            superficieTotal += superficieCaja;
        }
        return superficieTotal / 10000;
    }


}
