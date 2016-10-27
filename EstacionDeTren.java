
public class EstacionDeTren
{
    private MaquinaDeBillete maquina1;
    private MaquinaDeBillete maquina2;
    private int dineroTotal;
    private int balance;

    public EstacionDeTren()
    {
        maquina1 = new MaquinaDeBillete();
        maquina2 = new MaquinaDeBillete();
        dineroTotal = 0;
    }

    public void imprimirTotalDelDinero()
    {
        dineroTotal = maquina1.obtenerTotal();
        dineroTotal = dineroTotal + maquina2.obtenerTotal();
        System.out.println(dineroTotal);
    }

    public void comprarBillete()
    {
       maquina1.insertarMoneda(300);
       maquina2.insertarMoneda(200);
       maquina1.imprimirBillete();
       maquina2.imprimirBillete();
    }

}
