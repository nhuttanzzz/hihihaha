public class Toa {
    private String ten;
    private double x;
    private double y;
    public String getten(){
        return ten;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setten(String t) throws Exception{
        if(ten != " "){
            this.ten = t;
        }
        else{
            throw new Exception("Loi");
        }

    }
    public void setX(double x){
        this.x = x;
    }
    public void getY(double y){
        this.y = y;

    }
    public Toa(String t, double x, double y){
        this.ten = t;
        this.x = x;
        this.y = y;
    }
    public Toa(){
    }
    @Override
    public String toString() {
       String s=" ";
       s=s+s.format("%5s(%2s;%2s)", getten(), getX(), getY() );
        return s;
    }
    public static void main(String[] args) {
        Toa a1 = new Toa("wx", 21, 12);
        System.out.println(a1);
    }



}


    

