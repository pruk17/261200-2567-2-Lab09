public class OrderProcessor {
    private
        final NotificationService notificationService;
    public
        OrderProcessor(NotificationService notificationService) {
            this.notificationService = notificationService;
        }
        void processOrder(OrderProcessor order) {
            // Process order
            notificationService.notify("Order processed");
        }
}


