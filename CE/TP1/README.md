
# Computação Evolucionária — Trabalho 1
## Fast Non-Dominated Sort (FNDS) em Java

Este projeto é um exemplo didático que demonstra o funcionamento do algoritmo **Fast Non-Dominated Sort (FNDS)** e sua implementação em **Java**.  
O FNDS é fundamental em **otimização multiobjetivo** e é utilizado em algoritmos como o **NSGA-II** para organizar soluções em **frentes de Pareto**, permitindo uma seleção eficiente com diversidade.

---

## 📌 Índice
- [Descrição](#descrição)
- [Conceitos](#conceitos)
- [Parte I — Primeira Frente](#parte-i--primeira-frente)
- [Parte II — Frentes Subsequentes](#parte-ii--frentes-subsequentes)
- [Estrutura das Classes](#estrutura-das-classes)
- [Pré-requisitos](#pré-requisitos)
- [Como executar](#como-executar)
- [Estrutura do projeto](#estrutura-do-projeto)
- [Exemplo de saída](#exemplo-de-saída)
- [Contato](#contato)
- [Licença](#licença)

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

## 🧱 Estrutura das Classes
### `Individuo`
- Representa um indivíduo da população.
- **Atributos:**
  - Genes e objetivos (por exemplo, `double[] objetivos`).
  - Lista de indivíduos dominados (`List<Individuo> S`).
  - Número de dominâncias (`int n`) e ranking (`int r`).

### `FNDS`
- Implementa o algoritmo **Fast Non-Dominated Sort**.
- **Método principal:** `execute(List<Individuo> pop)`
  - Entrada: população de indivíduos.
  - Saída: lista de **frentes de Pareto** (`List<List<Individuo>>`).

### `Main`
- Demonstra a execução do FNDS:
  - Cria uma população de exemplo.
  - Chama `FNDS.execute(...)`.
  - Imprime as frentes de Pareto resultantes.

---

## ⚙️ Pré-requisitos
- **Java 8+**
- (Opcional) **Maven** ou **Gradle** para gerenciamento de build.

---

## ▶️ Como executar
### Via `javac/java`
```bash
# 1) Compile
javac -d out src/main/java/*.java

# 2) Execute
java -cp out Main
```

## Contato

Se você tiver alguma dúvida ou sugestão, entre em contato!

---

*Este projeto foi criado por [Joice Barros de Figueiredo](https://github.com/JoyFigueiredo).*

