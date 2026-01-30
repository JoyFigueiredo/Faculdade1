<h1 align="center">🌱 Computação Evolucionária — Trabalho 3</h1>

<h2 align="center">NSGA‑II (Non‑Dominated Sorting Genetic Algorithm II)</h2>

<p align="center">
Implementação didática do algoritmo <strong>NSGA‑II</strong> em <strong>Java</strong>,
voltado à <strong>otimização multiobjetivo</strong>, combinando ordenação não dominada
e manutenção da diversidade por meio da <strong>Crowding Distance</strong>.
</p>

<p align="center">
  <img src= "https://img.shields.io/badge/finalidade-acadêmica-blue">
  <img src= "https://img.shields.io/badge/disciplina-Computação%20Evolucionária-green">
  <img src= "https://img.shields.io/badge/tema-NSGA--II-purple">
  <img src= "https://img.shields.io/badge/linguagem-Java-orange">
</p>

---

## 📘 Descrição

Este trabalho apresenta a implementação do **NSGA‑II (Non‑Dominated Sorting Genetic Algorithm II)**,
um dos algoritmos evolutivos mais utilizados para **otimização multiobjetivo**.

O NSGA‑II busca encontrar um conjunto de soluções que represente uma boa aproximação
da **fronteira de Pareto**, equilibrando simultaneamente:
- **Qualidade das soluções** (não dominância)
- **Diversidade** ao longo do espaço objetivo

O algoritmo combina técnicas de **ordenação não dominada** e **Crowding Distance**,
tornando‑se eficiente tanto em desempenho quanto em distribuição das soluções.

---

## 🧠 Conceitos Fundamentais

### Otimização Multiobjetivo

Problemas de otimização multiobjetivo envolvem a otimização simultânea de dois ou
mais objetivos conflitantes. Em vez de uma única solução ótima, busca‑se um
**conjunto de soluções não dominadas**, conhecido como **fronteira de Pareto**.

---

### NSGA‑II

O NSGA‑II é um algoritmo evolutivo que se destaca por:

- Utilizar **Fast Non‑Dominated Sort (FNDS)** para classificar a população em frentes de Pareto;
- Empregar a **Crowding Distance** para preservar diversidade entre soluções;
- Aplicar operadores genéticos como **seleção**, **crossover** e **mutação**;
- Possuir **baixa complexidade computacional** em comparação com versões anteriores.

---

## ⚙️ Funcionamento do Algoritmo

O funcionamento do NSGA‑II pode ser resumido nas seguintes etapas:

1. **Inicialização da população**  
   Geração de uma população inicial de soluções candidatas.

2. **Avaliação dos objetivos**  
   Cálculo dos valores dos objetivos para cada indivíduo.

3. **Ordenação não dominada (FNDS)**  
   Classificação da população em frentes de Pareto (F1, F2, …).

4. **Cálculo da Crowding Distance**  
   Medição da densidade de soluções para manutenção da diversidade.

5. **Seleção**  
   Escolha dos indivíduos com base no ranking de Pareto e na Crowding Distance.

6. **Operadores genéticos**  
   Aplicação de crossover e mutação para gerar uma nova população.

7. **Iteração**  
   O processo é repetido até que um critério de parada seja atingido.

---

## 🎯 Objetivo do Trabalho

- Compreender o funcionamento do **NSGA‑II**;
- Integrar conceitos de **FNDS** e **Crowding Distance**;
- Aplicar algoritmos evolutivos à otimização multiobjetivo;
- Analisar a formação e diversidade da **fronteira de Pareto**;
- Consolidar o aprendizado em **Computação Evolucionária**.

---

## 📫 Autoria

👩‍💻 **Joice Barros de Figueiredo**  
🔗 https://github.com/JoyFigueiredo

Projeto desenvolvido exclusivamente para fins acadêmicos.

