package com.es.ulpgc.montesdeoca110.cristina.sprint3;

public class CounterItem {
    public final int id;
    public int cuenta;
    public String cuentaS;
    public int cuentaTotal;
    public final String cuentaTotalS;
    public CounterItem(int id, int cuenta, int cuentaTotal) {
        this.id = id;
        this.cuenta = cuenta;
        this.cuentaTotal = cuentaTotal;
        this.cuentaS = cuenta+"";
        this.cuentaTotalS =cuentaTotal +"";
    }
}
