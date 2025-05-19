package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        //System.out.println("\033[1m-PROCESSO SELETIVO-\033[m\n");
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "ISRAEL", "LUIS"};
        for (String candidato : candidatos)
            entrarEmContato(candidato);
    }
    static void entrarEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
        } while (tentativasRealizadas < 3 && continuarTentando);

        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + "ª tentativa.\n");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM ".concat(candidato).concat(". ".concat(""+tentativasRealizadas).concat(" TENTATIVAS REALIZADAS\n")));
    }
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionados() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "ISRAEL", "LUIS"};
        for (String candidato : candidatos)
            System.out.println(candidato);
    }
    static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "ISRAEL", "LUIS", "PEDRO", "JOÃO", "GUSTAVO", "LUIZA", "GABRIEL"};
        double baseSalarial = 2000;
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double pretensaoSalarial = valorPretendido();

            System.out.println("O candidato " + candidato + ", solicitou este valor de salário: R$" + pretensaoSalarial);
            if (pretensaoSalarial <= baseSalarial) {
                System.out.println("\033[92mO candidato " + candidato + " foi selecionado para a vaga.\033[m");
                candidatosSelecionados++;
            } else {
                System.out.println("\033[91mO candidato " + candidato + " não foi selecionado para a vaga.\033[m");
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double pretensaoSalarial) {
        double baseSalarial = 2000;

        if (baseSalarial > pretensaoSalarial) System.out.println("\033[1;94mLIGAR PARA O CANDIDATO\033[m");
        else if (baseSalarial == pretensaoSalarial) System.out.println("\033[1;93mLIGAR PARA O CANDIDATO COM CONTRA PROPOSTA\033[m");
        else System.out.println("\033[1;91mAGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS\033[m");
    }
}