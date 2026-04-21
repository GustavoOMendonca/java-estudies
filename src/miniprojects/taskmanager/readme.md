# Task Manager (Java)

Projeto simples de gerenciamento de tarefas via terminal

## Funcionalidades

- Adicionar tarefa
- Listar tarefas
- Marcar como concluída
- Remover tarefa

## Estrutura

O projeto foi organizado separando responsabilidades:

- `model` → representação da entidade Task
- `service` → regras de negócio
- `main` → interação com o usuário

## Objetivo

Praticar conceitos básicos de:

- Programação Orientada a Objetos (POO)
- Separação de responsabilidades
- Estruturação de projetos

## Como executar

```bash
javac -d out src/miniprojects/taskmanager/model/*.java src/miniprojects/taskmanager/service/*.java src/miniprojects/taskmanager/main/*.java
java -cp out miniprojects.taskmanager.main.Main
```
