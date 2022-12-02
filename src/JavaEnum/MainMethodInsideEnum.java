package JavaEnum;

public class MainMethodInsideEnum {
    public enum Season {
        WINTER, SPRING, SUMMER, FALL;

        public static void main(String[] args) {
            EnumApp.Season s = EnumApp.Season.WINTER;
            System.out.println(s);
        }
    }
}
