package vectorP;
/*
https://habr.com/ru/post/440436/#20
 */

public class Vector {
    private double x;
    private double y;
    private double z;
    static Vector[] heapVec;

    Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void getVector(Vector a){
        System.out.println("Координаты:" + " х: " + a.x + " y: " + a.y + " z: " + a.z);
    }

    public double vectorLength(){
        return Math.sqrt((x * x) + (y * y) + (z * z));
    }

    public static double scalMultiply(Vector a, Vector b){
        return (a.x * b.x) + (a.y * b.y) + (a.z * b.z);
    }

    public static Vector vecMultiply(Vector a, Vector b){
        Vector c = new Vector((a.y * b.z) - (a.z * b.y) , (a.z * b.x - a.x * b.z), (a.x * b.y - a.y * b.x));
        return c;
    }

    public static double cosVec(Vector a, Vector b){
        return scalMultiply(a,b)/a.vectorLength()*b.vectorLength();
    }

    public static Vector sumVec (Vector a, Vector b){
        Vector c = new Vector(a.x + b.x , a.y + b.y , a.z + b.z);
        return c;
    }

    public static Vector diffVec(Vector a, Vector b){
        Vector c = new Vector(a.x - b.x , a.y - b.y , a.z - b.z);
        return c;
    }

    public static void vectorArray(int n){
        heapVec = new Vector[n];
        for (int i = 0; i < heapVec.length; i++){
            heapVec[i] = new Vector(Math.random()*10,Math.random()*10, Math.random()*10);
        }
    }


}
