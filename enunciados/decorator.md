# Atividade: Decorator

## Contexto
O sistema já envia notificações por **Email**, mas agora precisa também enviar por **SMS** e **Slack**, podendo combinar os canais.

## Instruções

### Parte 1: Criar o Componente
1. Crie a interface `Notifier` com o método:
   - `void send(String message);`
2. Crie a classe `EmailNotifier` implementando `Notifier`:
   - deve imprimir: `Enviando EMAIL: <message>`

### Parte 2: Criar o Decorator Base
1. Crie a classe abstrata `NotifierDecorator` implementando `Notifier`:
   - deve ter um atributo `protected final Notifier wrappee;`
   - construtor recebe `Notifier wrappee`

### Parte 3: Criar os Decorators Concretos
1. Crie a classe `SmsDecorator` (extends `NotifierDecorator`):
   - ao chamar `send(message)`, deve:
     1. chamar `wrappee.send(message)`
     2. imprimir: `Enviando SMS: <message>`
2. Crie a classe `SlackDecorator` (extends `NotifierDecorator`):
   - ao chamar `send(message)`, deve:
     1. chamar `wrappee.send(message)`
     2. imprimir: `Enviando SLACK: <message>`

### Parte 4: Utilizar o Pattern
1. No `main`, demonstre as combinações:
   - Apenas email:
     - `Notifier n1 = new EmailNotifier();`
     - `n1.send("Olá");`
   - Email + Slack:
     - `Notifier n2 = new SlackDecorator(new EmailNotifier());`
     - `n2.send("Promoção");`
   - Email + SMS + Slack:
     - `Notifier n3 = new SlackDecorator(new SmsDecorator(new EmailNotifier()));`
     - `n3.send("Sistema fora");`

## Requisitos
- Usar composição para combinar comportamentos
- Permitir combinação dinâmica de canais de notificação
- O decorator base deve delegar chamadas ao componente encapsulado

## Exemplo de Saída Esperada
```
Enviando EMAIL: Olá

Enviando EMAIL: Promoção
Enviando SLACK: Promoção

Enviando EMAIL: Sistema fora
Enviando SMS: Sistema fora
Enviando SLACK: Sistema fora
```
