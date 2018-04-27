/**
 * Created by pillutja on 4/13/2018.
 */
public class Address {
    int houseNo;
    String streetName;

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    Address(int houseNo,String streetName){
        this.houseNo = houseNo;
        this.streetName = streetName;
    }
}
