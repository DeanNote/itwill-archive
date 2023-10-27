package enum_type;

public class test2 {

	public static void main(String[] args) {

		EnumWeek2 today = EnumWeek2.SAT;
		switch (today) {
		case MON:
		case TUS:
		case WED:
		case THU:System.out.println("하..."); break;
		case FRI:System.out.println("불금!"); break;
		case SAT:
		case SUN:System.out.println("주말!"); break;
		}
		
		
	}//main end

}//test2 end

enum EnumWeek2{
	MON,TUS,WED,THU,FRI,SAT,SUN
}
