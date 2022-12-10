//  2469. Convert the Temperature
class B2469 {
    public double[] convertTemperature(double celsius) {
        double[] returnConvert = new double[2];
        returnConvert[0] = celsius + 273.15;
        returnConvert[1] = celsius*1.80 + 32.00;
        return  returnConvert;
    }
}