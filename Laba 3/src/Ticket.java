public class Ticket {
    private int id;
    private String name;
    private int estimate;
    private boolean isCompleted;

    // Конструктор
    public Ticket(int id, String name, int estimate) {
        this.id = id;
        this.name = name;
        this.estimate = estimate;
        this.isCompleted = false; // Щойно створений тікет завжди незавершений
    }

    // Геттери (Інкапсуляція)
    public int getId() { return id; }
    public String getName() { return name; }
    public int getEstimate() { return estimate; }
    public boolean isCompleted() { return isCompleted; }

    public void complete() {
        this.isCompleted = true;
    }
}