package ifma.ifma.lista03;

public class Test {
    public static void main(String[] args) {
        SimpleList lista = new SimpleList();

        System.out.println("Adicionando no início:");
        lista.adicionarInicio(5);
        lista.adicionarInicio(3);
        lista.adicionarInicio(1);
        System.out.println(lista);

        System.out.println("Adicionando no final:");
        lista.adicionarFim(7);
        lista.adicionarFim(9);
        System.out.println(lista);

        System.out.println("Removendo do início:");
        lista.removeComeco();
        System.out.println(lista);

        System.out.println("Removendo do final:");
        lista.removerFinal();
        System.out.println(lista);

        System.out.println("Maior valor: " + lista.maiorValor());
        System.out.println("Menor valor: " + lista.menorValor());
        System.out.println("Média dos valores: " + lista.mediaValores());
    }
}


