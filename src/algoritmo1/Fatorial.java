package algoritmo1;

public class Fatorial {
    public int fatorial(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n * fatorial(n-1);
        }
    }
}
