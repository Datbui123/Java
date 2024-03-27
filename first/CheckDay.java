package first;

public class CheckDay {
	public static void main(String args[]){
		int day = 0;
		String rule;
		switch (day) {
		case 0:
		case 1:
		rule = "weekend";
		break;
		case 2:
		case 6:
		rule = "weekday";
		break;
		default:
		rule = "error";
		}
		if (day == 0 || day == 1) {
			rule = "weekend";
			} else if (day > 1 && day <7)
			{
			rule = "weekday";
			} else {
			rule = "error";
		}
	}
}