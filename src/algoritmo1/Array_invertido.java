package algoritmo1;

public class Array_invertido {
    public int[] inverte(int[] array, int inicio, int fim){
        if (fim <= inicio){
            return array;
        }else{
            swap(array, inicio, fim);
            return inverte(array, inicio+1, fim-1);
        }
    }

    public void swap(int [] array, int i, int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
