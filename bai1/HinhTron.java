public class HinhTron {
    private double banKinh;
    private Toa tam;
    public final double pi = 3.14;


    public double getbanKinh(){
        return banKinh;
    }
    public Toa gettam(){
        return tam;
    }
    public void setbanKinh(double r) throws Exception{
        if (r>0) {
            this.banKinh = r;
            
        } else {
            throw new Exception("Loi");
        }
    }
    public void settam(Toa tam){
        this.tam = tam;
    }
    public HinhTron(double r, Toa tam){
        this.tam = tam;
        this.banKinh = r;
    }
    public double tinhdientich(){
        return getbanKinh()*getbanKinh()*pi;
    }
    public double tinhchuvi(){
        return getbanKinh()*2*pi;
    }
    @Override
    public String toString() {
        return "hinh torn co ban kinh " + banKinh + ", va tam" + tam;
    }
}
