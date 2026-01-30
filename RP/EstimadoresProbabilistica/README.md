<h1 align="center">📊 Estimadores de Probabilidade</h1>

<p align="center">
Repositório acadêmico dedicado ao estudo e implementação de  
<strong>estimadores de densidade de probabilidade</strong>, utilizados como base
para modelos estatísticos e classificadores probabilísticos.
</p>

<p align="center">
  <img src= "https://img.shields.io/badge/tema-Estimadores%20de%20Probabilidade-purple">  
  <img src= "https://img.shields.io/badge/finalidade-acadêmica-blue">  
  <img src= "https://img.shields.io/badge/linguagem-Java-orange">  
</p>

> **Disciplina:** Reconhecimento de Padrões  
> **Tema específico:** Estimadores de Probabilidade  
> **Finalidade:** Estudo, experimentação e portfólio acadêmico

---

## 📌 Descrição


Este projeto tem como foco o estudo de **Estimadores de Probabilidade**, abordando
técnicas paramétricas e não paramétricas para modelar a distribuição dos dados.

Os estimadores implementados são utilizados para calcular a probabilidade de
ocorrência de valores e para apoiar decisões em **modelos estatísticos
probabilísticos**, como o classificador Bayesiano.

O trabalho possui caráter **didático e conceitual**, sendo desenvolvido no
contexto acadêmico da disciplina.

---

### 📊 Estimadores de Densidade Probabilística

Estimadores de densidade são métodos estatísticos utilizados para **aproximar a
função densidade de probabilidade** de uma variável aleatória a partir de um
conjunto de amostras.

#### 🔹 Estimador Gaussiano

O **Estimador Gaussiano** é um método **paramétrico**, que assume que os dados seguem
uma **distribuição normal**.

A densidade é calculada a partir da média e do desvio padrão:

$$
f(x) = \frac{1}{\sqrt{2\pi\sigma^2}} \cdot e^{-\frac{(x - \mu)^2}{2\sigma^2}}
$$

Onde:

- <code>x</code> = valor da amostra
- <code>&mu;</code> = média da amostra
- <code>&sigma;</code> = desvio padrão da amostra

✔️ **Vantagens:** rápido e simples.  
❌ **Limitação:** funciona bem apenas se os dados forem aproximadamente normais.

---

#### 🔹 Kernel Density Estimation (KDE)


O **Kernel Density Estimation (KDE)** é um método **não paramétrico** que não assume
uma forma prévia para a distribuição dos dados.

A densidade é estimada pela soma das contribuições de cada ponto da amostra:

$$
\hat{f}(x) = \frac{1}{n h} \sum_{i=1}^{n} K\left(\frac{x - x_i}{h}\right)
$$

Para o **kernel Gaussiano**:

$$
K(u) = \frac{1}{\sqrt{2\pi}} e^{-\frac{u^2}{2}}
$$

Logo, a densidade KDE fica:

$$
\hat{f}(x) = \frac{1}{n h \sqrt{2\pi}} \sum_{i=1}^{n} e^{-\frac{1}{2}\left(\frac{x - x_i}{h}\right)^2}
$$

Onde:

- <code>n</code> = número de amostras
- <code>h</code> = largura de banda (_bandwidth_)
- <code>x<sub>i</sub></code> = cada ponto da amostra
- <code>K</code> = função kernel

✔️ **Vantagens:** captura distribuições complexas.  
❌ **Limitação:** mais custoso computacionalmente e depende da escolha de <code>h</code>.

---

### 📌 Classificador Bayesiano

s estimadores de densidade são empregados como base para o cálculo da
**verossimilhança** em classificadores probabilísticos, como o modelo Bayesiano.

---

#### 📍 Teorema de Bayes

O **Teorema de Bayes** permite atualizar a probabilidade de uma classe `C` dado um
conjunto de atributos `X`:

$$
P(C|X) = \frac{P(X|C) \cdot P(C)}{P(X)}
$$

- **P(C)** → Probabilidade a priori da classe (frequência no treino).
- **P(X|C)** → Probabilidade da amostra dado a classe (estimada com Gaussiana ou KDE).
- **P(X)** → Constante de normalização (mesma para todas as classes).

---

#### ⚙️ Naive Bayes

O modelo **Naive Bayes** assume independência estatística entre os atributos:

$$
P(X|C) = \prod_{i=1}^{n} P(X_i | C)
$$

Logo:

$$
P(C|X) \propto P(C) \cdot \prod_{i=1}^{n} P(X_i | C)
$$

📌 A classe escolhida é aquela que maximiza <code>P(C|X)</code>.

✔️ Fácil de implementar.  
✔️ Funciona bem mesmo em cenários simples.  
❌ Pode perder precisão quando os atributos são fortemente correlacionados.

---

## 📌 Estrutura da Base de Dados utilizada

A base de dados **transfusion.data** é um conjunto de dados utilizado para prever se um doador de sangue irá doar novamente em um determinado período. Ela contém informações sobre doadores de sangue do centro de transfusão de Hsin-Chu City, Taiwan.

O conjunto de dados possui **748 registros** e **5 atributos**:

| Atributo          | Descrição                                                                                              |
| ----------------- | ------------------------------------------------------------------------------------------------------ |
| **Recency (R)**   | Número de meses desde a última doação.                                                                 |
| **Frequency (F)** | Número total de doações realizadas.                                                                    |
| **Monetary (M)**  | Volume total de sangue doado em centímetros cúbicos (c.c.).                                            |
| **Time (T)**      | Número de meses desde a primeira doação.                                                               |
| **Class**         | Variável alvo binária que indica se o doador fez uma doação em março de 2007 (1 = doou, 0 = não doou). |

⚠️ A distribuição das classes é **desequilibrada**, com aproximadamente 76% dos doadores **não realizando a doação** em março de 2007.

---

## 📌 Exemplos de Implementação

🔹 **Gaussiana** → estimativa paramétrica (usa média e desvio).  
🔹 **KDE** → estimativa não paramétrica (usa todos os pontos do treino).  
🔹 **Naive Bayes** → classificador que combina os estimadores para prever a classe mais provável.

