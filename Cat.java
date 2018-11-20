public class Cat extends Animal {
    public Cat() {
        super(4);
       this.setNoise("Meow");
        this.setName("Cat");
    }


        @Override
        public String toString () {
            return "An adorable kitten.";
        }
    }

