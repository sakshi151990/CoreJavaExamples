package ovveridingc;

public class TeamEventRegistration extends EventRegistartion{
	
	private int noOfparticipants;
	private int teamno;
	
	
	public TeamEventRegistration(String name, String nameOfEvent, int noOfparticipants, int teamno) {
		super(name, nameOfEvent);
		this.noOfparticipants = noOfparticipants;
		this.teamno = teamno;
	}
	
	public int getNoOfparticipants() {
		return noOfparticipants;
	}
	public void setNoOfparticipants(int noOfparticipants) {
		this.noOfparticipants = noOfparticipants;
	}
	public int getTeamno() {
		return teamno;
	}
	public void setTeamno(int teamno) {
		this.teamno = teamno;
	}
	
	@Override
	public void registerEvent()
	{
		switch (super.getNameOfEvent()) {
		case "ShakeLeg": super.setRegistrationFee(50*noOfparticipants); break;
		case "Sing&Win" : super.setRegistrationFee(60*noOfparticipants);break;
		case "PlayAway" : super.setRegistrationFee(100*noOfparticipants);break;
		case "Actathon": super.setRegistrationFee(80*noOfparticipants);break;
			
		default:
			break;
		}
	}
}
