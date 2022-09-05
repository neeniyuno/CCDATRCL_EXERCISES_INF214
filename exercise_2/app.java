import java.util.LinkedList;
public class App 
{
    public static void main(String[] args) throws Exception {
        // Creating a new Linkedlist Object
        LinkedList<String> Playlist = new LinkedList<>();

        // Adds new songs to Playlist
        Playlist.add("Daylight");
        Playlist.add("Maple Syrup");
        Playlist.add("Cutting My Fingers Off");
        Playlist.add("Wine");
        Playlist.add("Ivy");

        // Adds a new song at the front of the Playlist
        Playlist.addFirst("Those Eyes");

        // Adds a new song at the end of the Playlist
        Playlist.addLast("My Jinji");

        // Display node at the front in the LinkedList
        System.out.println(Playlist.get(0));

        // Replace the last song using the set() method
        Playlist.set(6, "Glimpse of Us");

        // Remove the first song using the remove() method
        Playlist.remove(0);

        // Display all songs in Playlist
        System.out.println("Updated playlist: " + Playlist);
    }
}

