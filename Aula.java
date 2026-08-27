package aula;

public class Aula {
    public static void main(String[] args) {
       
    
String saudacao = "Hello World!";
System.out.println(saudacao.toLowerCase());
System.out.println(saudacao.toUpperCase());
System.out.println(saudacao.indexOf("o"));
System.out.println(saudacao.charAt(6));

//aula 4
String aluno_1 = "miranata";
String aluno_2 = "aeronauta";
System.out.println(aluno_1.equals(aluno_2));
String mensagem = "Hello World!";
System.out.println("-" + mensagem.trim() + "-");
    }
}