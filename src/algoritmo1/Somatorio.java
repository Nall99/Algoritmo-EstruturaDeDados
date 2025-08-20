package algoritmo1;

public class Somatorio {
    public int soma(int n){
        if(n == 1){
            return 1;
        }
        else {
            return n + soma(n - 1);
        }
    }
}
