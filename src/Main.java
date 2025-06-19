import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Filme filme = new Filme();
        IngressoFamilia ingressoFamilia = new IngressoFamilia();

        String op;

        filme.setNomeDoFilme("Mario");
        filme.setValor(100);
        ingressoFamilia.setDesconto(0.5);

        String nomeDoFilme = filme.getNomeDoFilme();
        double valorIngresso = filme.getValor();
        double valorMeiaEntrada = valorIngresso / 2;
        double porcentagemDesconto = ingressoFamilia.getDesconto();

        System.out.println("==================================");
        System.out.println("Bem vindo!!!");
        System.out.println("Filme " + nomeDoFilme + " esta disponível");

        System.out.println("Escolha a linguagem: (Dublado ou legendado)");
        filme.setLinguagem(sc.next());
        String linguagemFilme = filme.getLinguagem();
        System.out.println("Voce escolheu " + linguagemFilme);

        System.out.println("Escolha o tipo de ingresso: (Inteira, Meia ou Familia)");
        op = sc.next();

        switch (op) {
            case "Inteira":
                System.out.println("O valor do ingresso fica: R$" + valorIngresso);
                break;

            case "Meia":
                System.out.println("O valor do ingresso fica: R$" + valorMeiaEntrada);
                break;

            case "Familia":
                System.out.println("Digite o número de pessoas:");

                ingressoFamilia.setQuantidadeDePessoas(Integer.parseInt(sc.next()));
                int quantidadeDePessoas = ingressoFamilia.getQuantidadeDePessoas();

                double valorIngressoFamilia = valorIngresso * quantidadeDePessoas;

                if (quantidadeDePessoas > 3) {
                    double valorComDesconto = valorIngressoFamilia / porcentagemDesconto;
                    System.out.println("O valor dos ingressos com desconto fica:  R$" + valorComDesconto);
                } else{
                    System.out.println("O valor dos ingressos fica:  R$" + valorIngressoFamilia);
                }
                break;
        }
        System.out.println("==================================");
    }
}