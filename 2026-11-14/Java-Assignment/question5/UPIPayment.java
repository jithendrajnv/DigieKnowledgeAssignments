package Batch10.AssignmentNov1st.question5;

public class UPIPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid via UPI "+amount);
    }

}
