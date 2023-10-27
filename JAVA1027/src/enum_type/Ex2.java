package enum_type;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 enum 상수 연산 및 메서드
		  
		 */
		EnumWeek today = EnumWeek.FRIDAY;
		
		if(today == EnumWeek.FRIDAY) {
			System.out.println("금요일입니다!");
		} else {
			System.out.println("금요일이 아닙니다!");
		}
		
		switch(today) {
//			case EnumWeek.MONDAY :
			case MONDAY    : System.out.println("월요일입니다."); break;
			case TUSEDAY   : System.out.println("화요일입니다."); break; 
			case WEDENSDAY : System.out.println("수요일입니다."); break;
			case THURSDAY  : System.out.println("목요일입니다."); break;
			case FRIDAY    : System.out.println("금요일입니다."); break;
			case SATURDAY  : System.out.println("토요일입니다."); break;
			case SUNDAY    : System.out.println("일요일입니다."); break;
			
		}
		
		
		
	}//main end

}// Ex end
