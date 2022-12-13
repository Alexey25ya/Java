public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		Persister persister = new Persister(user);
		ConsolePersister consolePersister = new ConsolePersister(user);
		consolePersister.report();;
		persister.save();
	}
}