class Lab1Stage1 {
    public static void main(String[] args) {
        Animal[] allAnimals;
        int i;
        
        allAnimals = new Animal[3];
        
        allAnimals[0] = new Cat("Kurre");
        allAnimals[1] = new Dog("Vilma");
        allAnimals[2] = new Cat("Bamse");
        
        i = 0;
        
        while (i < allAnimals.length) {
            allAnimals[i].introduceYourself();
            i = i + 1;
        }
        
        /*for (int i = 0; i != allAnimals.length; i++) {
            allAnimals[i].introduceYourself();
        }*/
    }
}