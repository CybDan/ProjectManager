class ProjectManager {
    public static void main(String[] args) {
        LinkedList<Orders> oListe = new LinkedList<Orders>();
        oListe.setData(new Orders("New Project Idea", "Worldsroad 3", "+4711223344"));
        System.out.printf("%s\n", oListe.getData());
    }
}



