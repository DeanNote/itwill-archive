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
		
		System.out.println("--------------------------------------------------");
		
		// ordinal() : 상수의 순서번호를 정수로 리턴
		System.out.println("오늘의 ordinal값 : " + today.ordinal());
		
		if(today.ordinal()<4) {
			System.out.println("아직 금요일이 아니다!");
		}else if(today.ordinal()==4) {
			System.out.println("금요일!");
		}else {
			System.out.println("휴일!");
		}
		
		//name(): 상수명을 문자열로 리턴
		System.out.println(today.name());
		System.out.println(today.toString());
		
	}//main end

}// Ex end
