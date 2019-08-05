package co.grandcircus.hotelSearch.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hotelListing")
public class Hotel {

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="hotelId")
	private Long Id;
	@Column(name="hotelName")
	private String name;
	private String city;
	private Double rating;
	private Integer pricePerNight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	public Integer getPricePerNight() {
		return pricePerNight;
	}
	public void setPricePerNight(Integer pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	public Long getId() {
		return Id;
	}
	@Override
	public String toString() {
		return "Hotel [Id=" + Id + ", name=" + name + ", city=" + city + ", rating=" + rating + ", pricePerNight="
				+ pricePerNight + "]";
	}
	
	

}
