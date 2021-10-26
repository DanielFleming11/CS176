
public class Medals {

	public static void main(String[] args) {


		final int COUNTRIES = 0;
		final int MEDALS = 3;
		
		String[] countries =
			{
					"Canada",
					"Italy",
					"Germany",
					"Japan",
					"Kazakhstan",
					"Russia",
					"South Korea",
					"United States"
			};
		
		int[][] counts = 
			{
					{ 0, 3, 0 },
					{ 0, 0, 1 },
					{ 0, 0, 1 },
					{ 1, 0, 0 },
					{ 0, 0, 1 },
					{ 0, 1, 0 },
					{ 0, 1, 0 },
					{ 1, 0, 1 },
			};
		
		System.out.println("   Country 	   Gold     Silver    Bronze    Total");
		System.out.println("______________________________________________________");
	
		for(int i = 0; i < countries.length; i ++) {
				System.out.printf("%13s",countries[i]);
				int t = 0;
				
				for(int j = 0; j < counts[0].length; j++) {
					System.out.printf("%10d",counts[i][j]);
					t = t + counts[i][j];
				}
				
				System.out.printf("%10d", t);
				System.out.println();
		}
	}

}
