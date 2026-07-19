package Day34;

enum OrderStatus {
    PENDING, CONFIRMED, PROCESSING, SHIPPED, DELIVERED, CANCELLED;

    boolean isFinal() {
        return this == DELIVERED || this == CANCELLED;
    }
    String getDescription() {
        switch (this) {
            case PENDING: return "Awaiting confirmation";
            case CONFIRMED: return "Confirmed";
            case PROCESSING: return "Processing";
            case SHIPPED: return "Shipped";
            case DELIVERED: return "Delivered";
            case CANCELLED: return "Cancelled";
            default: return "Unknown status";
        }
    }
}
public class OrderDescription {

    static void processOrder(String orderId, OrderStatus status) {
        System.out.println("Order " + orderId + " [" + status + "]: ");
        System.out.println(status.getDescription() + ". ");

        if (status.isFinal()) {
            System.out.println("Final state - no further action.");
            return;
        }
        switch (status) {
            case PENDING:
                System.out.println("Next: Confirm order. Can cancel: YES");
                break;
                case CONFIRMED:
                    System.out.println("Next: Start processing. can cancel: YES");
                    break;
                    case PROCESSING:
                        System.out.println("Next: Ship order, Can cancel: limited");
                        break;
                        case SHIPPED:
                            System.out.println("Next: Deliver order, Can cancel: NO");
                            break;
                            default:
                                System.out.println("Unknown status");
        }
    }

    public static void main(String[] args) {
        processOrder("ORD-001", OrderStatus.PENDING);
        processOrder("ORD-002", OrderStatus.CONFIRMED);
        processOrder("ORD-003", OrderStatus.SHIPPED);
        processOrder("ORD-004", OrderStatus.DELIVERED);
        processOrder("ORD-005", OrderStatus.CANCELLED);

        // Enum in array/loop
        System.out.println("\n=== All statuses ===");
        for (OrderStatus s : OrderStatus.values()) {
            System.out.printf("%-12s final=%-5b desc=%s%n",
                    s, s.isFinal(), s.getDescription());

        }
    }}
