# Desafio POO DIO - Bootcamp Java

Este projeto é parte do desafio de Programação Orientada a Objetos (POO) da Digital Innovation One (DIO). O objetivo é aplicar os pilares da POO em Java: **Abstração**, **Encapsulamento**, **Herança** e **Polimorfismo**, simulando um sistema de gerenciamento de bootcamp.

## 🚀 Objetivo

Criar um sistema que gerencia cursos, mentorias e desenvolvedores inscritos em um bootcamp, permitindo que os devs progridam e acumulem XP conforme completam os conteúdos.

## 🧠 Estrutura de Classes

- `Conteudo` (classe abstrata): base para cursos e mentorias.
- `Curso`: herda de `Conteudo`, possui carga horária.
- `Mentoria`: herda de `Conteudo`, possui data.
- `Bootcamp`: agrupa conteúdos e devs inscritos.
- `Dev`: representa o desenvolvedor, com progresso e cálculo de XP.
- `Main`: simula o funcionamento do sistema com exemplos reais.

## 📦 Funcionalidades

- Inscrição de devs em bootcamp.
- Progresso dos devs nos conteúdos.
- Cálculo de XP acumulado.
- Simulação com nomes e cores no terminal.

## ▶️ Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/goncalvesfelip/desafio-poo-dio.git
   ```
