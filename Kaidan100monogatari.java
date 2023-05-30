import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Kaidan100monogatari {

    public static void main(String[] args) {
        String[] lines = { "" };
        try {
            Path path = Paths.get("horrortale.txt");
            List<String> list = Files.readAllLines(path);
            lines = list.toArray(new String[list.size()]);

        } catch (IOException ioex) {
            ioex.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]);

            System.out.print("before: ");
            String before = sc.nextLine();
            if (before.equals("")) { // 無入力だと次へ進む
                continue;
            }
            System.out.print("after: ");
            String after = sc.nextLine();
            // 全置換
            for (int j = 0; j < lines.length; j++) {
                lines[j] = lines[j].replace(before, after);
            }
            System.out.println(lines[i] + "\r\n");
        }
        sc.close();
    }
}