package Lists;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class PokemonDontGo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
 List<Integer> distances =Arrays.stream(scanner.nextLine().split("\\s+"))
                 .map(Integer::parseInt)
                 .collect(Collectors.toList());

int valueOfRemovedElements =0;
while (!distances.isEmpty()){
    int command =Integer.parseInt(scanner.nextLine());
    int indexToRemove =0;

    if (command<0){
indexToRemove=distances.remove(0);
    valueOfRemovedElements+=indexToRemove;
    //remove the 1 element of the sequence, and COPY the last element to its place.
distances.add(0,distances.get(distances.size()-1));

    }
    else if (command>distances.size()-1){
indexToRemove =distances.remove(distances.size()-1);
distances.add(distances.get(0));
valueOfRemovedElements+=indexToRemove;
    }
    else {
indexToRemove=distances.remove(command);
    valueOfRemovedElements+=indexToRemove;
    }
    for (int i = 0; i < distances.size() ; i++) {
if (distances.get(i)<=indexToRemove){
    distances.set(i,distances.get(i)+indexToRemove);
}
else {
    distances.set(i,distances.get(i)-indexToRemove);
}
    }
}
        System.out.println(valueOfRemovedElements);
    }
}




