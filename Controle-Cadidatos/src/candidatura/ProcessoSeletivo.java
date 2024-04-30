package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();

    }
    static void imprimirSelecionados (){
        String [] candidatos = { "A", "B", "C", "D", "E" };
        System.out.println("Imprimindo Lista de candidatos informando o indice do elemento");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº " +( indice+1)  + ": " + candidatos[indice] );
        }
    }
    static void selecaoCandidatos(){
        String [] candidatos = { "A", "B", "C", "D", "E", "F", "G", "H", "I" };

        int candidatoSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;
        while (candidatoSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
            if(salarioBase>= salarioPretendido){
                System.out.println("O candidato "+ candidato + " foi selecionado para a vaga ");
                candidatoSelecionados++;
            }
            candidatoAtual++;
        }

    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    static  void analisarCadidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase>salarioPretendido) {
            System.out.println("Ligar para o candidato");
        }else if(salarioBase==salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        }else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }

    }
}
