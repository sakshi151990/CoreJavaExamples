package abstractclassesandmethods;

public class FootBall {
	
	private String leagueName="league";
private String coachName="tem";
	
	class Player{
		private String name="sak";
		private long phone=63373;
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public long getPhone() {
			return phone;
		}

		public void setPhone(long phone) {
			this.phone = phone;
		}

		public void display()
		{
			System.out.println(leagueName+coachName);
		}
		
	}

	public static void main(String[] args)
	{FootBall football=new FootBall();
		FootBall.Player player=football.new Player();
		player.display();
		System.out.println(player.getName());
	
	}
}
