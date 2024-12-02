package ifma.ifma.lista04;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", 8.5, 7.8);
        Aluno aluno2 = new Aluno("Maria", 7.1, 9.0);
        Aluno aluno3 = new Aluno("Ana", 6.8, 8.2);

        DequeList lista = new DequeList();
        lista.addLast(aluno1);
        lista.addLast(aluno2);
        lista.addLast(aluno3);

        System.out.println("Lista de alunos: " + lista);

        System.out.println("Primeiro aluno: " + lista.getFirst().data);
        System.out.println("Último aluno: " + lista.getLast().data);

        Aluno removidoPrimeiro = lista.removeFirst();
        System.out.println("Removendo o primeiro aluno: " + removidoPrimeiro);
        System.out.println("Lista após remoção: " + lista);

        Aluno removidoUltimo = lista.removeLast();
        System.out.println("Removendo o último aluno: " + removidoUltimo);
        System.out.println("Lista após remoção: " + lista);

        try {
            Node encontrado = lista.search("Maria");
            System.out.println("Buscando aluno 'Maria': " + encontrado.data);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            lista.search("Carlos");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
