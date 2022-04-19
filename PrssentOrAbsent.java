package Day8;

public class PrssentOrAbsent
{
	static int Prasent=1;
	static double Empcheck= Math.floor(Math.random() *10)%2;

	
public static void main(String[] args) {
		//Empchek mk = new Empchek();
	if(Empcheck==Prasent) {
		System.out.println("Employee is Present");

		}
	else {
		System.out.println("Employee is Absent");
	}

	}
}

