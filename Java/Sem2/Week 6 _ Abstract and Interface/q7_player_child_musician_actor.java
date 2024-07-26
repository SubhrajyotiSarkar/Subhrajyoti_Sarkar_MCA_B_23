import java.util.Scanner;

interface Player {
    void play();
}

class Child implements Player {
    @Override
    public void play() {
        System.out.println("For a child, playing means having fun and enjoying activities.");
    }
}

class Musician implements Player {
    @Override
    public void play() {
        System.out.println("For a musician, playing means performing music with instruments or vocals.");
    }
}

class Actor implements Player {
    @Override
    public void play() {
        System.out.println("For an actor, playing means performing roles in theater, film, or television.");
    }
}

public class q7_player_child_musician_actor {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Choose a player to learn about their definition of 'play':");
        System.out.println("1. Child");
        System.out.println("2. Musician");
        System.out.println("3. Actor");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        Player player;
        switch (choice) {
            case 1:
                player = new Child();
                break;
            case 2:
                player = new Musician();
                break;
            case 3:
                player = new Actor();
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        player.play();
    }
}
