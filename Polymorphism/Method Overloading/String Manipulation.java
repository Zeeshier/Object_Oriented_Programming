class StringManipulator {
    String concat(String a, String b) {
        return a + b;
    }

    String concat(String a, char b) {
        return a + String.valueOf(b);
    }

    String concat(char a, String b) {
        return String.valueOf(a) + b;
    }

    String repeat(String a, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(a);
        }
        return sb.toString();
    }

    String repeat(char a, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(a);
        }
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        System.out.println(manipulator.concat("Hello", "World")); // Output: HelloWorld
        System.out.println(manipulator.concat("Hello", '!')); // Output: Hello!
        System.out.println(manipulator.concat('H', "ello")); // Output: Hello
        System.out.println(manipulator.repeat("Hello", 3)); // Output: HelloHelloHello
        System.out.println(manipulator.repeat('H', 5)); // Output: HHHHH
    }
}
