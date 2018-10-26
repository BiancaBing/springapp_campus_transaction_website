package au.usyd.elec5619.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Sales")
public class Sales implements Serializable{


	@Id
	@GeneratedValue
	@Column(name="sales_id")
	private int sales_id;
	
	@Column(name="description")
    private String description;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="price")
    private Double price;
	
	@Column(name="status")
	private String status;
	
	@Column(name="review")
	private String review;
	
	@Column(name="location")
	private String location;
	
	@Column(name="time")
	private String time;
	
	@Column(name="contact")
	private String contact;
	
    public int getId() {
		return sales_id;
	}

	public void setId(int sales_id) {
		this.sales_id = sales_id;
	}

	public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public Double getPrice() {
        return price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getReview() {
        return review;
    }
    
    public void setReview(String review) {
        this.review = review;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
     
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getTime() {
        return time;
    }
    
    public void setTime(String time) {
        this.time = time;
    }
    
    public String getContact() {
        return contact;
    }
    
    public void setContact(String contact) {
        this.contact = contact;
    }
    
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Description: " + description + ";");
        buffer.append("Quantity: " + quantity);
        buffer.append("Price: " + price);
        buffer.append("Status: " + status);
        buffer.append("Review: " + review);
        buffer.append("Location: " + location);
        buffer.append("Time: " + time);
        buffer.append("Contact: " + contact);
        return buffer.toString();
    }
}
