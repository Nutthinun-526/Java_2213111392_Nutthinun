
public class Lap703_ClassStudent {
	
	private  String name;
	private  int score;

	
	
	
	
	public  void setName(String Name) {
		name = Name;

	}
	
	public String getName() {

		return name;
	}
	
	public void setScore(int Score) {
		score = Score;
	}
	
	public int getScore() {
		return score;
	}
	
	public boolean checkScore() {
		if(score >= 0 && score <= 100) 
			return true;
		return false;
		
	}
	
	public boolean isPass() {
		if(score >= 50) {
			return true;}
		else {return false;}
		
	}
	
	public String findGrade(int score) {
		
		
			if(score <=100 && score >=80) {
				return "A";
			}
			else if(score <=79 && score >=75) {
				return "B+";
			}
			else if(score <=74 && score >=70) {
				return "B";
			}
			else if(score <=69 && score >=65) {
				return "C+";
			}
			else if(score <=64 && score >=60) {
				return "C";
			}
			else if(score <=59 && score >=55) {
				return "D+";
			}
			else if(score <=54 && score >=50) {
				return "D";
			}
			else {
				return "F";
			
			
		}
		
	}

}