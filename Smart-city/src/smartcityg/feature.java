package smartcityg;
public abstract class feature {
    static int n;
     int id;
    String name;
    String description;
    String category;
    String address;
    String email;
    String contact;

    public feature( String name, String description, String category, String address, String email, String contact) {
        this.id = n;
        this.name = name;
        this.description = description;
        this.category = category;
        this.address = address;
        this.email = email;
        this.contact = contact;
        n++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    
}
