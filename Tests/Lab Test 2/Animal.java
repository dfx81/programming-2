class Animal {
    protected String name; // only this class & subclass can access
    public static int age;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public void introduceYourself() {
        System.out.println("Morr. I am a cat.");
        System.out.printf("I am %d years old.\n", age);
    }
}