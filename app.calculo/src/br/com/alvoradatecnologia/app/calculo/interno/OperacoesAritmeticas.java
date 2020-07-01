package br.com.alvoradatecnologia.app.calculo.interno;

import java.util.Arrays;

// Neste nosso exemplo, a classe OperacoesAritmeticas será tratada para não ser exibida fora do módulo
public class OperacoesAritmeticas {
    public double somar(double... nums) { // recebendo um conjunto de Varargs do tipo double

        // Fazer o cálculo p/ retornar o double
        // Dentro de arrays, temos a opção de transformar em um .stream(), para poder usar o .reduce()
        // Vou usar o .reduce() de 2 argumentos (ver detalhes sobre os 3 tipos de reduce)
        // 1. Argumento - identidade, 2. Operador

        /*
        * Somente o último parâmetro de um método em Java pode ser do tipo varargs.
        * Um parâmetro vararg pode receber 0, muitos ou um array de parâmetros. Aliás, é por essa característica que o
        * parâmetro vararg deve ser o último parâmetro do método.
        * Precisa ser do mesmo tipo!
        * */
        return Arrays.stream(nums).reduce(0.0, (acumulador, valor) -> acumulador + valor);
    }
}
