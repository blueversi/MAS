import java.io.Serializable;

public class Terrarium extends ObjectPlusPlus implements Serializable {

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

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
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
