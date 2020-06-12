package cn.example.domain;

/*
* 封装Address表数据的JavaBean
* */
public class Address {
    private int id;
    private int user_id;
    private String name;
    private String phone;
    private String zip_code;
    private String state;
    private String city;
    private String district;
    private String address;
    private int default_address;
    private String label;

    public Address() {
    }

    public Address(int id, int user_id, String name, String phone, String zip_code, String state, String city, String district, String address, int default_address, String label) {
        this.id = id;
        this.user_id = user_id;
        this.name = name;
        this.phone = phone;
        this.zip_code = zip_code;
        this.state = state;
        this.city = city;
        this.district = district;
        this.address = address;
        this.default_address = default_address;
        this.label = label;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDefault_address() {
        return default_address;
    }

    public void setDefault_address(int default_address) {
        this.default_address = default_address;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", zip_code='" + zip_code + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", address='" + address + '\'' +
                ", default_address=" + default_address +
                ", label='" + label + '\'' +
                '}';
    }
}
