package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.Store;

public interface StoreRepo extends JpaRepository<Store, Integer>{

	Store findByName(String name);

}
