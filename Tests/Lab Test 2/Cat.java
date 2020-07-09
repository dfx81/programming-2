class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    
    @Override
    public void introduceYourself() {
        System.out.printf("Meow. I am a cat. My name is %s\n", this.name);
        System.out.printf("and I am %d years old.\n", Cat.age);
    }
}