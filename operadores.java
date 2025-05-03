public class operadores {
    public static void main(String[] args) throws Exception {
        String nomeCompleto = "jarbson" + "alves";
        System.out.println(nomeCompleto);
        int numero = 10;
        numero = - numero;
        System.out.println(numero);
        numero = numero * -1;
        System.out.println(numero);
        //x repetiçao
        int  numero1 = 10;
        numero1++;
        System.out.println(numero1);
        // numero++; é o mesmo que numero = numero + 1;
        // numero--; é o mesmo que numero = numero - 1;
        boolean variavel = true;
        variavel = !variavel; // ! inverte o valor da variavel
        System.out.println(variavel);
        //invertendo o valor da variavel
        int a, b;
        a = 10;
        b = 20;
        String resultado = (a == b) ? "verdadeiro" : "falso"; // operador ternario
        System.out.println(resultado);
        // operador ternario é uma forma de simplificar o if else
        // exemplo: if (a == b) { resultado = "verdadeiro"; } else { resultado = "falso"; }
    }
}
