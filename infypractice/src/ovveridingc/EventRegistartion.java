package ovveridingc;

public class EventRegistartion {

	private String name;
	private String nameOfEvent;
	private double registrationFee;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNameOfEvent() {
		return nameOfEvent;
	}
	public void setNameOfEvent(String nameOfEvent) {
		this.nameOfEvent = nameOfEvent;
	}
	public double getRegistrationFee() {
		return registrationFee;
	}
	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}
	public EventRegistartion() {
		super();
	}
	public EventRegistartion(String name, String nameOfEvent) {
		super();
		this.name = name;
		this.nameOfEvent = nameOfEvent;
	}
	
	
	public void registerEvent()
	{
		/*switch (nameOfEvent) {
		case "ShakeLeg": registrationFee=100; break;
		case "Sing&Win" : registrationFee=150;break;
		case "Actathon": registrationFee=70;break;
		case "PlayAway" : registrationFee=130;break;
			
			
		default:
			break;
		}
	}*/
	}
}
