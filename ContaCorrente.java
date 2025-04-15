public class ContaCorrente {
    private int agencia;
    private int numero;
    private float saldo;
    
    public static void main(String[] args) {
        
        ContaCorrente conta = new ContaCorrente(12345, 6789); 
        
        
        conta.depositar(500); 
        
        
        conta.sacar(200); 
        
       
        System.out.println("Saldo final: " + conta.saldo());
    }

    public ContaCorrente(int conta, int agencia) {
        numero = conta;
        agencia = agencia;  
        saldo = 0;  
    }

    public void sacar(float valor) {
        if ((saldo - valor) >= 0) 
            saldo = saldo - valor; 
         else 
            System.out.println("Saldo Insuficiente!");
            }

    public void depositar(float valor) {
        if (valor > 0) 
            saldo = saldo + valor;  
      
    }

    public float saldo() {
        return saldo;  
    }
}
