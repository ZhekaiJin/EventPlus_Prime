package mars.service;

import java.util.List;

//generic
public interface GenericService<T> {
	
	List<T> search(double latitude, double longitude, String term);
	
}
