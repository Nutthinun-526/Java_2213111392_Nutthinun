
public class PiggyBank {

	    public int one;
		public int two;
		public int five;
		public int ten;
		public int size;
		//method
	
		
		
		public void  setPiggyBank(int s) {
			size = s;			
			clear();

		}
		
		public void clear() {
			one = two = five = ten = 0;
			
		}
		
		public int getPiggyBank() {
			return size;
			
		}
		
		public int getTotal() {
			return one + (two*2) + (five*5) * (ten*10);
			
		}
		
		public void addOne(int c) {
			if(getTotal()+c <= size) {
				one += c; // one = one+c
				
			}
			else {
				//System.out.println("Piggy Bank Full");
				System.err.println("Piggy Bank Full");
				
			}
		}
		
		public void addTwo(int c) {
			if(getTotal()+(c*2) <= size) {
				two += c; // two = two+(c*2)
				
			}
			else {
				//System.out.println("Piggy Bank Full");
				System.err.println("Piggy Bank Full");
				
			}
		}
		
		public void addFive(int c) {
			if(getTotal()+(c*5) <= size) {
				five += c; // five = five+(c*5)
				
			}
			else {
				//System.out.println("Piggy Bank Full");
				System.err.println("Piggy Bank Full");
				
			}
		}
		
		public void addTen(int c) {
			if(getTotal()+(c*10) <= size) {
				ten += c; // ten = ten+(c*10)
				
			}
			else {
				//System.out.println("Piggy Bank Full");
				System.err.println("Piggy Bank Full");
				
			}
		}
		

	}//end of Class PiggyBank


