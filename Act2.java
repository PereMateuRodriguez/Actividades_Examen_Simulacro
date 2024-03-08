public class Main {
    public static void main(String[] args) {
        int[] lista = {10,12,5,2};
        for(int i = 0; i < lista.length; i++){
            for(int j = 0 ; j < lista.length; j++){
                if(lista[i] > lista[j]){
                    int numeropeque = lista[i];
                    lista[i] = lista[j];
                    lista[j] = numeropeque;
                }
            }
        }
        int numerofinal = lista[0] * lista[1] * lista[2];
        System.out.println(numerofinal);

    }
}
