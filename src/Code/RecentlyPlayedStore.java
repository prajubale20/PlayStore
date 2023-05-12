package Code;


	import java.util.HashMap;
	import java.util.LinkedList;
	import java.util.Map;

	public class RecentlyPlayedStore {
	  private final int capacity;
	  private final Map<String, LinkedList<String>> songMap;

	  public RecentlyPlayedStore(int capacity) {
	    this.capacity = capacity;
	    songMap = new HashMap<>();
	  }

	  public void addSong(String user, String song) {
	    if (!songMap.containsKey(user)) {
	      songMap.put(user, new LinkedList<>());
	    }

	    LinkedList<String> songs = songMap.get(user);
	    songs.addFirst(song);

	    if (songs.size() > capacity) {
	      songs.removeLast();
	    }
	  }

	  public LinkedList<String> getRecentlyPlayed(String user) {
	    return songMap.getOrDefault(user, new LinkedList<>());
	  }
	}


