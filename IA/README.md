<h1 align="center">🤖 Inteligência Artificial — Trabalho 1</h1>

<h2 align="center">Método de Dixon (Sistemas Lineares)</h2>

<p align="center">
Implementação didática do <strong>Método de Dixon</strong> em <strong>Java</strong>, aplicada à
resolução de <strong>sistemas lineares</strong>, destacando aspectos numéricos úteis em problemas
de IA e otimização.
</p>

<p align="center">
  https://img.shields.io/badge/finalidade-acadêmica-blue
  https://img.shields.io/badge/disciplina-Inteligência%20Artificial-green
  https://img.shields.io/badge/tema-Método%20de%20Dixon-purple
  https://img.shields.io/badge/linguagem-Java-orange
</p>

---

## 📘 Descrição

Este trabalho apresenta a implementação do <strong>Método de Dixon</strong> para
resolução de sistemas lineares. Embora seja um tema de <em>métodos numéricos</em>,
ele aparece como apoio a tarefas de IA, servindo de base para rotinas internas
de busca, simulação e aprendizagem quando há subproblemas lineares.

---

## 🧠 Conceitos Fundamentais

- <strong>Sistema linear</strong>: conjunto de equações lineares a resolver.
- <strong>Condição numérica</strong>: sensibilidade da solução a pequenas variações.
- <strong>Estabilidade</strong>: importância de métodos robustos em pipelines de IA.

---

## ⚙️ Funcionamento (Visão Geral)

1. Leitura/geração da matriz dos coeficientes e do vetor de termos independentes.  
2. Aplicação do método (fatorações/iterações conforme a abordagem adotada).  
3. Cálculo da solução e verificação (resíduo).  
4. Relato de precisão e eventuais limitações numéricas.

---

## 🎯 Objetivo do Trabalho

- Entender a aplicação prática de um método numérico em IA.
- Implementar e testar a rotina em diferentes instâncias.
- Analisar estabilidade e precisão dos resultados.

---

## 📫 Autoria

👩‍💻 <strong>Joice Barros de Figueiredo</strong>  
🔗 https://github.com/JoyFigueiredo

<p align="center">Projeto desenvolvido exclusivamente para fins acadêmicos.</p>

---
<h1 align="center">🤖 Inteligência Artificial — Trabalho 2</h1>

<h2 align="center">Problema das n‑Rainhas (Busca em Espaço de Estados)</h2>

<p align="center">
Implementação didática do <strong>Problema das n‑Rainhas</strong> em <strong>Java</strong>,
explorando <strong>busca em espaço de estados</strong>, heurísticas e análise de desempenho.
</p>

<p align="center">
  https://img.shields.io/badge/finalidade-acadêmica-blue
  https://img.shields.io/badge/disciplina-Inteligência%20Artificial-green
  https://img.shields.io/badge/tema-n--Rainhas%20(Busca)-purple
  https://img.shields.io/badge/linguagem-Java-orange
</p>

---

## 📘 Descrição

O <strong>n‑Rainhas</strong> é um problema clássico de IA em que se deseja posicionar n
rainhas em um tabuleiro n×n sem conflitos (mesma linha, coluna ou diagonal).
É um ótimo cenário para estudar representação de estados, operadores e estratégias
de <strong>busca</strong>.

---

## 🧠 Conceitos Fundamentais

- <strong>Estado</strong>: configuração do tabuleiro.  
- <strong>Operadores</strong>: mover/posicionar rainhas.  
- <strong>Função de avaliação</strong>: número de conflitos ou heurística escolhida.  
- <strong>Estratégias</strong>: busca cega, heurística, subida de encosta, backtracking etc.  

---

## ⚙️ Funcionamento (Visão Geral)

1. Definição de representação de estado (por exemplo, vetor de colunas por linha).  
2. Escolha da estratégia de busca/heurística.  
3. Geração/expansão de vizinhos (ou backtracking).  
4. Critério de parada (solução sem conflitos ou limite de iterações).  
5. Coleta de métricas: nós gerados, tempo, taxas de sucesso.

---

## 🎯 Objetivo do Trabalho

