
public class Main {
    public static void main(String[] args) {

        int x = 10;
         int y=15;
        char letter = 'a';
        boolean isTrue = true;
        int sum = x + 5;
        double avg = (x + y)/2;

        if(x > y && isTrue) {
            System.out.println("Condition is true");
        }

        else if(x > 5) {
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is less than or equal to 5");
        }

        switch(letter) {
            case 'a':
                System.out.println("Letter is a");
                break;
            case 'b':
                System.out.println("Letter is b");
                break;
        }


        int count = 0;
        while(count < 5) {
            System.out.println(count);
            count++;
        }

        int result = max(x, y);
        System.out.println("Max is: " + result);

    
        Person person = new Person("Andebet");
        person.greet();

    }

    static int max(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }

    static class Person {
        String name;

        Person(String name){
            this.name = name;
        }

        void greet() {
            System.out.println("Hello, I am " + name);
        }
    }

}

