//dsss
public class Letter {
    private String address;
    public Letter (String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public Boolean checkAddress(Letter letter) {
        return (address != null && !address.equals(""));
    }
    public Boolean isStamped(Letter) {
        return (isStamped());
    }

}