package Interface;

public class Quiz implements Measurable
{

	private int Score;
	private int Max;
	private int Average;
	
	public Quiz(int Score){
		this.Score = Score;
	}
	
	@Override
	public double getMeasure() {
		return Score;
	}


}
