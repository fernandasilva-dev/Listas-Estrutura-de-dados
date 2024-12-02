package ifma.ifma.lista01;

public class CadastrarAlunos {
    private Aluno[] vetor;
    private int tamanhoAtual;

    public CadastrarAlunos(int tamanho) {
        vetor = new Aluno[tamanho];
        tamanhoAtual = 0;
    }

    public void adicionarNoFinal(Aluno aluno) {
        if (tamanhoAtual < vetor.length) {
            vetor[tamanhoAtual] = aluno;
            tamanhoAtual++;
        } else {
            System.out.println("Vetor cheio! Não é possível adicionar no final.");
        }
    }

    public void adicionarNoInicio(Aluno aluno) {
        if (tamanhoAtual < vetor.length) {
            for (int i = tamanhoAtual; i > 0; i--) {
                vetor[i] = vetor[i - 1];
            }
            vetor[0] = aluno;
            tamanhoAtual++;
        } else {
            System.out.println("Vetor cheio! Não é possível adicionar no início.");
        }
    }

    public void removerNoFinal() {
        if (tamanhoAtual > 0) {
            vetor[tamanhoAtual - 1] = null;
            tamanhoAtual--;
        } else {
            System.out.println("Vetor vazio! Não é possível remover no final.");
        }
    }

    public void removerNoInicio() {
        if (tamanhoAtual > 0) {
            for (int i = 0; i < tamanhoAtual - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
            vetor[tamanhoAtual - 1] = null;
            tamanhoAtual--;
        } else {
            System.out.println("Vetor vazio! Não é possível remover no início.");
        }
    }

    public boolean verificarIndice(int indice) {
        return indice >= 0 && indice < tamanhoAtual && vetor[indice] != null;
    }

    public String removerComIndice(int indice) {
        if (!verificarIndice(indice)) {
            System.out.println("Índice inválido ou sem aluno.");
            return null;
        }

        String nomeRemovido = vetor[indice].nome;

        if (indice == 0) {
            removerNoInicio();
        } else if (indice == tamanhoAtual - 1) {
            removerNoFinal();
        } else {
            for (int i = indice; i < tamanhoAtual - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
            vetor[tamanhoAtual - 1] = null;
            tamanhoAtual--;
        }

        return nomeRemovido;
    }

    public void ordenarVetor() {
        for (int i = 0; i < tamanhoAtual - 1; i++) {
            for (int j = i + 1; j < tamanhoAtual; j++) {
                if (vetor[i].codigo > vetor[j].codigo) {
                    Aluno temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
    }

    public void exibirVetor() {
        for (int i = 0; i < tamanhoAtual; i++) {
            System.out.println(vetor[i]);
        }
    }
}