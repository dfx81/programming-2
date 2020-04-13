// Defines a single triangle

class Triangle
{
    // Properties
    private double height;
    private double base;
    
    // Setters for the different properties of Triangle class
    public void setHeight(double len) {height = len;}
    public void setBase(double b) {base = b;}
    public void set(double len, double b)
    {
       height = len;
       base = b;
    }

    // Getters for the different properties of Triangle class
    public double getHeight() {return height;}
    public double getBase() {return base;}
    public double getArea() {return 0.5 * height * base;}
}