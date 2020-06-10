package leetcoding.challenge.june2020;

public class CoinChange {
	public int change(int amount, int[] coins) {
		int size = coins.length;
		return calculateChange(coins, size, amount);
	}

	private int calculateChange(int[] coins, int size, int amount) {
		if (amount == 0) {
			return 1;
		}
		if (amount < 0) {
			return 0;
		}
		if (size < 1 && amount > 0) {
			return 0;
		}
		return calculateChange(coins, size - 1, amount) + calculateChange(coins, size, amount - coins[size - 1]);
	}

	public static void main(String[] args) {
		CoinChange coinChange = new CoinChange();
		int[] a = new int[] { 1, 2, 3 };
		System.out.println(coinChange.change(5, a));
	}
}
