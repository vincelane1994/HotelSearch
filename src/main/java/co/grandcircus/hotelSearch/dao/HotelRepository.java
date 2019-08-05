package co.grandcircus.hotelSearch.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.hotelSearch.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long>{
	List<Hotel> findAllByCity(String city);
	public List<Hotel> findAllByCityOrderByPricePerNightAsc(String city);
}
