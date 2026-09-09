public class BoletimAluno {

    private static final double MEDIA_MINIMA_APROVACAO = 6.0;

    public static void main(String[] args) {C:\Users\gabri\NetBeansProjects\boas-praticas-software
        String nomeAluno = "Carlos";
        double primeiraNota = 8;
        double segundaNota = 7;

        double mediaFinal = calcularMedia(primeiraNota, segundaNota);
        String situacao = verificarSituacao(mediaFinal);

        exibirResultado(nomeAluno, mediaFinal, situacao);
    }

    private static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    private static String verificarSituacao(double media) {
        if (media >= MEDIA_MINIMA_APROVACAO) {
            return "Aprovado";
        }
        return "Reprovado";
    }

    private static void exibirResultado(String nome, double media, String situacao) {
        System.out.println("Aluno: " + nome);
        System.out.println("Media: " + media);
        System.out.println(situacao);
    }
}