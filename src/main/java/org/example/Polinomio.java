package org.example;

public class Polinomio implements Nodo, DatoPolinomio {
    private int coeficiente;
    private int exponente;
    private Nodo siguiente;

    public Polinomio(int coeficiente, int exponente) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
    }

    @Override
    public Nodo getSiguiente() {
        return siguiente;
    }

    @Override
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public DatoPolinomio getDato() {
        return this;
    }

    @Override
    public void setDato(DatoPolinomio dato) {
        Polinomio polinomio = (Polinomio) dato;
        this.coeficiente = polinomio.coeficiente;
        this.exponente = polinomio.exponente;
    }

    @Override
    public int getCoeficiente() {
        return coeficiente;
    }

    @Override
    public int getExponente() {
        return exponente;
    }

    @Override
    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
    }

    @Override
    public void setExponente(int exponente) {
        this.exponente = exponente;
    }

    public Polinomio sumar(Polinomio otroPolinomio) {
        Polinomio resultado = new Polinomio(0, 0);
        if (this.exponente == otroPolinomio.exponente) {
            resultado.setCoeficiente(this.coeficiente + otroPolinomio.coeficiente);
            resultado.setExponente(this.exponente);
        } else {
            resultado.setCoeficiente(this.coeficiente);
            resultado.setExponente(this.exponente);
            resultado.setSiguiente(otroPolinomio);
        }
        return resultado;
    }

    public Polinomio restar(Polinomio otroPolinomio) {
        Polinomio resultado = new Polinomio(0, 0);
        if (this.exponente == otroPolinomio.exponente) {
            resultado.setCoeficiente(this.coeficiente - otroPolinomio.coeficiente);
            resultado.setExponente(this.exponente);
        } else {
            resultado.setCoeficiente(this.coeficiente);
            resultado.setExponente(this.exponente);
            resultado.setSiguiente(otroPolinomio);
        }
        return resultado;
    }

    public Polinomio multiplicar(Polinomio otroPolinomio) {
        Polinomio resultado = new Polinomio(0, 0);
        resultado.setCoeficiente(this.coeficiente * otroPolinomio.coeficiente);
        resultado.setExponente(this.exponente + otroPolinomio.exponente);
        return resultado;
    }

    public Polinomio dividir(Polinomio otroPolinomio) {
        Polinomio resultado = new Polinomio(0, 0);
        resultado.setCoeficiente(this.coeficiente / otroPolinomio.coeficiente);
        resultado.setExponente(this.exponente - otroPolinomio.exponente);
        return resultado;
    }
    public int compareTo(Polinomio otroPolinomio) {
        if (this.exponente < otroPolinomio.exponente) {
            return 1;
        } else if (this.exponente > otroPolinomio.exponente) {
            return -1;
        } else {
            return 0;
        }
    }
}