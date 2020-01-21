package ua.lviv.iot.firstLab;


public class FilmInfo {

	public static void main(String[] args) {
		Film firstFilm = new Film("Game of Thrones ", 45, 1452, "Peter Dinklage", "USA", 1000000, 1000000000);
		System.out.println(firstFilm.toString());
		Film.setNumberOfActors(5);
		System.out.println(Film.printStaticNumberOfActors());
		System.out.println(firstFilm.printNumberOfActors());
		Film secondFilm = new Film("Breaking Bad ", 55, 142, "Walter White", "Canada", 15000, 1000550);
		System.out.println(secondFilm.toString());
		Film thirdFilm = new Film("Vikings", 60, 240, "Ragnar Lodbrock");
		System.out.println(thirdFilm);
		Film[] bestFilms = new Film[4];
		for (int counter = 0; counter < 4; counter++) {
			Film film = new Film("Film number " + (counter + 1), 100 + counter, 200 * (counter + 1),
					"Main actor of " + (counter + 1) + "st film is Leo Dicaprio");
			bestFilms[counter] = film;
		}
		for (Film film : bestFilms) {
			System.out.println(film);
		}
	}

}
