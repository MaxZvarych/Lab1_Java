package ua.lviv.iot.firstLab;


public class Film {

	public String getFilmName() {
		return filmName;
	}

	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}

	public int getDurationInMinutes() {
		return durationInMinutes;
	}

	public void setDurationInMinutes(int durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}

	public int getNumberOfResponsesOnIMDB() {
		return numberOfResponsesOnIMDB;
	}

	public void setNumberOfResponsesOnIMDB(int numberOfResponsesOnIMDB) {
		this.numberOfResponsesOnIMDB = numberOfResponsesOnIMDB;
	}

	public String getMainActor() {
		return mainActor;
	}

	public void setMainActor(String mainActor) {
		this.mainActor = mainActor;
	}

	public String getProducingCountry() {
		return producingCountry;
	}

	public void setProducingCountry(String producingCountry) {
		this.producingCountry = producingCountry;
	}

	public int getFilmBudget() {
		return filmBudgetInUSD;
	}

	public void setFilmBudget(int filmBudgetInUSD) {
		this.filmBudgetInUSD = filmBudgetInUSD;
	}

	public int getBoxOffice() {
		return BoxOffice;
	}

	public void setBoxOffice(int boxOffice) {
		this.BoxOffice = boxOffice;
	}

	public static int getNumberOfActors() {
		return numberOfActors;
	}

	public static void setNumberOfActors(int numberOfActors) {
		Film.numberOfActors = numberOfActors;
	}

	public static String printStaticNumberOfActors() {
		return "Film [Static Number of actors=" + numberOfActors + "]";
	}

	public String printNumberOfActors() {
		return "Film [Static Number of actors=" + numberOfActors + "]";
	}

	private String filmName;
	private int durationInMinutes;
	public int numberOfResponsesOnIMDB;
	private String mainActor;
	private String producingCountry;
	protected int filmBudgetInUSD;
	protected int BoxOffice;
	private static int numberOfActors;

	public Film(String filmName, int durationInMinutes, int numberOfResponsesOnIMDB, String mainActor,
			String producingCountry, int filmBudgetInUSD, int boxOffice) {
		this.filmName = filmName;
		this.durationInMinutes = durationInMinutes;
		this.numberOfResponsesOnIMDB = numberOfResponsesOnIMDB;
		this.mainActor = mainActor;
		this.producingCountry = producingCountry;
		this.filmBudgetInUSD = filmBudgetInUSD;
		this.BoxOffice = boxOffice;
	}

	public Film(String filmName, int durationInMinutes, int numberOfResponsesOnIMDB, String mainActor) {
		this(filmName, durationInMinutes, numberOfResponsesOnIMDB, mainActor, null, 0, 0);

	}

	@Override
	public String toString() {
		return "Film [filmName=" + filmName + ", durationInMinutes=" + durationInMinutes + ", numberOfResponsesOnIMDB="
				+ numberOfResponsesOnIMDB + ", mainActor=" + mainActor + ", producingCountry=" + producingCountry
				+ ", filmBudgetInUSD=" + filmBudgetInUSD + ", BoxOffice=" + BoxOffice + "]";
	}

	public void resetValues(String filmName, int durationInMinutes, int numberOfResponsesOnIMDB, String mainActor,
			String producingCountry, int filmBudgetInUSD, int boxOffice) {
		this.filmName = filmName;
		this.durationInMinutes = durationInMinutes;
		this.numberOfResponsesOnIMDB = numberOfResponsesOnIMDB;
		this.mainActor = mainActor;
		this.producingCountry = producingCountry;
		this.filmBudgetInUSD = filmBudgetInUSD;
		this.BoxOffice = boxOffice;
	}

}
