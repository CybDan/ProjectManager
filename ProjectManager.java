class ProjectManager {
    static LinkedList<Orders> completedOrders;
    static LinkedList<Orders> currentOrders;

    public static void main(String[] args) {
        LinkedList<Orders> oListe = new LinkedList<Orders>();
        oListe.setData(new Orders("New Project Idea", "Worldsroad 3", "+4711223344"));
        System.out.printf("%s\n", oListe.getData());
    }

    private static void addNewOrder(String projectname, String address, String tlf) {
            // This functions purpose Is to add orders. The list Is a FIFO list, so that the longest orders
            // Are at the back of the list
        if (currentOrders == null) {
            currentOrders.setData(new Orders(projectname, address, tlf));
        }
        else {
                // Want to add this entry last
            LinkedList<Orders> tmp = currentOrders;
            while ( tmp.getData() != null) {
                tmp = tmp.getNext();
            }
        }
    }
}
