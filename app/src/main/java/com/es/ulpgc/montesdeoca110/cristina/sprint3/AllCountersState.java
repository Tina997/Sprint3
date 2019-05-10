package com.es.ulpgc.montesdeoca110.cristina.sprint3;

public class AllCountersState {
    int cuenta;
    String cuentaS = cuenta +"";
    public String getCuentaS(){
        return cuentaS;
    }

    public int getCuenta() {
        return cuenta;
    }
    public void setCuenta(int cuenta){
        this.cuenta = cuenta;
    }
}
