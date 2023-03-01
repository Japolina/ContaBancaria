
public class contabancaria {

    public static void main(String[] args) {
        ContaBancariaClasse conta1 = new ContaBancariaClasse();
        
        conta1.setNumConta (123);
        conta1.dono = "Xiru";
        conta1.tipo = "CC"; //Conta Corrente
        conta1.setValor (100);
        conta1.setAberta(false);
        
        conta1.abrirConta();
        conta1.depositar(100);
        conta1.sacar(80);
        conta1.fecharConta();
        conta1.pagarMensalidade();
        conta1.status();
        
        //OBJETO 2//
        /*System.out.println("------------------------");
        
        ContaBancariaClasse conta2 = new ContaBancariaClasse();
        
        conta2.setNumConta (234);
        conta2.dono = "Xiruzão";
        conta2.tipo = "CP";
        conta2.setValor (500);
        conta2.setAberta(false);
        
        conta2.abrirConta();
        conta2.depositar(2600);
        conta2.sacar(200);
        conta1.fecharConta();
        conta1.pagarMensalidade();
        conta2.status();*/
    
    }
    
}
