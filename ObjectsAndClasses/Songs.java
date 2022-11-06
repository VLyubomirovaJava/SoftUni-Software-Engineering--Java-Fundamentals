package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
    static class Song{
            private String TypeList;
            private String Name;
            private String Time;
//konstruktor
        public Song(String TypeList,String Name, String Time){
            this.TypeList=TypeList;
            this.Name=Name;
            this.Time=Time;

        }
            public String getTypeList() {
                //tova vrushta typelist kato stoinost

                return this.TypeList;
            }

            public String getName() {
                return this.Name;
            }

            public String getTime() {
                return this.Time;
            }
        }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //kolko puti shte chetem pesni e n
int n =Integer.parseInt(scanner.nextLine());
List<Song> listSongs =new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            String inputLine = scanner.nextLine();
            String[] inputSongArr = inputLine.split("_");
            Song currentSong = new Song(inputSongArr[0], inputSongArr[1], inputSongArr[2]);
            listSongs.add(currentSong);

        }
        String command = scanner.nextLine();
        if (command.equals("all")){
            for (Song item:listSongs) {
                //vadim na konkretnata pesen, konkretnoto ime
                System.out.println(item.getName());
            }
        }else {
            for (Song item:listSongs) {
                //izprintirai imeto samo ako tipa lsit e ednakuv s komandata
if (item.getTypeList().equals(command)){
    System.out.println(item.getName());
}
            }
        }
    }
}




