package com.bmi;

public class BmiCalculator {package Com.soludo;

import org.jetbrains.annotations.Contract;

    class BMICalculator {
        public static void main(String[] args) {
            Cal obj = new Cal();
            Cal.calculateBMI();
        }

        static class Cal {
            @Contract(pure = true)
            public static void calculateBMI(double weight, double height) {
                double bmi = weight / (height * height);

                if (bmi < 18.5) {
                } else if (bmi < 25) {
                } else if (bmi < 30) {
                } else {
                }
            }

            public static void calculateBMI() {
            }
        }

        // Assuming you are using JUnit for testing
        class BMICalculatorTest {
            public void whenBMIIsGreaterThanThirty_thenObese() {
                double weight = 50;
                double height = 1.524;
                String actual = BMICalculator.calculateBMI(weight, height);
                String expected = "Obese";

                assertThat(actual).isEqualTo(expected);
            }
        }
    }


}
