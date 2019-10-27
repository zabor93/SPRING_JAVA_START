package pl.javastart.spring_jpa_otm.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.javastart.spring_jpa_otm.model.Order;

@Repository
@Transactional
public class OrderDao extends GenericDao<Order, Long> {
}
