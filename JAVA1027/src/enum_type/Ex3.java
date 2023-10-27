package enum_type;

public class Ex3 {

	public static void main(String[] args) {
		
		
	}

}

enum Month{
	JANUARY("1월"), FEBRUARY("2월");
	
	private String monthKor;
	
	private Month(String monthKor) {
		this.monthKor = monthKor;
	}

	
	
}
