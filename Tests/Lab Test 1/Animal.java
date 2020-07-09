class Animal {
    protected String name; // only this class & subclass can access
    
    public Animal(String name) {
        this.name = name;
    }
    
    void introduceYourself() {
        System.out.println("Morr. I am a cat.");
    }
}