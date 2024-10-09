class Caluclator{
	int a, b;
	public void add(int x, int y){
		a = x;
		b = y;
		int c = a+b;
		System.out.println("Addition of two no's : "+c);
	}
	public int sub(int x, int y){
		a = x;
		b = y;
		int c = a-b;
		return c;
	}
	public static void main(String[] args){
		Caluclator ca = new Caluclator();
		ca.add(100,200);
		int z = ca.sub(2000,1024);
		System.out.println("Substraction of two no's : "+z);
	}
}
