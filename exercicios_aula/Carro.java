public class Carro {
    
    String placa;
    String cor;
    String modelo;
    int ano;
    int velocimetro;

    // Assinatura do Método Carro:
    // nome do método - Carro
    // quantidade de parâmetros - 2
    // ordem dos tipos - String, String
    public Carro(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    // Assinatura do Método acelerar:
    // nome do método - acelerar
    // quantidade de parâmetros - 0
    // ordem dos tipos - NÃO HÁ
    public void acelerar() {
        this.velocimetro++;    
    }

    // Assinatura do Método acelerar:
    // nome do método - acelerar
    // quantidade de parâmetros - 1
    // ordem dos tipos - int
    public void acelerar(int velocidade) {
        this.velocimetro += velocidade;    
    }
}