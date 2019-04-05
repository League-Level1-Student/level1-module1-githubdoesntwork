
public class James_Bond {
	public static void main(String[] args) {
		findCode();
	}

	static Vault vault = new Vault(932143);

	public static void findCode() {
		for (int i = 0; i < 1000000; i++) {
			vault.tryCode(i);
		}
	}
}
