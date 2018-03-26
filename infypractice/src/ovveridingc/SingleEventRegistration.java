package ovveridingc;

public class SingleEventRegistration extends EventRegistartion {

	private int participantNO;

	public SingleEventRegistration(String name, String nameOfEvent, int participantNO) {
		super(name,nameOfEvent);
		this.participantNO = participantNO;
	}

	public int getParticipantNO() {
		return participantNO;
	}

	public void setParticipantNO(int participantNO) {
		this.participantNO = participantNO;
	}
	
	@Override
	public void registerEvent()
	{
		switch (super.getNameOfEvent()) {
		case "ShakeLeg": super.setRegistrationFee(100); break;
		case "Sing&Win" : super.setRegistrationFee(150);break;
		case "PlayAway" : super.setRegistrationFee(130);break;
			
			
		default:
			break;
		}
	}
	
}
