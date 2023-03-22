/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermercado;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author ESTUDANTE
 */
public class Supermecado {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
		Produto[] prod = null;
		boolean fim = false;
    
         do{
	System.out.println(" 1 => Registar Produtos");
	System.out.println(" 2 => Listar Produtos");
	System.out.println(" 3 => Comprar Produtos");
			
	int opc=input.nextInt();
	switch(opc){
	case 1:
            System.out.println("Quantos produtos deseja Registar");
	int n=input.nextInt();
			
	for(int i=0;i<n;i++){
	System.out.println("Nome: ");
	String nome=input.next();
	System.out.println("Quantidade: ");
	int qty=input.nextInt();
	System.out.println("Preco: ");
	double preco=input.nextDouble();
					
					
	prod = new Produto[n];
	prod[i]= new Produto(nome,qty, (int) preco);
        }
        
        break;
	case 2: 
        System.out.println("LISTAR PRODUTOS");
		for(int i=0;i<prod.length;i++){
		System.out.println(prod[i].toString());
					}
		break;
	case 3:System.out.println(" PRODUTOS DISPONIVEIS");
	double compra=0.0;
            for (Produto prod1 : prod) {
                System.out.println(Arrays.toString(prod1.toArray()));
            }
	System.out.println("Digite o nome do produto que deseja: ");
	String produto=input.next();
			
            for (Produto prod1 : prod) {
                if (produto == null ? prod1.getName() == null : produto.equals(prod1.getName())) {
                    compra = prod1.totalPagar();
                    System.out.println(prod1.getName() + " " + compra);
                }
            }


			
				
}
			
		}while(fim!=true);
         }
}

    
