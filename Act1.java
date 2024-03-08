
public class Main {
    public static void main(String[] args) {
        int[] lista = {15,2,4,10,20};
        boolean EsIgual = false;

        for(int i = 0; i <lista.length; i++){
            for(int j = i+1; j < lista.length; j++){
                if(i!=j){
                    if(lista[i] + lista[j] == 30){
                        EsIgual = true;
                    }
                }

            }

        }
        System.out.println(EsIgual);
    }
}
