package linkMethod;

public class MethodRefDemo {

    public static void main(String[] args) {
        boolean result;

        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);

        IntPredicate ip = myNum::isFactor;

        result = ip.test(3);
        if(result) System.out.println("3 является делителем " + myNum.getNum());

        ip = myNum2::isFactor;
        result = ip.test(3);
        if(!result) System.out.println("3 не яыляется делителем " + myNum2.getNum());

        ip = myNum::hasCommonFactor;
        result = ip.test(7);
        System.out.println(result);
    }
}
