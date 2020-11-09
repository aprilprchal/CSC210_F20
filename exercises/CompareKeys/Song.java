import java.lang.Exception.*;

public class Song implements Comparable<Song> {

  private String title = "undefined";
  private String artist = "undefined";
  private String album = "undefined";
  private Integer year = -1;

  public Song() {
    // sets all member variables to defaults defined above.
  }

  public Song(String inTitle, String inArtist, String inAlbum, Integer inYear) {
    title(inTitle);
    artist(inArtist);
    album(inAlbum);
    year(inYear);
  }

  public Song(String inTitle, String inArtist, String inAlbum) {
    this(inTitle, inArtist, inAlbum, -1);
  }

  @Override
  public String toString() {
    if (year.equals("unknown")) {
      return String.format("%35s by %s. %s",title,artist,album);
    }
    else {
      return String.format("%s by %s. %s (%d)",title,artist,album,year);
    }
  }
  /**
   * @param other Object that is compared to another object
   * @return True or False if it equals other object
   */
  @Override
  public boolean equals(Object other) {
    // From https://www.geeksforgeeks.org/overriding-equals-method-in-java/
    // If the object is compared with itself then return true
    if (other == this) {
      return true;
    }
    // Check if other is an instance of Song or not
    if (!(other instanceof Song)) {
           return false;
    }
    // typecast other to Song so that we can compare data members
    Song otherSong = (Song) other;
    if (!otherSong.title().equalsIgnoreCase(title)) { return false; }
    if (!otherSong.artist().equalsIgnoreCase(artist)) { return false; }
    if (!otherSong.album().equalsIgnoreCase(album)) { return false; }
    return true;
  }

  public String title() { return title; }
  public String artist() { return artist; }
  public String album() { return album; }
	public Integer year() { return year;}

  public void title(String inTitle) { title = inTitle; }
  public void artist(String inArtist) { artist = inArtist; }
  public void album(String inAlbum) { album = inAlbum; }
  public void year(Integer inYear) { year = inYear; }

	public int compareTo(Song other) {
		return title.compareTo(other.title);
	}
}
