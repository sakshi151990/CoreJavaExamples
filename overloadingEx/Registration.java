package overloadingc;

public class Registration {

	private String customerName;
	private String panCardNo;
	private int voterId;
	private String passportNo;
	private int licenseNo;
	private long[] telephoneNo;

	public String getCustomerName() {
		return customerName;
	}

	public String getPanCardNo() {
		return panCardNo;
	}

	public int getVoterId() {
		return voterId;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public int getLicenseNo() {
		return licenseNo;
	}

	public long[] getTelephoneNo() {
		return telephoneNo;
	}
	
	

	public Registration(String customerName, String passportNo, long[] telephoneNo) {
		super();
		this.customerName = customerName;
		this.passportNo = passportNo;
		this.telephoneNo = telephoneNo;
		System.out.println("Congratualtion" + customerName + " you are successfully registered with below proofs: " + "Passport no : " + passportNo + "\n Phone no "+ telephoneNo.toString() );
		
		
	}

	
	
	public Registration(String customerName,int licenseNo,  String panCardNo, long[] telephoneNo) {
		super();
		this.customerName = customerName;
		this.panCardNo = panCardNo;
		this.licenseNo = licenseNo;
		this.telephoneNo = telephoneNo;
		
		System.out.println("Congratualtion" + customerName + " you are successfully registered with below proofs: " + "PanCard: " + panCardNo + "\n License No : "+ licenseNo + "\n Phone no "+ telephoneNo.toString() );
		
	}

	public Registration(String customerName, int voterId, int licenseNo, long[] telephoneNo) {
		super();
		this.customerName = customerName;
		this.voterId = voterId;
		this.licenseNo = licenseNo;
		this.telephoneNo = telephoneNo;
		
		System.out.println("Congratualtion" + customerName + " you are successfully registered with below proofs: " + "Voter ID : " + voterId + "\n License No : "+ licenseNo + "\n Phone no "+ telephoneNo.toString() );
	}
	
	

	public Registration(String customerName, String panCardNo,int voterId,  long[] telephoneNo) {
		super();
		this.customerName = customerName;
		this.panCardNo = panCardNo;
		this.voterId = voterId;
		this.telephoneNo = telephoneNo;
		
		System.out.println("Congratualtion" + customerName + " you are successfully registered with below proofs: " + "PanCard: " + panCardNo + "\n Voter id  : "+ voterId + "\n Phone no "+ telephoneNo.toString() );
		
		
	}



}
