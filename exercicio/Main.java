package exercicio;

public class Main {
    public static void main(String[] args) {
        boolean acesa= true;

        if(acesa) {
            System.out.println("A luz está acesa");
        } else {
            System.out.println("A luz está apagada");
        }
        int acendida= 20;
        String resultado= acendida > 10 ? "A luz está acesa" : "A luz está apagada";
        System.out.println(resultado);
    
        int idade= 50;
        if (idade < 12) {
            System.out.println("Criança");
        } else if (idade < 18) {
            System.out.println("Adolescente");
        } else if (idade < 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }   

    
            

    }
}
