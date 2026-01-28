<h1 align="center">🤖 Reconhecimento de Padrões</h1>

<p align="center">
Repositório da disciplina/projeto de <strong>Reconhecimento de Padrões</strong> com foco em 
pré‑processamento de dados, classificação, agrupamento e avaliação de modelos.  
Organizado para estudos, experimentos reprodutíveis e comparação de algoritmos.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/área-Reconhecimento%20de%20Padrões-purple" alt="Área">
  <img src="https://img.shields.io/badge/finalidade-acadêmica-blue" alt="Acadêmico">
</p>

> **Disciplina:** Reconhecimento de Padrões  
> **Objetivo:** Estudo e compreensão dos principais métodos de classificação e agrupamento  
> **Uso:** Portfólio acadêmico e material de apoio

---

## 📘 Descrição

Este repositório reúne conteúdos e experimentos desenvolvidos ao longo da disciplina de
**Reconhecimento de Padrões**, com o objetivo de compreender como diferentes algoritmos
podem identificar padrões, classificar dados e agrupar amostras semelhantes.

O foco é **conceitual**, servindo como material de apoio e portfólio acadêmico.

---

## 📊 Estimadores de Densidade Probabilística

Estimadores de densidade são utilizados para modelar a distribuição dos atributos em cada classe,
permitindo o cálculo da probabilidade de ocorrência de um determinado valor.

---

### 🔹 Estimador Gaussiano

O **Estimador Gaussiano** assume que os dados seguem uma **distribuição normal**.
Para cada atributo de cada classe, são calculados a **média** e o **desvio padrão**,
utilizados na função densidade da normal:

\[
f(x) = \frac{1}{\sqrt{2\pi\sigma^2}} \cdot e^{-\frac{(x - \mu)^2}{2\sigma^2}}
\]

Onde:

- `x` = valor da amostra
- `μ` = média
- `σ` = desvio padrão

✔️ Simples e eficiente  
❌ Dependente da suposição de normalidade

---

### 🔹 Kernel Density Estimation (KDE)

O **KDE** é um estimador **não paramétrico**, que não assume uma forma fixa para a distribuição dos dados.
A densidade é construída a partir da soma de **kernels** centrados em cada amostra:

\[
\hat{f}(x) = \frac{1}{n h} \sum\_{i=1}^{n} K\left(\frac{x - x_i}{h}\right)
\]

Para o **kernel Gaussiano**:

\[
K(u) = \frac{1}{\sqrt{2\pi}} e^{-\frac{u^2}{2}}
\]

Resultando em:

\[
\hat{f}(x) = \frac{1}{n h \sqrt{2\pi}} \sum\_{i=1}^{n} e^{-\frac{1}{2}\left(\frac{x - x_i}{h}\right)^2}
\]

Onde:

- `n` = número de amostras
- `h` = largura de banda (_bandwidth_)
- `xᵢ` = amostras do conjunto de treino

✔️ Modela distribuições complexas  
❌ Custo computacional maior e dependente de `h`

---

## 📌 Classificador Bayesiano

O **Classificador Bayesiano** utiliza o **Teorema de Bayes** para estimar a probabilidade de uma amostra
pertencer a uma determinada classe, a partir de seus atributos.

---

### 📍 Teorema de Bayes

\[
P(C|X) = \frac{P(X|C) \cdot P(C)}{P(X)}
\]

- `P(C)` → Probabilidade a priori da classe
- `P(X|C)` → Probabilidade da amostra dado a classe
- `P(X)` → Fator de normalização

---

### ⚙️ Naive Bayes

O **Naive Bayes** assume independência entre os atributos:

\[
P(X|C) = \prod\_{i=1}^{n} P(X_i | C)
\]

Assim:

\[
P(C|X) \propto P(C) \cdot \prod\_{i=1}^{n} P(X_i | C)
\]

📌 A classe atribuída é aquela que maximiza `P(C|X)`.

✔️ Simples e eficiente  
❌ Sensível à correlação entre atributos

---

## 📊 Base de Dados Utilizada

A base **transfusion.data** contém informações sobre doadores de sangue
e é utilizada para prever se um doador realizará uma nova doação em determinado período.

- **Total de registros:** 748
- **Número de atributos:** 5

| Atributo      | Descrição                               |
| ------------- | --------------------------------------- |
| Recency (R)   | Meses desde a última doação             |
| Frequency (F) | Total de doações realizadas             |
| Monetary (M)  | Volume total doado (c.c.)               |
| Time (T)      | Meses desde a primeira doação           |
| Class         | Doação em março/2007 (1 = sim, 0 = não) |

⚠️ As classes são **desbalanceadas**, com maioria de exemplos negativos.

---

## 🧠 Exemplos de Implementação

- **Estimador Gaussiano** — abordagem paramétrica
- **KDE** — abordagem não paramétrica
- **Naive Bayes** — combinação probabilística dos estimadores

---

## 💻 Requisitos

- **Java JDK 17+**
- **Swing** (seleção de arquivos)
- Arquivos `.data` de treino e teste

---

## ▶️ Uso

1. Compile o projeto:

```bash
javac *.java
```
