
public class Vault_Runner {
	public static void main(String[] args) {
		Vault lock = new Vault(932143);
		boolean unlocked = lock.tryCode(789778);
		if (unlocked) {
			System.out.println("The vault is open.");
		} else {
			System.out.println("The vault is not open");
		}
	}
}
