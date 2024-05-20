package application;

import java.util.Iterator;
import java.util.PriorityQueue;

public class MinhaPlaylist
{
    public static void main(String[] args)
    {
        PriorityQueue<String> playlist = new PriorityQueue<>();

        System.out.println("Minha playlist ainda não possui músicas...");

        playlist.add("Bones - Imagine Dragons");
        playlist.add("Beautiful Things - Benson Boone");
        playlist.add("Jungle - Fred Again..");
        playlist.add("Strangers - Kenya Grace");
        playlist.add("Sticky - Drake");

        if (playlist.isEmpty())
        {
            System.out.println("Minha playlist ainda não possui músicas...");
        }
        else
        {
            System.out.println("Minha playlist agora possui músicas...");
        }

        System.out.println("O número total das músicas na minha playlist são: " + playlist.size());

        String primeiraMusica = playlist.poll();

        System.out.println("A primeira música da playlist que foi removida foi: " + primeiraMusica);

        Iterator<String> it = playlist.iterator();

        System.out.println("\nAinda restam essas músicas:");

        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
