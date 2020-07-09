class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    
    @Override
    public void introduceYourself() {
        System.out.printf("Woof. I am a dog. My name is %s\n", this.name);
        System.out.printf("and I am %d years old.\n", Dog.age);
    }
}