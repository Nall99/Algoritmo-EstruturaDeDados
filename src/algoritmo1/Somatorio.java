package algoritmo1;

public class Somatorio {
    public int calculo(int n){
        if(n == 1){
            return 1;
        }
        else {
            return n + calculo(n - 1);
        }
    }
}
