import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		// Create a new list
		List<Song> songs = new List<>();

		// Add some songs
		//public Song(String title, String artist, String album, Integer year)
		songs.add(new Song("Dum Dum Boys","Iggy Pop","The Idiot",1977));
		songs.add(new Song("Swan Lake","Public Image Ltd.","Second Edition",1981));
		songs.add(new Song("Add It Up","Violent Femmes","Violent Femmes",1983));
		songs.add(new Song("Map Ref 41 Degrees", "Wire", "154", 1979));
		songs.add(new Song ("Death Valley","Sonic Youth","Bad Moon Rising"));

		// See how they are ordered
		System.out.println(songs);

		ByTitle byTitle = new ByTitle();
		ByArtist byArtist = new ByArtist();
		ByAlbum byAlbum = new ByAlbum();
		ByYear byYear = new ByYear();

		// Print out all song titles in A to M
		songs.lessThan("M",byTitle);
		// Print out all song titles from N to Z
		songs.greaterThan("M",byTitle);

		// Print out all artists in A to Q
		songs.lessThan("Q",byArtist);
		// Print out all albums from Q to Z
		songs.greaterThan("Q",byArtist);

		// Print out all albums in A to M
		songs.lessThan("M",byAlbum);
		// Print out all albums from N to Z
		songs.greaterThan("M",byAlbum);

		// Print out all albums produced before 1980
		songs.lessThan(1980,byYear);
		// Print out all albums produced after 1980
		songs.greaterThan(1980,byYear);


	}
}
