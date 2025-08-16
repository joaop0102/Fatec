package carrinhocompras;


class MinhaPrimeiraED {
    private java.util.ArrayList<Object> lista = new java.util.ArrayList<>();

    public void adiciona(Object item) {
        lista.add(item);
    }
}

public class CarrinhoCompras {
   private double frete = 0;
   private double total_a_pagar = 0;
   
   MinhaPrimeiraED carrinho = new MinhaPrimeiraED();
   
   public void adicionaBebida(Bebida item){
       carrinho.adiciona(item);  
       total_a_pagar += item.getPreco();  
   }
   
   public void adicionaPizza(Pizza item){
       carrinho.adiciona(item);  
       total_a_pagar += item.getPreco();  
   }
   
   public double getTotalPagar(){
       return total_a_pagar;  
   }
}
