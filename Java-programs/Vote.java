class Vote{
	int age;
	public void store(int a){
		age=a;
	}
	
	public void check(){
		System.out.println("Your age is: "+age);
		if(age >=18 && age >=25){
			System.out.println("You are eligible to participate in election");
		}
		else if(age >=18 && age <=24){
			System.out.println("You can vote");
		}
		else {
			System.out.println("You cannot vote");
		}
		System.out.println("Finished executing the check method");
	}
	
	public static void main(String[] args){
		Vote v = new Vote();
		v.store(20);
		v.check();
	}
}