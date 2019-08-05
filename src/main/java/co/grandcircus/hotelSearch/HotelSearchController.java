package co.grandcircus.hotelSearch;

import java.util.List;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.hotelSearch.dao.HotelRepository;
import co.grandcircus.hotelSearch.entities.Hotel;

@Controller
public class HotelSearchController {
	
	@Autowired
	HotelRepository dao;
	
	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");
	}
	
	
	
	@PostMapping("/")
	public ModelAndView list(
			@RequestParam("city") String city,
			@RequestParam("maxPrice") int maxPrice) {
		String cityName = city.substring(0, 1).toUpperCase() + city.substring(1);
		System.out.println("City: " + cityName);
		List<Hotel> hotelList = dao.findAllByCityOrderByPricePerNightAsc(city);
		Predicate<Hotel> condition = hotel -> hotel.getPricePerNight() > maxPrice;
		hotelList.removeIf(condition);
		return new ModelAndView("list", "hotelList", hotelList);
	}

}
