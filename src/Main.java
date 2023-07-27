import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome;
        double inicial = 100;
        Scanner entrada = new Scanner(System.in);

        //Obtendo os dados iniciais do Cliente
        System.out.println("Cadastrando novo cliente.");
        System.out.print("Entre com seu nome: ");
        nome = entrada.nextLine();
        

        //Criando a conta de um cliente
        Conta minhaConta = new Conta(nome,inicial);
        minhaConta.iniciar();
    }
}