- Aplicar técnicas de busca e avaliação de estados.  
- Comparar estratégias/heurísticas (quando aplicável).  
- Discutir complexidade e desempenho obtido.

---

## 📫 Autoria

👩‍💻 <strong>Joice Barros de Figueiredo</strong>  
🔗 https://github.com/JoyFigueiredo

<p align="center">Projeto desenvolvido exclusivamente para fins acadêmicos.</p>

---

<h1 align="center">🤖 Inteligência Artificial — Trabalho 3</h1>

<h2 align="center">Perceptron (Classificação Linear Supervisionada)</h2>

<p align="center">
Implementação do <strong>Perceptron</strong> em <strong>Java</strong>, modelo clássico de
<strong>aprendizado supervisionado</strong> para classificação linear, com análise de acerto,
convergência e limitações.
</p>

<p align="center">
  https://img.shields.io/badge/finalidade-acadêmica-blue
  https://img.shields.io/badge/disciplina-Inteligência%20Artificial-green
  https://img.shields.io/badge/tema-Perceptron-purple
  https://img.shields.io/badge/linguagem-Java-orange
</p>

---

## 📘 Descrição

O <strong>Perceptron</strong> é um classificador linear que ajusta pesos para separar duas
classes. É base para modelos conexionistas mais complexos e introduz conceitos de
generalização, taxa de aprendizado e separabilidade.

---

## 🧠 Conceitos Fundamentais

- <strong>Hiperplano de decisão</strong> e separabilidade linear.  
- <strong>Atualização de pesos</strong> via erro (regra do Perceptron).  
- <strong>Taxa de aprendizado</strong>, épocas e critério de parada.  
- <strong>Convergência</strong> (garantida para dados linearmente separáveis).  

---

## ⚙️ Funcionamento (Visão Geral)

1. Inicialização aleatória dos pesos (e viés).  
2. Apresentação sequencial ou embaralhada dos padrões.  
3. Atualização de pesos quando houver erro de classificação.  
4. Repetição por épocas até convergir ou atingir limite.  
5. Avaliação: acurácia em treino/validação e análise de erros.

---

## 🎯 Objetivo do Trabalho

- Implementar o Perceptron e compreender sua dinâmica de aprendizado.  
- Investigar efeitos de taxa de aprendizado e épocas.  
- Discutir limites do modelo em bases não separáveis linearmente.

---

## 📫 Autoria

👩‍💻 <strong>Joice Barros de Figueiredo</strong>  
🔗 https://github.com/JoyFigueiredo

<p align="center">Projeto desenvolvido exclusivamente para fins acadêmicos.</p>

---

<h1 align="center">🤖 Trabalhos de Inteligência Artificial</h1>

<p align="center">
Repositório da disciplina de <strong>Inteligência Artificial</strong>, reunindo exercícios e
experimentos em <strong>busca</strong>, <strong>heurísticas</strong> e <strong>aprendizado supervisionado</strong>.
</p>

<p align="center">
  https://img.shields.io/badge/finalidade-acadêmica-blue
  https://img.shields.io/badge/disciplina-Inteligência%20Artificial-green
  https://img.shields.io/badge/tema-Busca%20e%20Aprendizado-purple
  https://img.shields.io/badge/linguagem-Java-orange
</p>

---

## 📁 Trabalhos

- **Trabalho 1 — Método de Dixon**  
  Resolução de sistemas lineares e análise numérica aplicada.  
  📂 https://github.com/JoyFigueiredo/Faculdade1/tree/main/IA/Dixon

- **Trabalho 2 — Problema das n‑Rainhas**  
  Busca em espaço de estados, heurísticas e avaliação de desempenho.  
  📂 https://github.com/JoyFigueiredo/Faculdade1/tree/main/IA/n-Rainhas

- **Trabalho 3 — Perceptron**  
  Classificação supervisionada linear, convergência e limitações.  
  📂 https://github.com/JoyFigueiredo/Faculdade1/tree/main/IA/Perceptron

---

## 📫 Autoria

👩‍💻 <strong>Joice Barros de Figueiredo</strong>  
🔗 https://github.com/JoyFigueiredo

<p align="center">Projeto desenvolvido exclusivamente para fins acadêmicos.</p>
