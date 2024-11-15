package lab4ex1;

public class copiator extends echipament {
    private int p_ton;
    private Format format;

    public copiator(String denumire, Integer nr_inv, Double pret, String zona_mag, Stare_echipament stare, int p_ton, Format format) {
        super(denumire, nr_inv, pret, zona_mag, stare);
        this.p_ton = p_ton;
        this.format = format;
    }

    @Override
    public String toString() {
        return "copiator{" +
                "denumire='" + denumire + '\'' +
                ", p_ton=" + p_ton +
                ", format=" + format +
                ", nr_inv=" + nr_inv +
                ", pret=" + pret +
                ", zona_mag='" + zona_mag + '\'' +
                ", stare=" + stare +
                '}';
    }
}
