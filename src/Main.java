public class Main {
    public static void main(String[] args) {


        // Fib - Rekurenycjny
        long millisActualTimeFibRek = System.nanoTime();
        for (int i = 0;i<1000;i++){
            fibRek(6);
        }
        long executionTimeFibRek = System.nanoTime() - millisActualTimeFibRek;


        // Fib - Iteracyjny
        long millisActualTimeFibIte = System.nanoTime();
        for (int i = 0;i<1000;i++){
            fibIte(6);
        }
        long executionTimeFibIte = System.nanoTime() - millisActualTimeFibIte;


        // Silnia - Rekurencja
        long millisActualTimeSilRek = System.nanoTime();
        for (int i = 0;i<1000;i++){
            silniaRec(6);
        }
        long executionTimeSilRek = System.nanoTime() - millisActualTimeSilRek;


        // Silnia - Iteracja
        long millisActualTimeSilIte = System.nanoTime();
        for (int i = 0;i<1000;i++){
            silniaIte(6);
        }
        long executionTimeSilIte = System.nanoTime() - millisActualTimeSilIte;


        System.out.println("FibRek: " + executionTimeFibRek);
        System.out.println("FibIte: " + executionTimeFibIte);
        System.out.println("SilRek: " + executionTimeSilRek);
        System.out.println("SilIte: " + executionTimeSilIte);
    }

    public static int fibRek(int a){
        if(a == 1 || a == 2){
            return 1;
        }else if(a == 0){
            return 0;
        }

        return fibRek(a-1) + fibRek(a-2);
    }

    public static int fibIte(int a){
        if(a < 2){
            return a;
        }

        int prev = 0, curr = 1;
        for(int i = 2; i<=a; i++){
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }



    // Silnia rekurencyjnie
    public static int silniaRec(int a) {
        if (a == 0) {
            return 1;
        } else {
            return a * silniaRec(a-1);
        }
    }

    // Silnia iteracyjnie
    public static int silniaIte(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }

        return result;
    }
}