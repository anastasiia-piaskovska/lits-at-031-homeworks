import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Song {

	@JsonProperty("artist")
	private String artist;
	
	@JsonProperty("title")
	private String title;

	@JsonProperty("duration")
	private String duration;

	public String getArtist() {
		return artist;
	}

	public String getTitle() {
		return title;
	}

	public String getDuration() {
		return duration;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", duration=" + duration + "]";
	}

}
