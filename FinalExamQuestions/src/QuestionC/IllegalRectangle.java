package QuestionC;
Extend exception;

public class IllegalRectangle (int newx, int newy){
	public Rectangle(int newx, int newy) throws IllegalRectangle {
		if (int newx || int newy < 0){
			throw new IllegalRectangle("X and Y cannot be negative");
		else 
			System.out.println(newx,newy);
		}
	}

}
