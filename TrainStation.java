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
