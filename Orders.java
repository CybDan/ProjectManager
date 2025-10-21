public class Orders {
    String projectname;
    String address;
    String tlf;

    Orders(String projectname, String address, String tlf) {
        this.projectname = projectname;
        this.address = address;
        this.tlf = tlf;
    }

    public String toString() {
        return projectname + ":" + address + ":" + tlf;
    }
}
