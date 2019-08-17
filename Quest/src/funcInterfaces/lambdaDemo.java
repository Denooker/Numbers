package funcInterfaces;

public class lambdaDemo {
    public static void main(String[] args) {
        MyTest bolshemenshe = (v)-> v>=10&v<=20;
        System.out.println(bolshemenshe.testing(15));

        NumericFunc<Integer> fact = (v) -> {
            int p = 1;
            for (int i = v; i > 0; i--){
                p = p*i;
            }
            return p;
        };

        System.out.println(fact.factorial(5));
    }
}
