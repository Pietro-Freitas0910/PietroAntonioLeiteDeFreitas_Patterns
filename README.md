# PietroAntonioLeiteDeFreitas_Patterns

Atividade de Design Patterns: um pattern de cada categoria, implementado em Java.

| Categoria      | Pattern        | Código                | Enunciado                          |
|----------------|----------------|-----------------------|------------------------------------|
| Criacional     | Factory Method | `src/factorymethod/`  | `enunciados/factory_method.md`     |
| Estrutural     | Decorator      | `src/decorator/`      | `enunciados/decorator.md`          |
| Comportamental | Observer       | `src/observer/`       | `enunciados/observer.md`           |

## Como executar

```bash
javac -encoding UTF-8 -d out $(find src -name "*.java")

java -cp out factorymethod.Main
java -cp out decorator.Main
java -cp out observer.Main
```

## Saídas

### Factory Method
```
EmailFactory enviando: "Bem-vindo ao sistema!"
SMSFactory enviando: "Bem-vindo ao sistema!"
PushFactory enviando: "Bem-vindo ao sistema!"
```

### Decorator
```
Enviando EMAIL: Olá

Enviando EMAIL: Promoção
Enviando SLACK: Promoção

Enviando EMAIL: Sistema fora
Enviando SMS: Sistema fora
Enviando SLACK: Sistema fora
```

### Observer
```
Display: temperatura = 26.0
Ventilador: DESLIGAR
Display: temperatura = 30.0
Ventilador: LIGAR
Ventilador: DESLIGAR
```
