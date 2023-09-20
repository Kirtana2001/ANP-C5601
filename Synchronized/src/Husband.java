public class Husband extends Thread {
	private Bank bank;
	public Husband(Bank bank){
		this.bank= bank;
		start();
	}
	@Override
	public void run(){
		bank.deposit();
	}
}
