package algoritmo1;

public class MDC {
    public int calculo(int a, int b){
        while(b > 0){
            int tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }

    public int calculo_recursivo(int a, int b){
        if(b == 0){
            return a;
        }else{
            return calculo_recursivo(b, a % b);
        }
    }
}
