package ThreadAssignment;

class Company {
	int n;
	boolean f = false;
	// f = false chance to produce
	// f  = true chance to consume
	synchronized public void produce_item(int n) throws InterruptedException {
		if(f) {
			wait();
		}
		this.n = n;
		System.out.println("Produced:  " + this.n);
		f=true;
		notify();
	}

	synchronized public int consume_item() throws InterruptedException {
		if(!f) {
			wait();
		}
		System.out.println("Consumed:  " + this.n);
		f=false;
		notify();
		return this.n;
	}
}