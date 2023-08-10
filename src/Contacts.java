package src;
    public class Person {

        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void sayHello() {
            System.out.printf("Hello, %s%n", this.name);

        }

    }

}

