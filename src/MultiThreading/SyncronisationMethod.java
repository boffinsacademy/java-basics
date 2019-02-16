package MultiThreading;

public class SyncronisationMethod {

	public static void main(String[] args) {
	final SynchronisationOperation obj = new SynchronisationOperation();
	SyncronisationStar star = new SyncronisationStar(obj);
	SynchronisationHash hash = new SynchronisationHash(obj);
	star.start();
	hash.start();
	

	}

}
