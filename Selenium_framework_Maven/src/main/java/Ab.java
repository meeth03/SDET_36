
public class Ab {
	public void m1() {
		System.out.println("from class ab");
	}
	class B extends Ab{
		public void m1() {
			System.out.println("from class B");
		}
	
			public void main(String [] args) {
				
				Ab a=new Ab();
				a.m1();
				
				B b=new B();
				b.m1();
			}
		}
	}


