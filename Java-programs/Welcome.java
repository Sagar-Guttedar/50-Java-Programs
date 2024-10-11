class Welcome{
	String name;
	String msg;
	public void storeDeatils(String n, String m){
		name = n;
		msg = m;
	}
	public void displayDetails(){
		System.out.println("Hello "+name);
		System.out.println(msg);
	}
	public static void main(String[] args){
		Welcome w = new Welcome();
		w.storeDeatils("Sagar Guttedar","Welcome to Java World..!");
		w.displayDetails();
	}
}