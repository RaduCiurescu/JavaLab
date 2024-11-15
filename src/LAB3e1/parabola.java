package LAB3e1;

public class parabola
{
    private final int a;
    private final int b;
    private final int c;
    public parabola(int a, int b, int c){
        super();
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
    public String toString()
    {
        return "f(x)="+a+"x^2+"+b+"x+"+c;
    }
    public double[] varf()
    {
        double v1,v2 ;
    v1=(double)-b/2*a;
    v2=(double)(-b^2+4*a*c)/4*a;
        return new double[]{v1,v2};
    }
    public String mij_varf_parabole(parabola p)
    {
        double[] vf1,vf2;
        double x,y;
        vf1=this.varf();
        vf2=p.varf();
        x= (vf1[0]+vf2[0])/2;
        y=(vf1[1]+vf2[1])/2;
        return "("+x+","+y+")";
    }
    public String mij_varf_2parabole(parabola p1, parabola p2)
    {
        double[] vf1,vf2;
        double x,y;
        vf1=p1.varf();
        vf2=p2.varf();
        x= (vf1[0]+vf2[0])/2;
        y=(vf1[1]+vf2[1])/2;
        return "("+x+","+y+")";
    }
    public double lung_seg_varf(parabola p)
    {
        double[] vf1,vf2;
        double l;
        vf1=this.varf();
        vf2=p.varf();
        l=Math.hypot(vf2[0]-vf1[0],vf2[1]-vf1[1]);
        return l;
    }
    public double lung_seg_2varf(parabola p1,parabola p2)
    {
        double[] vf1,vf2;
        double l;
        vf1=p1.varf();
        vf2=p2.varf();
        l=Math.hypot(vf2[0]-vf1[0],vf2[1]-vf1[1]);
        return l;
    }

}