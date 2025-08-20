package algoritmo1;

public class Exponencial {
    public int calculo(int x, int n){
        Fatorial fatorial = new Fatorial();
        if(n == 0){
            return 1;
        }else{
            return ((int) Math.pow(x, n)) / fatorial.calculo(n) + calculo(x, n - 1);
        }
    }
}
