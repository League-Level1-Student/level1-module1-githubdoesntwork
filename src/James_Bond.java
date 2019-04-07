
public class James_Bond {
	public static void main(String[] args) {
		//put "findCode();" here :)
	}

	static Vault vault = new Vault(932143);

	public static void findCode() {
		for (int i = 0; i < 1000000; i++) {
			boolean unlocked = vault.tryCode(i);
			if (unlocked) {
				System.out.println("The vault is open.");
				break;
			} if(!unlocked){
				System.out.println("The vault is not open");
	
			}
		}
	}
}
