package org.example;

public interface Nodo {
    Nodo getSiguiente();
    void setSiguiente(Nodo siguiente);
    DatoPolinomio getDato();
    void setDato(DatoPolinomio dato);
}