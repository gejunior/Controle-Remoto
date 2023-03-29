package controle;
public class Principal {
    public static void main(String[] args) {
       ControleRemoto c = new ControleRemoto();
       c.maisVolume();
       c.play();
       c.ligar();
       c.abrirMenu();
       c.fecharMenu();
    }
}
