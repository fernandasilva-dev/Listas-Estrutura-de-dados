package ifma.ifma.lista01;

public class TestarAlunos {
    public static void main(String[] args) {
        CadastrarAlunos cadastro = new CadastrarAlunos(5);

        Aluno a1 = new Aluno(3, "20230001", "João");
        Aluno a2 = new Aluno(1, "20230002", "Maria");
        Aluno a3 = new Aluno(2, "20230003", "Carlos");

        cadastro.adicionarNoFinal(a1);
        cadastro.adicionarNoInicio(a2);
        cadastro.adicionarNoFinal(a3);

        System.out.println("Vetor após adicionar alunos:");
        cadastro.exibirVetor();

        System.out.println("\nRemovendo no início...");
        cadastro.removerNoInicio();
        cadastro.exibirVetor();

        System.out.println("\nRemovendo no final...");
        cadastro.removerNoFinal();
        cadastro.exibirVetor();

        System.out.println("\nAdicionando alunos novamente...");
        cadastro.adicionarNoFinal(a3);
        cadastro.adicionarNoInicio(a2);
        cadastro.exibirVetor();

        System.out.println("\nRemovendo com índice 1...");
        String removido = cadastro.removerComIndice(1);
        System.out.println("Aluno removido: " + removido);
        cadastro.exibirVetor();

        System.out.println("\nOrdenando por código...");
        cadastro.ordenarVetor();
        cadastro.exibirVetor();
    }
}