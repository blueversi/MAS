import java.io.Serializable;

public class Terrarium extends ObjectPlus4 implements Serializable {

    private int x;
    private int y;
    private int z;

    private static final int minX = 10;
    private static final int minY = 10;
    private static final int minZ = 15;

    public Terrarium(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) throws Exception {

        if(x > Terrarium.minX) {

            this.x = x;
        } else {
            throw new Exception("Wartość X (szerokość) musi być większa niż " + Terrarium.minX);
        }

    }

    public int getY() {
        return y;
    }

    public void setY(int y) throws Exception {

        if(y > Terrarium.minY) {

            this.y = y;
        } else {
            throw new Exception("Wartość Y (wysokość) musi być większa niż " + Terrarium.minY);
        }

    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) throws Exception {

        if(z > Terrarium.minZ) {

            this.z = z;
        } else {
            throw new Exception("Wartość Y (głębokość) musi być większa niż: " + Terrarium.minZ);
        }
    }

    @Override
    public String toString() {
        return "Terrarium{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }


    //ekstensja
    public static void wyswietlTerraria() throws Exception {
        ObjectPlus.showExtent(Terrarium.class);
    }
}
