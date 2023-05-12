package Code;

import java.util.LinkedList;

public class RecentlyPlayedSongs
{
	public static void main(String[] args) {
		
	RecentlyPlayedStore store = new RecentlyPlayedStore(3);

	store.addSong("user1", "S1");
	store.addSong("user1", "S2");
	store.addSong("user1", "S3");

	LinkedList<String> songs = store.getRecentlyPlayed("user1");
	System.out.println("Recently played songs for user1: " + songs);

}
}
