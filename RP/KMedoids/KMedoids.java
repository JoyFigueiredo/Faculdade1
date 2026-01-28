package KMedoids;

import java.util.Random;

import Comun.Amostra;

/**
 * Implementação K (centroides por PONTO MÉDIO) com escolha de métrica.
 * NOTE: embora o nome seja KMedoids, esta versão atualiza centroides por média
 * (comportamento de K-Means), já que você pediu explicitamente cálculo do ponto
 * médio.
 */
public class KMedoids {

    private int k;
    private int escolhaDistancia; // 0=Manhattan,1=Euclidiana,2=Minkowski3,3=Minkowski4
    private double[][] centroides; // centroides (k x qtdIn)
    private Random rand = new Random();

    public KMedoids(int escolhaDistancia, int k) {
        this.k = k;
        this.escolhaDistancia = escolhaDistancia;
    }

    /** inicializa centroides copiando K amostras aleatórias (X) */
    private void inicializarCentroides(Amostra[] dados) {
        int dims = Amostra.qtdIn;
        centroides = new double[k][dims];
        boolean[] usado = new boolean[dados.length];
        for (int c = 0; c < k; c++) {
            int idx;
            do {
                idx = rand.nextInt(dados.length);
            } while (usado[idx]);
            usado[idx] = true;
            System.arraycopy(dados[idx].X, 0, centroides[c], 0, dims);
        }
    }

    private double distanciaEntre(double[] x, double[] y) {
        switch (escolhaDistancia) {
            case 0:
                return Distancia.distanciaManhattan(x, y);
            case 1:
                return Distancia.distanciaEuclidiana(x, y);
            case 2:
                return Distancia.distanciaMinkowskP3(x, y);
            case 3:
                return Distancia.distanciaMinkowskP4(x, y);
            default:
                throw new IllegalArgumentException("Métrica inválida");
        }
    }

    public double[][] calcularDistancias(Amostra[] dados) {
        double[][] dist = new double[dados.length][k];
        for (int i = 0; i < dados.length; i++) {
            for (int c = 0; c < k; c++) {
                dist[i][c] = distanciaEntre(dados[i].X, centroides[c]);
            }
        }
        return dist;
    }

    public int[] atribuirClusters(Amostra[] dados, double[][] dist) {
        int[] labels = new int[dados.length];
        for (int i = 0; i < dados.length; i++) {
            double best = Double.MAX_VALUE;
            int bestIdx = -1;
            for (int c = 0; c < k; c++) {
                if (dist[i][c] < best) {
                    best = dist[i][c];
                    bestIdx = c;
                }
            }
            labels[i] = bestIdx;
        }
        return labels;
    }

    /** Recalcula centroides como média das amostras do cluster (ponto médio) */
    public void atualizarCentroides(Amostra[] dados, int[] labels) {
        int dims = Amostra.qtdIn;
        double[][] soma = new double[k][dims];
        int[] cont = new int[k];

        for (int i = 0; i < dados.length; i++) {
            int g = labels[i];
            if (g < 0 || g >= k)
                continue;
            cont[g]++;
            for (int d = 0; d < dims; d++)
                soma[g][d] += dados[i].X[d];
        }

        for (int c = 0; c < k; c++) {
            if (cont[c] == 0) {
                // cluster vazio -> re-inicializa com amostra aleatória
                int idx = rand.nextInt(dados.length);
                System.arraycopy(dados[idx].X, 0, centroides[c], 0, dims);
            } else {
                for (int d = 0; d < dims; d++)
                    centroides[c][d] = soma[c][d] / cont[c];
            }
        }
    }

    private boolean iguais(int[] a, int[] b) {
        if (a == null || b == null)
            return false;
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i])
                return false;
        return true;
    }

    /**
     * Executa o loop (inicializa, atribui, atualiza) até convergência ou maxIter.
     * Retorna labels finais.
     */
    public int[] fit(Amostra[] dados, int maxIter) {
        inicializarCentroides(dados);
        int[] labels = null;
        boolean mudou = true;
        int iter = 0;
        while (mudou && iter < maxIter) {
            double[][] dist = calcularDistancias(dados);
            int[] novos = atribuirClusters(dados, dist);
            mudou = (labels == null) || !iguais(labels, novos);
            labels = novos;
            atualizarCentroides(dados, labels);
            iter++;
        }
        return labels;
    }

    /** devolve cópia dos centroides atuais */
    public double[][] getCentroides() {
        int dims = Amostra.qtdIn;
        double[][] copia = new double[k][dims];
        for (int c = 0; c < k; c++)
            System.arraycopy(centroides[c], 0, copia[c], 0, dims);
        return copia;
    }
}
