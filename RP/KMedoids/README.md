
<h1 align="center">📊 K‑Medoids (Clustering)</h1>

<p align="center">
Repositório acadêmico dedicado ao estudo e implementação do algoritmo  
<strong>K‑Medoids</strong>, um método de <strong>agrupamento não supervisionado</strong>
baseado em similaridade entre amostras.
</p>

<p align="center">
  <img scr= "https://img.shields.io/badge/técnica-K--Medoids-purple">  
  <img scr= "https://img.shields.io/badge/tipo-Agrupamento%20(CLustering)-blue">  
  <img scr= "https://img.shields.io/badge/linguagem-Java-orange">  
</p>

> **Disciplina:** Reconhecimento de Padrões  
> **Tema específico:** Agrupamento de Dados (Clustering)  
> **Finalidade:** Estudo, experimentação e portfólio acadêmico

---

## 📘 Descrição

Este projeto aborda o algoritmo **K‑Medoids**, uma técnica de **agrupamento não supervisionado**
utilizada para particionar um conjunto de dados em grupos (clusters) com base na
similaridade entre as amostras.

Diferente de métodos supervisionados, o clustering não utiliza rótulos de classe.
O objetivo é identificar **estruturas internas e padrões naturais** nos dados.

O trabalho possui caráter **didático e acadêmico**, sendo desenvolvido no contexto da
disciplina de Reconhecimento de Padrões.

---

## 📊 Agrupamento de Dados

O **agrupamento (clustering)** consiste em dividir um conjunto de amostras em grupos
de tal forma que:

- Amostras de um mesmo grupo sejam **mais semelhantes entre si**
- Amostras de grupos diferentes sejam **mais distintas**

A similaridade é geralmente medida por funções de distância, como a **distância Euclidiana**
ou Manhattan.

---

## 🔹 Algoritmo K‑Medoids

O **K‑Medoids** é um algoritmo de agrupamento que representa cada cluster por uma
**amostra real do conjunto de dados**, chamada de **medoid**.

Um **medoid** é o ponto que minimiza a soma das distâncias para todos os outros pontos
do mesmo grupo.

---

### 💡 Ideia Principal

O funcionamento básico do K‑Medoids pode ser resumido em:

1. Selecionar aleatoriamente `k` amostras como medoids iniciais  
2. Associar cada ponto ao medoid mais próximo  
3. Avaliar possíveis trocas entre medoids e não‑medoids  
4. Atualizar os medoids se a troca reduzir o custo total  
5. Repetir até a convergência  

---

### 📐 Função de Custo

O objetivo do K‑Medoids é minimizar a soma das distâncias entre cada ponto e o medoid
do seu cluster:

\[
J = \sum_{i=1}^{k} \sum_{x \in C_i} d(x, m_i)
\]

Onde:

- `k` é o número de clusters  
- `C_i` é o conjunto de pontos do cluster `i`  
- `m_i` é o medoid do cluster  
- `d(x, m_i)` é a distância entre o ponto e o medoid  

---

## 🔍 Diferença entre K‑Means e K‑Medoids

| K‑Means | K‑Medoids |
|-------|-----------|
| Centroide pode não existir nos dados | Medoid é sempre um ponto real |
| Sensível a outliers | Mais robusto a ruídos |
| Usa média | Usa distâncias |
| Menor custo computacional | Maior custo computacional |

📌 O K‑Medoids é especialmente indicado quando há **outliers** ou **dados não numéricos**.

---

## 📊 Base de Dados Utilizada

O algoritmo pode ser aplicado a bases numéricas representadas por vetores de atributos.
A base utilizada neste projeto possui registros descritos por múltiplas variáveis,
permitindo avaliar a formação dos clusters e a escolha dos medoids.

A análise é feita de forma **exploratória**, uma vez que não há rótulos de classe.

---

## 💻 Implementações

Neste repositório estão presentes:

- Implementação do algoritmo K‑Medoids em Java
- Cálculo de distâncias entre amostras
- Formação e atualização dos clusters
- Exibição dos medoids finais e agrupamentos obtidos

Todo o código foi desenvolvido com foco em **clareza**, **compreensão do algoritmo**
e **aprendizado conceitual**.

---

