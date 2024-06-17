public class Carro{
    private int portas;
    private int rodas;
    private int velocidadeAtual = 0;

    public Carro(int portas, int rodas) {
        this.portas = portas;
        this.rodas = rodas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void Acelerar(){
        int velocidade = this.getVelocidadeAtual();
        velocidade += 20;
        setVelocidadeAtual(velocidade);
    }
    public void Frear(){
      int velocidade = this.getVelocidadeAtual();
      velocidade -= 20;
      setVelocidadeAtual(velocidade);

    }
    public void AndarParaFrente(){
        if(velocidadeAtual < 200)
         Acelerar();

    }
    public void AndarParaTras(){
     if(velocidadeAtual != 0){
        while(velocidadeAtual == 0){
            Frear();
        };
        if(velocidadeAtual == 0 && velocidadeAtual < 20){
        Acelerar();
        }
     }
     if(velocidadeAtual < 20)
       Acelerar();
             
    }
}