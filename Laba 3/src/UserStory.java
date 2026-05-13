import java.util.Arrays;

public class UserStory extends Ticket {
    private UserStory[] dependencies;

    // Конструктор викликає конструктор батька через super()
    public UserStory(int id, String name, int estimate, UserStory... dependsOn) {
        super(id, name, estimate);
        if (dependsOn != null) {
            // Створюємо захищену копію масиву залежностей
            this.dependencies = Arrays.copyOf(dependsOn, dependsOn.length);
        } else {
            this.dependencies = new UserStory[0];
        }
    }

    // Перевизначення методу (Поліморфізм)
    @Override
    public void complete() {
        boolean allCompleted = true;
        for (UserStory dependency : dependencies) {
            if (!dependency.isCompleted()) {
                allCompleted = false;
                break;
            }
        }
        // Завершуємо тільки якщо всі залежності завершені
        if (allCompleted) {
            super.complete();
        }
    }

    public UserStory[] getDependencies() {
        // Повертаємо захищену копію (щоб ніхто ззовні не міг змінити масив)
        return Arrays.copyOf(dependencies, dependencies.length);
    }

    @Override
    public String toString() {
        return "[US " + getId() + "] " + getName();
    }
}