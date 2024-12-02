package ifma.ifma.lista01;

public class Aluno {
    public int codigo;       // Público para manipulação manual
    public String matricula;
    public String nome;

    public Aluno(int codigo, String matricula, String nome) {
        this.codigo = codigo;
        this.matricula = matricula;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{codigo=" + codigo + ", matricula='" + matricula + "', nome='" + nome + "'}";
    }
}