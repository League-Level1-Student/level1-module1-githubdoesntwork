public class Vault {
	int VaultCode;

	public Vault(int Vault) {
		VaultCode = Vault;
	}

	public boolean tryCode(int a) {
		if (a == VaultCode) {
			return true;
		} else {
			return false;
		}
	}
}
