package lesson7.Game;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


public class Game {
    enum GameType {
        SOCCER,
        HOCKEY,
        RUGBY
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.createFile(GameType.SOCCER);
        game.createFile(GameType.HOCKEY);
        game.createFile(GameType.RUGBY);
        game.writeNumOfPlayersPerTeam(GameType.SOCCER, 11);
        game.writeNumOfPlayersPerTeam(GameType.HOCKEY, 6);
        game.writeNumOfPlayersPerTeam(GameType.RUGBY, 15);
    }

    public void createFile(GameType type) {
        String fileName = getFileName(type);
        File file = new File(fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + fileName);
            } else {
                System.out.println("File already exists: " + fileName);
            }
        } catch (IOException e) {
            throw new RuntimeException("Error creating file: " + fileName, e);
        }
    }

    public void writeNumOfPlayersPerTeam(GameType type, int numOfPlayers) {
        String fileName = getFileName(type);
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Number of players per team: " + numOfPlayers);
        } catch (IOException e) {
            throw new RuntimeException("Error writing to file: " + fileName, e);
        }
    }

    public String getFileName(GameType type) {
        switch (type) {
            case SOCCER:
                return "Soccer.txt";
            case HOCKEY:
                return "Hockey.txt";
            case RUGBY:
                return "Rugby.txt";
            default:
                throw new IllegalArgumentException("Unknown game type");
        }
    }
}