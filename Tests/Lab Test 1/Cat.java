class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    
    @Override
    void introduceYourself() {
        System.out.printf("Meow. I am a cat. My name is %s.\n", name);
    }
}