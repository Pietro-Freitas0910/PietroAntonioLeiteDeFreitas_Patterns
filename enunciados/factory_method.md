# Atividade: Factory Method

## Contexto
Você está desenvolvendo um sistema de notificações para uma aplicação. O sistema precisa enviar notificações através de diferentes canais (Email, SMS, Push Notification), mas o código cliente não deve conhecer os detalhes específicos de cada implementação.

## Instruções

### Parte 1: Criar a Interface e Classes Concretas
1. Crie uma interface `Notification` com o método `send(message: String): void`
2. Implemente três classes concretas:
   - `EmailNotification`: implementa envio por email
   - `SMSNotification`: implementa envio por SMS
   - `PushNotification`: implementa envio por push

### Parte 2: Implementar o Factory Method
1. Crie uma classe abstrata `NotificationFactory` com um método abstrato `createNotification(): Notification`
2. Crie classes concretas para cada tipo:
   - `EmailNotificationFactory`
   - `SMSNotificationFactory`
   - `PushNotificationFactory`
3. Cada factory deve retornar a implementação correspondente

### Parte 3: Utilizar o Pattern
1. Implemente uma classe `NotificationService` que recebe uma factory
2. Crie um método que usa a factory para criar e enviar notificações
3. Teste criando notificações através de diferentes factories

## Requisitos
- Usar interfaces para definir contratos
- Criar factories específicas para cada tipo de notificação
- Evitar uso direto de `new` no código cliente
- Demonstrar polimorfismo

## Exemplo de Saída Esperada
```
EmailFactory enviando: "Bem-vindo ao sistema!"
SMSFactory enviando: "Bem-vindo ao sistema!"
PushFactory enviando: "Bem-vindo ao sistema!"
```