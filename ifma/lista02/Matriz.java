package ifma.ifma.lista02;

public class Matriz {

    static int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    public static void q01() {
        System.out.println("Questão 1:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    System.out.print("0 ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void q02() {
        System.out.println("Questão 2:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j == matriz.length - 1) {
                    System.out.print("0 ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void q03() {
        System.out.println("Questão 3:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length - 1 - i] + " ");
        }
        System.out.println();
    }

    public static void q04() {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][matriz.length - 1 - i];
        }
        System.out.println("Questão 4: " + soma);
    }

    public static void q05() {
        System.out.println("Questão 5:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j >= matriz.length - 1 - i) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void q06() {
        int soma = 0, cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j >= matriz.length - 1 - i) {
                    soma += matriz[i][j];
                    cont++;
                }
            }
        }
        double media = (double) soma / cont;
        System.out.println("Questão 6: " + media);
    }

    public static void q07() {
        System.out.println("Questão 7:");
        for (int i = 1; i < matriz.length; i++) {
            for (int j = matriz.length - i; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();
    }

    public static void q08() {
        int maior = Integer.MIN_VALUE;
        for (int i = 1; i < matriz.length; i++) {
            for (int j = matriz.length - i; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        System.out.println("Questão 8: " + maior);
    }
    public static void q09() {
        System.out.println("Questão 9:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= matriz.length - 1 - i; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();
    }

    public static void q10() {
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= matriz.length - 1 - i; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        System.out.println("Questão 10: " + menor);
    }

    public static void q11() {
        System.out.println("Questão 11:");
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = 0; j < matriz.length - 1 - i; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();
    }

    public static void q12() {
        int produto = 1;
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = 0; j < matriz.length - 1 - i; j++) {
                produto *= matriz[i][j];
            }
        }
        System.out.println("Questão 12: " + produto);
    }

    public static void q13() {
        System.out.println("Questão 13:");
        int[][] matrizB = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    matrizB[i][j] = matriz[i][j] * matriz[i][j];
                } else {
                    matrizB[i][j] = matriz[i][j] * matriz[i][j] * matriz[i][j];
                }
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void q14() {
        System.out.println("Questão 14:");
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = matriz.length - 1; i >= 0; i--) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void q15() {
        System.out.println("Questão 15:");
        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = matriz[i].length - 1; j >= 0; j--) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void q16() {
        System.out.println("Questão 16:");
        for (int j = matriz[0].length - 1; j >= 0; j--) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void q17() {
        System.out.println("Questão 17:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j || i + j == matriz.length - 1) {
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void q18() {
        System.out.println("Questão 18:");
        int[][] matrizC = {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        int[][] transposta = new int[2][3];
        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[i].length; j++) {
                transposta[j][i] = matrizC[i][j];
            }
        }

        for (int i = 0; i < transposta.length; i++) {
            for (int j = 0; j < transposta[i].length; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        q01();
        System.out.println();
        q02();
        System.out.println();
        q03();
        System.out.println();
        q04();
        System.out.println();
        q05();
        System.out.println();
        q06();
        System.out.println();
        q07();
        System.out.println();
        q08();
        System.out.println();
        q09();
        System.out.println();
        q10();
        System.out.println();
        q11();
        System.out.println();
        q12();
        System.out.println();
        q13();
        System.out.println();
        q14();
        System.out.println();
        q15();
        System.out.println();
        q16();
        System.out.println();
        q17();
        System.out.println();
        q18();
        System.out.println();
    }
}
