import java.io.*;

public class Java1 {
    public static void main(String[] args)
    {
        String textoConcatenado = "";
        String inputText = "Dog bites man";
        String[] parts = inputText.split(" ");
        System.out.println(parts.length);

        for(int i = parts.length - 1; i >= 0; i--){
            System.out.println(i);
            textoConcatenado = textoConcatenado + " " +parts[i];
        }
        System.out.println("El texto es" + textoConcatenado);
    }

}
