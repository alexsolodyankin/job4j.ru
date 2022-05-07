public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return -1;
    }

    public static void main(String[] args) {
        float inRuble = 140;
        float expectedEuro = 2;
        float outEuro = Converter.rubleToEuro(inRuble);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are 2 euro. Test result : " + passedEuro);

        float expectedDollar = -1;
        float outDollar = Converter.rubleToDollar(inRuble);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("140 rubles are -1 dollar. Test result : " + passedDollar);
    }
}
