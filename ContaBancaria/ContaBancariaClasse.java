
public class ContaBancariaClasse {
        private int numConta;
        public String dono;
        public String tipo;
        private float valor;
        private boolean aberta;
        
        
        public void abrirConta(){
            if (this.getTipo()=="CC"||this.getTipo()== "CP"){
                float bonus;
                if (this.getTipo ()== "CC"){
                bonus = 50;
                }else{
                bonus = 100;
            }
                this.aberta = true;
                System.out.println("Conta aberta com sucesso!");
                this.setValor (this.getValor() + bonus);
                System.out.println("Você recebeu R$"+bonus+" de bônus.");
            }else{
                System.out.println("Erro! Tipo de conta inválido");
            }
    };
        public void fecharConta(){
            if (this.getValor()==0){
                this.setAberta(false);
                System.out.println("A conta foi fechada com sucesso!");
            }else if(this.getValor()>0){
                System.out.println("Erro! Você precisa sacar o valor disponível.");
            }else {
                System.out.println("Erro! Você deve quitar sua dívida ou sua conta será suspensa.");
            }
        };
        public void pagarMensalidade(){
            if (this.getAberta()=="sim"){
                float mensalidade;
            if (this.getTipo()=="CC"){
                mensalidade = 12;
            }else{
                mensalidade = 20;
            }
                this.setValor(this.getValor()- mensalidade);
            
            }else {
                System.out.println("Não é possível pagar com a mensalidade com a conta fechada.");
            }
        };
        public void depositar(float valorDeposito){
            if (this.aberta){
                this.valor = this.valor + valorDeposito;
            }else{
                System.out.println("--A conta está fechada!--");
            }
    };
        public void sacar(float valorSaque){
            if (this.aberta&&this.valor>=valorSaque){
                this.valor = this.valor - valorSaque;
            }else{
                System.out.println("--A conta está fechada ou saldo indisponivel.--");  
            }
    };
        public void status(){
            System.out.println("Numero da conta: "+this.getNumConta());    
            System.out.println("Dono: "+this.getDono());
            System.out.println("Tipo: "+this.getTipo());
            System.out.println("Valor: "+this.getValor());
            System.out.println("Está aberta? "+this.getAberta());
    };
        public void setNumConta (int numConta){
            this.numConta = numConta;
        }
        public int getNumConta (){
            return this.numConta;
        }
        public void setValor (float valor){
            this.valor = valor;
        }
        public float getValor (){
            return this.valor;
        } 
        public void setAberta (boolean aberta){
            this.aberta = aberta;
        }
        public String getAberta (){
            if (this.aberta){
                return "sim";
            }else{
                return "não";
            }
            
        }
        public void setDono (String dono){
            this.dono = dono;
        }
        public String getDono (){
            return this.dono;
        }
        public void setTipo (String t){
            this.tipo = t;
        }
        public String getTipo (){
            return this.tipo;
        }
}
