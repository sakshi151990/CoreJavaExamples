package ovveridingc;

public class ShowYourTalentRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EventRegistartion p1=new SingleEventRegistration("Jenny", "Sing&Win", 1);
		p1.registerEvent();
		EventRegistartion p2=new TeamEventRegistration("Aukra", "ShakeLeg", 5, 1);
		p2.registerEvent();
		
		System.out.println("Signle Event fee: " + p1.getRegistrationFee());
		System.out.println("Team fees: " + p2.getRegistrationFee());
		

	}

}
