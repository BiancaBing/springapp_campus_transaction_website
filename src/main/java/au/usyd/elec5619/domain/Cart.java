package au.usyd.elec5619.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cart")
public class Cart implements Serializable {

	@Id
	@GeneratedValue
	@Column(name="cart_id")
	private int cart_id;
	
	@Column(name="description")
    private String description;
	
	@Column(name="name")
    private String name;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="price")
    private Double price;
	
	@Column(name="seller")
	private String seller;
    
    public int getId() {
		return cart_id;
	}

	public void setId(int cart_id) {
		this.cart_id = cart_id;
	}

	public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Double getPrice() {
        return price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    
    public String getSeller() {
        return seller;
    }
    
    public void setSeller(String seller) {
        this.seller = seller;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
     
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Description: " + description + ";");
        buffer.append("Quantity: " + quantity);
        buffer.append("Price: " + price);
        buffer.append("Seller: " + seller);
        buffer.append("Name: " + name);
        return buffer.toString();
    }
}
