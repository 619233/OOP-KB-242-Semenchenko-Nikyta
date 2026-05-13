import java.util.Arrays;

public class Sprint {
    private int capacity; // Максимальний сумарний час (estimate)
    private int ticketsLimit; // Максимальна кількість тікетів
    private Ticket[] tickets; // Масив для зберігання тікетів
    private int ticketCount; // Скільки зараз тікетів у спринті

    public Sprint(int capacity, int ticketsLimit) {
        this.capacity = capacity;
        this.ticketsLimit = ticketsLimit;
        this.tickets = new Ticket[ticketsLimit];
        this.ticketCount = 0;
    }

    public boolean addUserStory(UserStory userStory) {
        return addTicket(userStory);
    }

    public boolean addBug(Bug bugReport) {
        return addTicket(bugReport);
    }

    // Приватний метод з усіма перевірками, щоб не писати двічі одне й те саме
    private boolean addTicket(Ticket ticket) {
        if (ticket == null || ticket.isCompleted()) {
            return false; // Null або вже завершено
        }
        if (ticketCount >= ticketsLimit) {
            return false; // Переповнено за кількістю
        }
        if (getTotalEstimate() + ticket.getEstimate() > capacity) {
            return false; // Переповнено за часом
        }

        // Додаємо тікет
        tickets[ticketCount] = ticket;
        ticketCount++;
        return true;
    }

    public Ticket[] getTickets() {
        // Повертаємо масив рівно такого розміру, скільки в ньому зараз тікетів
        return Arrays.copyOf(tickets, ticketCount);
    }

    public int getTotalEstimate() {
        int total = 0;
        for (int i = 0; i < ticketCount; i++) {
            total += tickets[i].getEstimate();
        }
        return total;
    }
}