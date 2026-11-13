package Batch10.AssignmentNov1st.question7;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("email notification sent with message: " + message);
    }
}
