/**
 * Created by pillutja on 4/11/2018.
 */
public class Student {
    String name;
    int id;
    Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void displayInfo(){
        System.out.println("Student Name is "+name +" Id:"+id +" Address: House no"+address.houseNo +",Street:"+address.streetName);
    }
    Student(int id){
        this.id = id;
    }
    Student(String name){
        this.name = name;
    }
    Student(String name,int id){
        this.name = name;
        this.id = id;
    }
    Student(String name,int id,int id1){
        this.name = name;
        this.id = id;
    }
    Student(int id,String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
