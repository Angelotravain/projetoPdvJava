
public class Test{

    @Test
    public void TestarQuantidadePortas(){
        Carro car = new Carro(2, 4);
        assertTrue(car.getPortas().count > 2 && car.getPortas().count < 4);
    }

    @Test
    public void TestarQuantidadeRodas(){
        Carro car = new Carro(2, 4);
        assertEquals(4, car.getRodas());
    }

    @Test
    public void testVelocidadeAoAndarParaFrente() {
        Carro car = new Carro(2, 4);
        car.Acelerar();
        assertTrue(car.getVelocidadeAtual() >= 0 && car.getVelocidadeAtual() <= 200);
    }

    @Test
    public void testVelocidadeAoAndarParaTras() {
        Carro car = new Carro(2, 4);
        car.acelerar();
        assertTrue(car.getVelocidadeAtual() >= 0 && car.getVelocidadeAtual() <= 20);
    }

    @Test
    public void EngatarRe(){
        Carro car = new Carro(2,4);
        car.setVelocidadeAtual(0);
        car.AndarParaTras();
        assertEquals(0, !car.getVelocidadeAtual());

    }

    @Test
    public void GarantirQueOCarroAceleraComDiferenca(){
        Carro car = new Carro(2,4);
        car.setVelocidadeAtual(0);
        int velocidade = car.getVelocidadeAtual();
        car.Acelerar();
        int velocidadeAcelerada = car.getVelocidadeAtual();

        assertTrue(velocidade != velocidadeAcelerada);
    }

    @Test
    public void GarantirQueOCarroFreiaComDiferenca(){
        Carro car = new Carro(2,4);
        car.setVelocidadeAtual(0);
        int velocidade = car.getVelocidadeAtual();
        car.Frear();
        int velocidadeAcelerada = car.getVelocidadeAtual();

        assertTrue(velocidade != velocidadeAcelerada);
    }

    @Test
    public void GarantirQueOCarroAndaParaFrente(){
        Carro car = new Carro(2,4);
        car.setVelocidadeAtual(0);
        int velocidade = car.getVelocidadeAtual();
        car.AndarParaFrente();
        int velocidadeAcelerada = car.getVelocidadeAtual();

        assertTrue(velocidade != velocidadeAcelerada);
    }

    @Test
    public void GarantirQueOCarroAndaParatras(){
        Carro car = new Carro(2,4);
        car.setVelocidadeAtual(0);
        int velocidade = car.getVelocidadeAtual();
        car.AndarParaTras();
        int velocidadeAcelerada = car.getVelocidadeAtual();

        assertTrue(velocidade != velocidadeAcelerada);
    }
}