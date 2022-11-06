package articles;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
String articleData = scanner.nextLine();
//danni za knigata
        String[] articleParts =articleData.split(", ");
        String title= articleParts[0];
                String content =articleParts[1];
                String author = articleParts[2];
Article article =new Article(title,content,author);
int n =Integer.parseInt(scanner.nextLine());
        for (int commandCount = 1; commandCount <=n ; commandCount++) {
            String command = scanner.nextLine();
            if (command.contains("Edit")){
                //promenq sudurjanieto s novo
                String newContent =command.split(": ")[1];
                        article.edit(newContent);

            } else if (command.contains("ChangeAuthor")) {
                //promenq avtora s tozi daden v komandata
                String newAuthor =command.split(": ")[1];
                //tuk izpolzvame me
                article.changeAuthor(newAuthor);
            } else if (command.contains("Rename")) {
                //promenqme zaglavieto s novo dadeno
                String newTitle =command.split(": ")[1];
                        article.rename(newTitle);
            }
        }
        //title - content: author
        System.out.println(article.toString());
    }
}




