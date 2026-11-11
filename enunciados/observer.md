# Atividade: Observer

## Contexto
Uma `WeatherStation` atualiza a temperatura. Vários módulos querem ser notificados:
- um display no console
- um controlador de ventilador

## Instruções

### Parte 1: Criar a Interface Observer
1. Crie a interface `TemperatureObserver` com o método:
   - `void onTemperatureChanged(double temp);`

### Parte 2: Implementar o Subject
1. Crie a classe `WeatherStation` que:
   - mantém uma lista de `TemperatureObserver`
   - implementa os métodos:
     - `void subscribe(TemperatureObserver o)`
     - `void unsubscribe(TemperatureObserver o)`
     - `void setTemperature(double temp)` (atualiza e notifica)
   - implementa um método privado `notifyObservers()`

### Parte 3: Criar os Observers Concretos
1. Crie a classe `ConsoleDisplay` (implements `TemperatureObserver`):
   - imprime: `Display: temperatura = <temp>`
2. Crie a classe `FanController` (implements `TemperatureObserver`):
   - se `temp > 28` imprime: `Ventilador: LIGAR`
   - senão imprime: `Ventilador: DESLIGAR`

### Parte 4: Utilizar o Pattern
1. No `main`:
   - Instancie a `WeatherStation`
   - Instancie `ConsoleDisplay` e `FanController`
   - Inscreva ambos
   - Chame `setTemperature(26)` e `setTemperature(30)`
   - Remova o `ConsoleDisplay`
   - Chame `setTemperature(27)`

## Requisitos
- Implementar mecanismo de inscrição e remoção de observers
- Notificar automaticamente todos os observers ao atualizar a temperatura
- Demonstrar a remoção dinâmica de observers

## Exemplo de Saída Esperada
```
Display: temperatura = 26.0
Ventilador: DESLIGAR
Display: temperatura = 30.0
Ventilador: LIGAR
Ventilador: DESLIGAR
```
(na última atualização, o display não aparece porque foi removido)
