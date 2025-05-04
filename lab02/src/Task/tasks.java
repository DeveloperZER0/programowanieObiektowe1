package Task;

import java.util.Arrays;

public class tasks {
    public void quadratic(float a, float b, float c) {
        float delta = (b * b) - (4 * a * c);
        float sqrt = (float) Math.sqrt(delta);
        if (delta > 0) {
            float x1 = (-b + sqrt) / (2 * a);
            float x2 = (-b - sqrt) / (2 * a);
            System.out.printf("Delta jest większa od zera | x1: %.2f | x2: %.2f\n", x1, x2);
        } else if (delta == 0) {
            float x0 = (-b) / (2 * a);
            System.out.printf("Delta jest równa zero | x0: %.2f\n ", x0);
        } else {
            System.out.printf("Delta jest mniejsza od zera | brak rozwiązań\n");
        }

    }
    public float func_a(float x) {
        if (x > 0) {
            return 2*x;
        } else if (x < 0) {
            return -3 * x;
        }
        return 0;
    }
    public float func_b(float x) {
        if (x >= 1) {
            return x*x;
        }
        return x;
    }
    public float func_c(float x) {
        if (x > 2) {
            return 2+x;
        } else if (x < 2) {
            return x-4;
        }
        return 8f;
    }
    public void sort_num(float[] num) {
        float temp = 0;
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
    public String scenario1(boolean rain, boolean bus) {
        if (!rain && bus) {
            return "Dostaniesz się na uczelnie, Miłego dnia i pięknej pogody";
        } else if (rain && !bus) {
            return "Nie dostaniesz się na uczelnie";
        }
        return "Weź parasol, dostaniesz się na uczelnie";
    }
    public String scenario2(boolean discount, boolean bonus) {
        if (!discount || bonus) {
            return "Możesz kupić samochód!, Zniżki na samochód nie ma";
        } else if (!discount || !bonus) {
            return "Zakup samochodu trzeba odłożyć na później, Zniżki na samochód nie ma";
        }
        return "Możesz kupić samochód!";
    }
    public float calculator(int type, float a, float b) {

        switch (type) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            case 4:
                return a / b;
            case 5:
                return a % b;
        }
        return 0;
    }
}
