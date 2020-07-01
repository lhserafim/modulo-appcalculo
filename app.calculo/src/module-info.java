module app.calculo {
    //requires app.loggin;
    requires transitive app.loggin; // Assim o outro módulo terá acesso a algo do módulo loggin, via módulo calculo
    exports br.com.alvoradatecnologia.app.calculo;
}