package org.nader.io.repositories;

import java.util.Date;
import org.nader.io.entities.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Integer> {

	Item findByDateAndLatAndReg1(Date date, String lat, String reg1);
}
