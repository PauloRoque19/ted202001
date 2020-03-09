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
public class Fita {
    

	
    private String título;
    private Tipo códigoDePreço;

    public Fita(String título, Tipo códigoDePreço) {
        this.título = título;
        this.códigoDePreço = códigoDePreço;
    }
    

    public void setTítulo(String título) {
		this.título = título;
	}


	public String getTítulo() {
        return título;
    }

    public Tipo getCódigoDePreço() {
        return códigoDePreço;
    }

    public void setCódigoDePreço(Tipo códigoDePreço) {
        this.códigoDePreço = códigoDePreço;
    }

    @Override
    public String toString() {
        return "Fita{" + "t\u00edtulo=" + título + ", c\u00f3digoDePre\u00e7o=" + códigoDePreço + '}';
    }

	
}