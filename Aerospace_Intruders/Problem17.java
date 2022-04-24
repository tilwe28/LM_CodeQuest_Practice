import java.util.*;
public class Problem17
{
	public static void main(String[] args)
	{
		try (Scanner input = new Scanner(System.in))
		{
			int testCases = Integer.parseInt(input.nextLine());
			for (int testcase = 0; testcase < testCases; testcase++)
			{
				int numShips = Integer.parseInt(input.nextLine());
				ArrayList<Ship> ships = new ArrayList<Ship>(), destroyed = new ArrayList<Ship>();
				for (int currShip = 0; currShip < numShips; currShip++)
				{
					String values = input.nextLine();
					ships.add(new Ship(values.split("_")[0], values.split("_")[1].split(":")[0], Integer.parseInt(values.split(":")[1].split(",")[0]), Integer.parseInt(values.split(",")[1])));
				}
				ships.sort(Comparator.comparing(Ship::getX).thenComparing(Ship::getY));
				do {
					destroyShip(ships, destroyed);
				} while (!ships.isEmpty());
				for (Ship s : destroyed)
					System.out.println("Destroyed Ship: " + s);
			}
		}
	}

	public static void destroyShip(ArrayList<Ship> ships, ArrayList<Ship> destroyed)
	{
		destroyed.add(ships.remove(0));;
		for (Ship s : ships)
		{
			if (s.getType().equals("A"))
				s.setX(s.x-10);
			else if (s.getType().equals("B"))
				s.setX(s.x-20);
			else if (s.type.equals("C"))
				s.setX(s.x-30);
		}
		ships.sort(Comparator.comparing(Ship::getX).thenComparing(Ship::getY, Comparator.reverseOrder()));
	}

	static class Ship
	{
		private String name, type;
		private int x, y;

		public Ship(String name, String type, int x, int y)
		{
			this.name = name;
			this.type = type;
			this.x = x;
			this.y = y;
		}

		public String getName() { return name; }
		public String getType() { return type; }
		public int getX() { return x; }
		public int getY() { return y; }

		public void setX(int x) { this.x = x; }

		public String toString()
		{
			return name + " xLoc:" + " " + x;
		}
	}
}
