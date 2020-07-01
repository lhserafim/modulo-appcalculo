module app.calculo {
    //requires app.loggin;
    requires transitive app.loggin; // Assim o outro módulo terá acesso a algo do módulo loggin, via módulo calculo
    exports br.com.alvoradatecnologia.app.calculo;
    //opens br.com.alvoradatecnologia.app.calculo.interno to app.financeiro; // opens permite o reflection
    exports br.com.alvoradatecnologia.app.calculo.interno to app.financeiro;

    // Implementar API
    requires app.api;
    provides br.com.alvoradatecnologia.app.Calculadora with br.com.alvoradatecnologia.app.calculo.CalculadoraImpl;

}