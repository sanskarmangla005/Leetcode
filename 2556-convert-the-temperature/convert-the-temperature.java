class Solution {
    public double[] convertTemperature(double celsius) {
        //// Celsius + 273.15 = Kelvin
// Celsius * 1.80 + 32 = Fahrenheit
// Dono values ko array me return karna hai
// double use karte hain kyunki answer decimal me aa sakta hai

double kelvin = celsius + 273.15;
double fahrenheit = celsius * 1.80 +32.00;
return new double[] {kelvin, fahrenheit};
    }
}