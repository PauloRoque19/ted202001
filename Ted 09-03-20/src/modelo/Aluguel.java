/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Paulinho
 */
public class Aluguel {
    
private Fita fita;
private Cliente cliente;
private int diasAlugada;


    
    public Aluguel(Fita fita, int diasAlugada,Cliente cliente) {
        this.fita = fita;
        this.diasAlugada = diasAlugada;
        this.cliente = cliente;
    }

    
    public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public void setFita(Fita fita) {
		this.fita = fita;
	}


	public void setDiasAlugada(int diasAlugada) {
		this.diasAlugada = diasAlugada;
	}


	public Fita getFita() {
        return fita;
    }

    public int getDiasAlugada() {
        return diasAlugada;
    }


	@Override
	public String toString() {
		return "Aluguel [fita=" + fita + ", cliente=" + cliente + ", diasAlugada=" + diasAlugada + "]";
	}
    
    
}
