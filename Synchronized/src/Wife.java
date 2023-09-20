public class Wife extends Thread {
		private Bank bank;
		public Wife(Bank bank){
			this.bank= bank;
			start();
		}
		@Override
		public void run(){
			bank.withdraw();
		}
	}

