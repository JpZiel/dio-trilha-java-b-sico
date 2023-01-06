public class Operadores5 {
    public static void main(String[] args) {
        String nomeUm = "João Pedro";
        String nomeDois = new String("João Pedro");
        // para objetos usar o código "equals".
        System.out.println(nomeUm.equals(nomeDois));
        // para numeros usar os operadores relacionais.
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2) {
            System.out.println("A nossa condição é verdadeira");
        }

        System.out.println("númeroUm é igual a númeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("númeroUm é diferente ao númeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("númeroUm é maior que o númeroDois? " + simNao);
    }
}
