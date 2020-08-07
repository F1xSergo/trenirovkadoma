package trenirovkadoma.rekursia;

public class Test {
    public static void main(String[] args) {
//4! = 4 * 3 * 2 * 1
        System.out.println(fac(4));
    }

    private static int fac(int n){
            if(n == 1)
                return 1;
            return n * fac(n - 1);
    }
}
