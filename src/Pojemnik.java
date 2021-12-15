public abstract class  Pojemnik {
    protected int bokA, bokB, wysokosc;
    protected double objetosc;

    public Pojemnik(int bokA, int bokB, int wysokosc) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.wysokosc = wysokosc;
        this.objetosc =((bokA*bokB) * wysokosc)/1000d;
    }

    public int getBokA() {
        return bokA;
    }

    public void setBokA(int bokA) {
        this.bokA = bokA;
    }

    public int getBokB() {
        return bokB;
    }

    public void setBokB(int bokB) {
        this.bokB = bokB;
    }

    public int getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }

    public double getObjetosc(){
        this.objetosc =((bokA*bokB) * wysokosc)/1000;
        return this.objetosc;
    }

    //metoda abstrakcyjna do polimorfizmu
    public abstract double getProcentZapelnienia();
}
