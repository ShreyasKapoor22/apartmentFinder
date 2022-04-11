package ApartmentFinder.Model;


import javax.persistence.*;

@Entity
@Table(name = "Apartment")
public class Apartment {

    @Id
    @Column(name = "apartmentId")
    @GeneratedValue
    private int apartmentId;

    @Column(name = "name")
    private String name;

    @Column(name = "rent")
    private String rent;

    @Column(name = "bedroom")
    private String bedroom;

    @Column(name = "bathroom")
    private String bathroom;

    @Column(name = "address")
    private String address;

    public int getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(int apartmentId) {
        this.apartmentId = apartmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRent() {
        return rent;
    }

    public void setRent(String rent) {
        this.rent = rent;
    }

    public String getBedroom() {
        return bedroom;
    }

    public void setBedroom(String bedroom) {
        this.bedroom = bedroom;
    }

    public String getBathroom() {
        return bathroom;
    }

    public void setBathroom(String bathroom) {
        this.bathroom = bathroom;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Column(name = "area")
    private String area;

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Column(name = "images")
    private String images;




}
