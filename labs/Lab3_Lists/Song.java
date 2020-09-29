import java.lang.Exception.*;

public class Song {

  private String title = "undefined";
  private String artist = "undefined";
  private String album = "undefined";
  private String year = "undefined";

  public Song() {
    // sets all member variables to defaults defined above.
  }

  public Song(String inTitle, String inArtist, String inAlbum, String inYear) {
    title(inTitle);
    artist(inArtist);
    album(inAlbum);
    year(inYear);
  }

  public Song(String inTitle, String inArtist, String inAlbum) {
    this(inTitle, inArtist, inAlbum, "unknown");
  }

  @Override
  public String toString() {
    if (year.equals("unknown")) {
      return String.format("%35s by %s. %s",title,artist,album);
    }
    else {
      return String.format("%35s by %s. %s (%s)",title,artist,album,year);
    }
  }

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
    // vvvvvvvvvvvvvvv   FINISH THIS EQUALS
    /* CHECK THAT 
    title, 
    artist, 
    album are same. use equalsIgnoreCase
    */
    return true;
  }

  public String title() { return title; }
  public String artist() { return artist; }
  public String album() { return album; }
  public String year() { return year; }

  public void set(String field, String value) {
    if (field.equalsIgnoreCase("title")) {
      title(value); return; }
    if (field.equalsIgnoreCase("artist")) {
      artist(value); return; }
    if (field.equalsIgnoreCase("album")) {
      album(value); return; }
    if (field.equalsIgnoreCase("year")) {
      year(value); return; }
    throw new IllegalArgumentException("Field not recognized.");
  }

  public void title(String inTitle) { title = inTitle; }
  public void artist(String inArtist) { artist = inArtist; }
  public void album(String inAlbum) { album = inAlbum; }
  public void year(String inYear) { year = inYear; }
}