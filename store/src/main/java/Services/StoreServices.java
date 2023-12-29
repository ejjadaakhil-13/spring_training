package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.Store;
import repo.StoreRepo;

@Service
public class StoreServices {

	 @Autowired
	    private StoreRepo repo;

	    public Store saveitem(Store store) {
	    	
	        return repo.save(store);
	    }

	    public List<Store> saveitems(List<Store> store) {
	        
	    	return repo.saveAll(store);
	    }

	    public List<Store> getItems() {
	       
	    	return repo.findAll();
	    }

	    public Store getItemsById(int id) {
	        
	    	return repo.findById(id).orElse(null);
	    }


	    public String deleteItems(int id) {
	       
	    	repo.deleteById(id);
	        
	    	return "item removed " + id;
	    }

	    public Store updateItems(Store store) {
	        
	    	Store oldItem = repo.findById(store.getId()).orElse(null);
	        
	    	oldItem .setName(store.getName());
	        
	    	oldItem .setItems(store.getItems());
	        
	    	return repo.save(oldItem );
	    }


		public Store getByName(String name) {
			
			return repo.findByName(name);
		}

}
