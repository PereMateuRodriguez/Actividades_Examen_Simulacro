//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String numero = "123";
        String abc = "-zyxwvutsrqponmlkjihgfedcba";
        //Passar numero de string a int
        int numero_1 = Character.getNumericValue(numero.charAt(0));
        int numero_2 = Character.getNumericValue(numero.charAt(1));
        int numero_3 = Character.getNumericValue(numero.charAt(2));

        String N_1 = numero.charAt(0) + "" + numero.charAt(1);
        int numero1_2 = Integer.parseInt(N_1);
        String N_2 = numero.charAt(1) + "" + numero.charAt(2);
        int numero2_3 = Integer.parseInt(N_2);
        //Meter en la lista 
        String[] lista = new String[3];
        lista[0] =  abc.charAt(numero_1) + "" + abc.charAt(numero_2) + "" + abc.charAt(numero_3);
        lista[1] =  abc.charAt(numero_1) + "" + abc.charAt(numero2_3);
        lista[2] = abc.charAt(numero1_2) + "" + abc.charAt(numero_3);

        System.out.println(lista[0]);
        System.out.println(lista[1]);
        System.out.println(lista[2]);

    }
}
