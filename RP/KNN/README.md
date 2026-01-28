<h1 align="center">Comparação de Métricas de Distância no KNN</h1>

<p align="center">
Este repositório tem como objetivo <strong>analisar e comparar diferentes métricas de distância</strong> aplicadas ao classificador  
<strong>K-Nearest Neighbors (KNN)</strong>.  
Projeto acadêmico voltado para <strong>Reconhecimento de Padrões</strong>, explorando o impacto das métricas
no desempenho do classificador.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/status-concluído-brightgreen" alt="Status">
  <img src="https://img.shields.io/badge/linguagem-Java-blue" alt="Linguagem">
  <img src="https://img.shields.io/badge/classificador-KNN-orange" alt="KNN">
</p>

> **Área:** Aprendizado de Máquina / Inteligência Artificial  
> **Algoritmo:** K-Nearest Neighbors (KNN)  
> **Foco:** Comparação de métricas de distância

---

## 📘 Descrição

O **K-Nearest Neighbors (KNN)** é um classificador baseado em instâncias, que não realiza treinamento explícito.
A classificação de uma nova amostra ocorre a partir da análise das **K amostras mais próximas** no conjunto de treino,
de acordo com uma **métrica de distância**.

Este projeto tem como objetivo **comparar o impacto de diferentes métricas de distância**
no desempenho do KNN, avaliando acurácia, comportamento próximo à fronteira de decisão
e sensibilidade ao valor de **K**.

---

## ⚙️ O Algoritmo KNN (visão geral)

1. Calcula a distância entre a amostra de teste e todas as amostras de treino.
2. Seleciona os **K vizinhos mais próximos**.
3. Realiza uma **votação majoritária** entre as classes.
4. Atribui à amostra a classe mais frequente.

---

## 📏 Métricas de Distância Comparadas

As métricas de distância influenciam diretamente o comportamento do KNN.  
Abaixo estão as principais utilizadas neste estudo.

---

### 🔹 Distância Euclidiana

A métrica mais comum, mede a distância "reta" entre dois pontos:

$$
d(x, y) = \sqrt{\sum_{i=1}^{n} (x_i - y_i)^2}
$$

✔️ Boa para dados contínuos e escalonados.  
❌ Sensível a atributos em diferentes escalas.

---

### 🔹 Distância Manhattan

Baseia-se na soma das diferenças absolutas:

$$
d(x, y) = \sum_{i=1}^{n} |x_i - y_i|
$$

✔️ Mais robusta a outliers do que a Euclidiana.  
❌ Pode distorcer distâncias em espaços de alta dimensão.

---

### 🔹 Distância de Minkowski

Generaliza as anteriores, controlada por um parâmetro \( p \):

$$
d(x, y) = \left( \sum_{i=1}^{n} |x_i - y_i|^p \right)^{1/p}
$$

- \( p = 1 \) → Manhattan
- \( p = 2 \) → Euclidiana

✔️ Permite ajustar a sensibilidade da métrica.  
❌ Requer escolha adequada do parâmetro \( p \).

---

### 🔹 Distância de Chebyshev

Considera apenas a **maior diferença** entre os atributos:

$$
d(x, y) = \max_i |x_i - y_i|
$$

✔️ Útil em casos onde o maior desvio domina a decisão.  
❌ Pode ignorar pequenas variações entre dimensões.

---

## 📊 Base de Dados Utilizada

Foi utilizada a base **transfusion.data**, relacionada a doadores de sangue,
a mesma empregada em experimentos anteriores com **classificadores bayesianos**,
garantindo consistência experimental.

| Atributo      | Descrição                               |
| ------------- | --------------------------------------- |
| Recency (R)   | Meses desde a última doação             |
| Frequency (F) | Número total de doações                 |
| Monetary (M)  | Volume total de sangue doado            |
| Time (T)      | Meses desde a primeira doação           |
| Class         | Doação em março/2007 (1 = sim, 0 = não) |

---

## 🧠 Etapas do Experimento

1. Normalização dos atributos.
2. Definição do valor de **K**.
3. Aplicação das métricas de distância.
4. Avaliação por **taxa de acerto** e **matriz de confusão**.
5. Comparação dos resultados obtidos.

---

## 📈 Resultados Esperados

A comparação busca observar:

- Variação na **acurácia** conforme a métrica.
- Diferenças no comportamento do classificador para dados próximos da fronteira de decisão.
- Impacto do **valor de K** no desempenho.

---

## 💻 Requisitos

✔ **Java JDK 17+**  
✔ **Biblioteca Swing (para seleção de arquivos)**  
✔ **Arquivos `.data` de treino e teste**

---

## 🚀 Uso

1️⃣ Compile o projeto:

```bash
javac *.java
```

---

## 🛠️ Desenvolvimento

- Projeto desenvolvido para fins acadêmicos.
- Código modular, permitindo fácil inclusão de novas métricas.
- Estrutura compatível com ambientes educacionais e laboratoriais.

---

## ✅ Status do Projeto

Concluído para a disciplina de **Reconhecimento de Padrões**, com possibilidade de  
extensão para novos classificadores ou métricas adicionais.

---

## 🗺 Roadmap (possíveis melhorias)

- [ ] Validação cruzada (k-fold)
- [ ] Comparação com outros classificadores
- [ ] Visualização gráfica das fronteiras de decisão
- [ ] Automatização da escolha do melhor valor de K
