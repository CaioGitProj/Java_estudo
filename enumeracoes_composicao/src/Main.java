import entities.Order;
import java.util.Date;
import entities.enums.OrderStatus;

void main()
{
    Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

    IO.println("\n\n\n");
    IO.println(order);

    OrderStatus os = OrderStatus.valueOf("DELIVERED");
    IO.println(os);
}


