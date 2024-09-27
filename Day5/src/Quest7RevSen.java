import java.util.Scanner;

public class Quest7RevSen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        StringBuilder sen = new StringBuilder();
        for(int i = words.length -1 ; i >= 0 ; i--){
            sen.append(words[i]).append(" ");
        }
        System.out.println("Reversed string: " + sen.toString().trim());
        sc.close();
    }
}
