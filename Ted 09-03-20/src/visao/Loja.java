/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;




import modelo.Aluguel;
import modelo.Cliente;
import modelo.Fita;
import modelo.Tipo;

/**
 *
 * @author Paulinho
 */
public class Loja {
    
    
    public static void main(String[] args) {
                //os 3 tipos de fitas
                
                
                
                
                
                
                Tipo normal = Tipo.normal;
		Tipo infantil = Tipo.infantil;
		Tipo lancamento = Tipo.lancamento;
		
                //Fitas criadas
		Fita f1 = new Fita("Roberto Carlos",normal);
		Fita f2 = new Fita("Xuxa",infantil);
		Fita f3 = new Fita("Gusttavo Lima",lancamento);
		
                //Clientes Criados
		Cliente c1 = new Cliente("Paulo Henrique");
		Cliente c2 = new Cliente("Josicleyton");
		Cliente c3 = new Cliente("Vokelson");
		
                //Alugueis feitos
		Aluguel al1 = new Aluguel(f1, 10, c1);
		Aluguel al2 = new Aluguel(f2, 5, c2);
		Aluguel al3 = new Aluguel(f3,8, c3);
                
                //Alugueis adicionado a lista do cliente
               
               //Quando estou adicionando a lista na classe Cliente está dando um error que não consegui resolver
                c1.adicionaAluguel(al1);
                c2.adicionaAluguel(al2);
                c3.adicionaAluguel(al3);
                
              System.out.println(c1.getFitasAlugadas());
                
                
              
              //Extrato dos clientes
                System.out.println(c1.extrato());
                System.out.println(c2.extrato());
                System.out.println(c3.extrato());
             
                
                
        
        
    }
    
    
}
