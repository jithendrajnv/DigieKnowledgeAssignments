package Batch10.AssignmentNov1st.question5;

public class PaymentTest {
    public static void main(String[] args) {

        Payment cardPayment = new CardPayment();
        Payment upiPayment = new UPIPayment();
        upiPayment.pay(500);
        cardPayment.pay(5000);
    }
}
