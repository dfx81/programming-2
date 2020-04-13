class CallChargeCalculator
{
    double charge;

    public double computeCharge(int duration, int category)
    {
        double rate;

        if (category == 1) rate = 0.07;
        else if (category == 2) rate = 0.12;
        else rate = 0.05;

        charge = rate * duration;

        return charge;
    }
}