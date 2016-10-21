<<<<<<< HEAD
public class TrainStation
{
    private MaquinaDeBillete maquina1;
    private MaquinaDeBillete maquina2;
    private int dineroTotal;
    private int balance;

    public TrainStation()
    {
        maquina1 = new MaquinaDeBillete(300);
        maquina2 = new MaquinaDeBillete(200);
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
=======
 public class TrainStation
{
	private MaquinaDeTicket maquina1;
	private MaquinaDeTicket maquina2;
	private int dineroTotal;

	public TrainStation()
	{
		maquina1 = new MaquinaDeTicket(300);
		maquina2 = new MaquinaDeTicket(200);
		dineroTotal = 0;
  }
  
  public void imprimirTotalDelDinero()
	{
		dineroTotal = maquina1.obtenerTotal();
		dineroTotal = dineroTotal + maquina2.obtenerTotal();
    System.out.println(dineroTotal);
	}
	
  
}
>>>>>>> a2d8fe966cafdd5dc944bdd8786277295d4f7bd8
