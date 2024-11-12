package hackerRank.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

class Player {
	String name;
	int score;

	public Player(String n, int s) {
		this.name = n;
		this.score = s;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
}

class Checker implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		int ScoreComparison = Integer.compare(o2.getScore(), o1.getScore());
		if (ScoreComparison != 0) {
			return ScoreComparison;
		} else {
			return o1.getName().compareTo(o2.getName());
		}

	}

}

public class JavaComparator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		Player[] p = new Player[size];
		for (int i = 0; i < size; i++) {
			String name = s.next();
			int score = s.nextInt();
			p[i] = new Player(name, score);

		}

		Arrays.sort(p, new Checker());

		System.out.println(Arrays.stream(p).map(player -> player.getName() + " " + player.getScore())
				.collect(Collectors.joining("\n")));

	}
}
