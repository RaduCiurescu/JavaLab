package lab4ex1;


public class imprimanta extends echipament{
    private int ppm;
    private int p_car;
    private int dpi;
    private Mod mod;
    public imprimanta(String denumire, Integer nr_inv, Double pret, String zona_mag, Stare_echipament stare,int ppm, int p_car,Mod mod,int dpi)
    {
        super(denumire,nr_inv,pret,zona_mag,stare);
        this.ppm=ppm;
        this.p_car=p_car;
        this.mod=mod;
        this.dpi=dpi;
    }
    public void setare_mod(Mod altmod)
    {
        this.mod=altmod;

    }
    @Override
    public String toString() {
        return "imprimanta{" +
                "ppm=" + ppm +
                ", p_car=" + p_car +
                ", dpi=" + dpi +
                ", mod=" + mod +
                ", denumire='" + denumire + '\'' +
                ", nr_inv=" + nr_inv +
                ", pret=" + pret +
                ", zona_mag='" + zona_mag + '\'' +
                ", stare=" + stare +
                '}';
    }
}
