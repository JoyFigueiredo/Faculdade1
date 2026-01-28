package KMedoids;

import java.util.Arrays;
import java.util.TreeSet;

import Comun.Amostra;
import Comun.ReaderWriter;

public class Main {

    static int k = 3; // número de grupos
    static int escolhaDistancia = 1; // 0=Manhattan,1=Euclidiana,2=Minkowski3,3=Minkowski4
    static int maxIter = 100;

    public static void main(String[] args) {

        Amostra[] base = ReaderWriter.aux.readWindow();
        if (base == null) {
            System.out.println("Arquivo não carregado.");
            return;
        }

        // roda K (centroides por ponto médio)
        KMedoids km = new KMedoids(escolhaDistancia, k);
        int[] labels = km.fit(base, maxIter);
        double[][] centroides = km.getCentroides();

        // montar conjunto de classes (a partir de Y[0])
        TreeSet<Double> classesSet = new TreeSet<>();
        for (Amostra a : base)
            classesSet.add(a.Y[0]);
        Double[] classes = classesSet.toArray(new Double[0]);

        // contagem por grupo x classe
        int[][] tabela = new int[k][classes.length];
        for (int i = 0; i < base.length; i++) {
            int g = labels[i];
            double classeVal = base[i].Y[0];
            int col = Arrays.binarySearch(classes, classeVal);
            if (col >= 0)
                tabela[g][col]++;
        }

        // imprimir cabeçalho
        System.out.print("Grupo\\Classe");
        for (Double c : classes)
            System.out.printf(" | %s", c);
        System.out.println();

        // imprimir linhas
        for (int g = 0; g < k; g++) {
            System.out.printf("Grupo %d       ", g);
            for (int col = 0; col < classes.length; col++) {
                System.out.printf(" | %4d", tabela[g][col]);
            }
            System.out.println();

        }
    }
}
