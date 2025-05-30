public class C01 {
    public static void main(String[] args) {
        int randomSayi = (int) (Math.random()*80);
        System.out.println("randomSayi = " + randomSayi);
        System.out.println(randomSayi %2 == 0 ? "cift" : "tek");
    }
}