<h1 align="center">🌱 Computação Evolucionária — Trabalho 1</h1>

<h2 align="center">Fast Non-Dominated Sort (FNDS)</h2>

<p align="center">
Implementação didática do algoritmo <strong>Fast Non-Dominated Sort (FNDS)</strong> em
<strong>Java</strong>, com foco em <strong>otimização multiobjetivo</strong> e organização
de soluções em <strong>frentes de Pareto</strong>.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/finalidade-acadêmica-blue" alt="Acadêmico">  
  <img src="https://img.shields.io/badge/disciplina-Computação%20Evolucionária-green" alt="Computação Evolucionária">  
  <img src="https://img.shields.io/badge/tema-Fast%20Non--Dominated%20Sort-purple" alt="FNDS">  
  <img src="https://img.shields.io/badge/linguagem-Java-orange" alt="Java">  
</p>


---

## 🧠 Descrição
O **FNDS** organiza uma população de indivíduos em várias frentes de Pareto:
- **F1 (Primeira frente):** soluções **não dominadas** por nenhuma outra.
- **F2, F3, ... (Frentes subsequentes):** soluções dominadas **apenas** por frentes anteriores.

Esse processo facilita selecionar soluções eficientes e manter **diversidade** entre elas.

---

## 📖 Conceitos
- **Dominância de Pareto:** Uma solução **A** domina **B** se:
  - A é **pelo menos tão boa** quanto B em **todos** os objetivos; e
  - A é **estritamente melhor** em **ao menos um** objetivo.

- **Frente de Pareto:** Conjunto de soluções ordenadas por níveis de dominância:
  - **F1:** nenhuma solução domina seus elementos.
  - **F2:** dominadas apenas por elementos de **F1**, e assim por diante.

---

## 🧩 Parte I — Primeira Frente
**Objetivo:** Identificar as soluções **não dominadas**.

**Processo:**
1. Inicialize, para cada indivíduo:
   - `n`: número de soluções que **dominam** aquele indivíduo.
   - `S`: conjunto de soluções que **ele domina**.
2. Soluções com **`n = 0`** formam a **primeira frente (F1)**.

---

## 🔁 Parte II — Frentes Subsequentes
**Objetivo:** Construir **F2, F3, ...** iterativamente.

**Processo:**
1. Remova as soluções de **F1** e **reduza** a contagem `n` das soluções que **eram dominadas** por elas.
2. Qualquer solução que passa a ter **`n = 0`** forma a **próxima frente**.
3. Repita até **classificar toda a população**.

---

## 🎯 Objetivo do Trabalho

- Compreender o conceito de **dominância de Pareto**;
- Implementar o algoritmo **Fast Non-Dominated Sort**;
- Analisar a organização de soluções em frentes de Pareto;
- Preparar base conceitual para algoritmos como o **NSGA‑II**.

---



## Contato

Se você tiver alguma dúvida ou sugestão, entre em contato!

---

*Este projeto foi criado por [Joice Barros de Figueiredo](https://github.com/JoyFigueiredo).*


