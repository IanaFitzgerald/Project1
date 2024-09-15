package lesson3;

public class Lesson2Main {
    public static void main(String[] args) {
        Lesson2Main lesson2 = new Lesson2Main();
//        lesson2.printUserInfo("John' Doe", 1);
        boolean isBonusAvailable = true;
        lesson2.checkScore("John Doe", 1, 30, isBonusAvailable);
        lesson2.checkScore("Kim Lee", 2, 50, isBonusAvailable);
        lesson2.checkScore("Anna Smith", 3, 60, isBonusAvailable);
    }

    public void printUserInfo(String username, int userid) {
        System.out.println("The user name is " + username);
        System.out.println("The user id is " + userid);

    }

    public void checkScore(String userName, int userId, int userScore, boolean isBonusAvailable) {
        System.out.println("The user name is " + userName);
        System.out.println("The user id is " + userId);

        if (userName.equals("John Doe")) {
            userScore = userScore + 20;
        }

        if (isBonusAvailable == true) {
            userScore = userScore + 10;
        }

        if (userScore > 100 || userScore < 0) {
            System.out.println("Error");
        } else if (userScore >= 60) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
