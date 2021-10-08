
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
		
		System.out.println("Country 	Gold 	Silver 	Bronze 	Total");
		System.out.println("");
	
		for(int i = 0; i < countries.length; i ++) {
				System.out.println(countries[i]);
		}
		
		for(int i = 0; i < counts.length; i++) {
			for(int j = 0; j < counts.length; j++) {
				System.out.print(counts[i][j]);
			}
		}
		
	}

}
