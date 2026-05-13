public class Main {
    public static void main(String[] args) {
        System.out.println("--- Тестування Sprint Planning ---");

        // Створюємо UserStory
        UserStory loginStory = new UserStory(1, "Реєстрація", 10);
        UserStory profileStory = new UserStory(2, "Профіль", 5, loginStory); // Залежить від Реєстрації

        System.out.println(loginStory.toString());
        System.out.println(profileStory.toString());

        // Пробуємо завершити profileStory (не вийде, бо loginStory ще не завершена)
        profileStory.complete();
        System.out.println("Профіль завершено? " + profileStory.isCompleted()); // false

        // Завершуємо loginStory, а потім profileStory
        loginStory.complete();
        profileStory.complete();
        System.out.println("Профіль завершено? " + profileStory.isCompleted()); // true

        // Створюємо баг (тільки для завершеної loginStory)
        Bug bug = Bug.createBug(3, "Кнопка не працює", 2, loginStory);
        System.out.println(bug.toString());

        // Створюємо спринт
        Sprint sprint = new Sprint(20, 5);

        // Створюємо нову Story для спринта
        UserStory searchStory = new UserStory(4, "Пошук", 15);
        boolean isAdded = sprint.addUserStory(searchStory);
        System.out.println("Пошук додано у спринт: " + isAdded); // true

        System.out.println("Сумарний час спринту: " + sprint.getTotalEstimate());
    }
}