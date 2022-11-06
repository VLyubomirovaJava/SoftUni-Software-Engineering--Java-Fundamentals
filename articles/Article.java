package articles;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Article {
   //poleta-> harakteristiki
    private String title; //zaglavie
    private String content; //sudurjanie
    private String author; //avtor

    //konstruktor - suzdava novi obekti


    public Article(String title,String content,String author) {
        this.author = author;
        this.title = title;
        this.content = content;
    }
    //metodi - povedenie
    public void edit (String newContent){
        this.content =newContent;
}
public void changeAuthor (String newAuthor){
        this.author=newAuthor;
}
public void rename(String newTitle){
        this.title=newTitle;

}
//vgraden metod - prevrushta obekta v tekst -packagename.classname. title
public String toString(){
        //title -content: author
   // return this.title +" - " + this.content+": " + this.author;
    return String.format("%s - %s: %s",this.title,this.content,this.author);
    //vgraden metod v string-? prevrushta obekta v title-content:author
}
}




