public class Customer {
	public String id;
	public String name,surname;
	public String sex;
	public double credit;
	
	public Customer(String id, String name, String surname, String sex, double credit) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.sex = sex;
		this.credit = credit;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if (id.length()!=5) {//id 5 haneli bir say� olmak zorunda diye k�s�tlad�m.
			System.out.println("Id is failure");
		}
		else
		this.id = id;
	}

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}
	
}
