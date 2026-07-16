package sdet;

public class GreetingsMain {
    static void main(String[] args) {
        Greetings gr = new Greetings();
        gr.m1();  // 1
        String s = gr.m2();  // 2
        System.out.println(s);
        gr.m3("Ahsan"); // 3
        String value = gr.m4("David");
        System.out.println(value);
    }
}
