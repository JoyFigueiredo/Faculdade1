
<h1 align="center">🌱 Computação Evolucionária — Trabalho 2</h1>

<h2 align="center">Crowding Distance</h2>

<p align="center">
Implementação didática do conceito de <strong>Crowding Distance</strong> em
<strong>Java</strong>, utilizada para manutenção da diversidade em
<strong>problemas de otimização multiobjetivo</strong>.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/finalidade-acadêmica-blue">
  <img src="https://img.shields.io/badge/disciplina-Computação%20Evolucionária-green">
  <img src="https://img.shields.io/badge/tema-Crowding%20Distance-purple">
  <img src="https://img.shields.io/badge/linguagem-Java-orange">
</p>

---

## 📘 Descrição

Este trabalho apresenta a implementação do conceito de **Crowding Distance**,
utilizado em algoritmos de **otimização multiobjetivo** para medir a densidade
de soluções em um espaço objetivo.

A Crowding Distance é amplamente empregada em conjunto com métodos de ordenação
não dominada, como o **Fast Non‑Dominated Sort (FNDS)**, sendo um componente
fundamental do algoritmo **NSGA‑II**. Seu principal objetivo é **manter a diversidade**
entre as soluções não dominadas ao longo das frentes de Pareto.

---


## 🧠 Conceitos Fundamentais

A **Crowding Distance** avalia o quão isolada uma solução está em relação às demais
no espaço objetivo. Soluções localizadas em regiões menos densas recebem valores
mais altos de distância, tornando‑se preferenciais durante o processo de seleção.

Esse mecanismo permite equilibrar:

- **Exploração:** manutenção de soluções diversificadas  
- **Exploração:** seleção de soluções com melhor qualidade  

---

## ⚙️ Funcionamento do Algoritmo

O cálculo da Crowding Distance segue as etapas abaixo:

1. **Ordenação por objetivo**  
   Para cada objetivo, as soluções não dominadas são ordenadas em ordem crescente.

2. **Atribuição de valores extremos**  
   As soluções com menor e maior valor em cada objetivo recebem distância infinita,
   garantindo sua preservação.

3. **Cálculo da distância**  
   Para cada solução intermediária, calcula‑se a diferença normalizada entre os
   valores do objetivo das soluções vizinhas.

4. **Soma das contribuições**  
   A distância final de cada indivíduo é a soma das contribuições de todos os objetivos.

Soluções com **maior Crowding Distance** são consideradas mais relevantes para manter
a diversidade da população.

---

## 🎯 Objetivo do Trabalho

- Compreender o conceito de **Crowding Distance**;
- Relacionar diversidade e otimização multiobjetivo;
- Implementar a métrica em Java;
- Preparar base conceitual para algoritmos como o **NSGA‑II**.

---

## 📫 Autoria

👩‍💻 **Joice Barros de Figueiredo**  
🔗 https://github.com/JoyFigueiredo

Projeto desenvolvido exclusivamente para fins acadêmicos.


