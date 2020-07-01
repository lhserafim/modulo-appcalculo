package br.com.alvoradatecnologia.app.calculo;

import br.com.alvoradatecnologia.app.calculo.interno.OperacoesAritmeticas;
import br.com.alvoradatecnologia.app.loggin.Logger;

// Neste nosso exemplo, a classe Calculadora será tratada para ser exibida fora do módulo
public class Calculadora {
    // Exemplo de relacionamento TEM UM
    private OperacoesAritmeticas operacoesAritmeticas = new OperacoesAritmeticas();

    // Delegate methods
    // É quando você implementa um método na classe atual, que vai delegar "chamar" o método da outra classe passando
    // os mesmos parametros e retornando a mesma coisa
    public double somar(double... nums) {
        Logger.info("Somando... ");
        return operacoesAritmeticas.somar(nums);
    }

}
