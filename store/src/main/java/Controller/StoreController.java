package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Model.Store;
import Services.StoreServices;

@RestController
public class StoreController {

    @Autowired
    private StoreServices storeService;

    @PostMapping("/addItem")
    public Store addItem(@RequestBody Store store) {
    	
        return storeService.saveitem(store);
        
    }

    @PostMapping("/addItems")
    public List<Store> addItems(@RequestBody List<Store> stores) {
        
    	return storeService.saveitems(stores);
    }

    @GetMapping("/items")
    public List<Store> findAllItems() {
        
    	return storeService.getItems();
    }

    @GetMapping("/itemById/{id}")
    public Store findItemById(@PathVariable int id) {
        
    	return storeService.getItemsById(id);
    }

    @GetMapping("/itemByName/{name}")
    public Store getByName(@PathVariable String name) {
       
    	return storeService.getByName(name);
    }

    @PutMapping("/updateItem")
    public Store updateItem(@RequestBody Store store) {
       
    	return storeService.updateItems(store);
    }

    @DeleteMapping("/deleteItem/{id}")
    public String deleteItem(@PathVariable int id) {
     
    	return storeService.deleteItems(id);
    }
}
