# Processamento de Pagamentos com Padrão Adapter

Vamos supor que estamos desenvolvendo um sistema para processar pagamentos de diferentes provedores de pagamento, como PayPal, Stripe e Square. Cada provedor de pagamento tem sua própria API com métodos e estruturas de dados específicos.

## Modelo de Classes Existente

```java
// Interface para todos os provedores de pagamento
public interface Target {
    void processPayment(double amount);
}

// Implementação para PayPal
public class PayPal implements Target {
    @Override
    public void processPayment(double amount) {
        // Lógica específica do PayPal para processar o pagamento
        System.out.println("Pagamento processado pelo PayPal: $" + amount);
    }
}

// Implementação para Stripe
public class Stripe implements Target {
    @Override
    public void processPayment(double amount) {
        // Lógica específica do Stripe para processar o pagamento
        System.out.println("Pagamento processado pelo Stripe: $" + amount);
    }
}

// Implementação para Square
public class Square implements Target {
    @Override
    public void processPayment(double amount) {
        // Lógica específica do Square para processar o pagamento
        System.out.println("Pagamento processado pelo Square: $" + amount);
    }
}

// Classe principal que faz uso dos provedores de pagamento
public class PaymentProcessor {
    private Target target;

    public PaymentProcessor(Target target) {
        this.target = target;
    }

    public void processPayment(double amount) {
        target.processPayment(amount);
    }
}
```

Neste modelo de classes, temos uma interface `Target` e implementações concretas para PayPal, Stripe e Square. A classe `PaymentProcessor` usa uma implementação de `Target` para processar pagamentos.

## Integrando um Novo Provedor de Pagamento

Imagine que precisamos integrar um novo provedor de pagamento, por exemplo, o Google Pay. No entanto, a API do Google Pay pode ter uma estrutura de dados e métodos diferentes das implementações existentes. Aqui é onde o padrão Adapter pode ser útil para adaptar a interface do Google Pay para a interface `Target`.
``` 

Essa é uma maneira de organizar o arquivo para destacar o problema e a solução proposta usando o padrão Adapter.
