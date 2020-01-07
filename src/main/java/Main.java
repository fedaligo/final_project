
public class Main  {

    public static void main(String[] args) {
        String text = "Доброго. Помогите, пожалуйста, с программой. Необходимо подсчитать .";
        int before = text.length();
        int after = text.replaceAll("[,.]", "").length();
        System.out.println("Количество знаков : " + (before - after));
    }
}
