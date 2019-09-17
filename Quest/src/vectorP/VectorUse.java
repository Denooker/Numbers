package vectorP;

public class VectorUse {
    public static void main(String[] args) {
        Vector one = new Vector(5,3,7);
        Vector two = new Vector(4,7,3);

        System.out.println("Длина вектора one: " + one.vectorLength());
        System.out.println("Скалярное произведение векторов: " + Vector.scalMultiply(one, two));
        System.out.println("Векторное произведение. Получившийся вектор: ");
        Vector.getVector(Vector.vecMultiply(one, two));
        System.out.println("Косинус угла между векторами: " + Vector.cosVec(one, two));
        System.out.println("Векторная сумма. Получившийся вектор: ");
        Vector.getVector(Vector.sumVec(one, two));
        System.out.println("Векторная разность. Получившийся вектор: ");
        Vector.getVector(Vector.diffVec(one, two));

        Vector.vectorArray(5);
        for (int i = 0; i < 5; i++){
            Vector.getVector(Vector.heapVec[i]);
        }
    }
}
