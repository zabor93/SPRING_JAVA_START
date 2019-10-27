package pl.javastart.spring_jpa_otm.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.javastart.spring_jpa_otm.model.Client;

@Repository
@Transactional
public class ClientDao extends GenericDao<Client, Long> {

    @Override
    public Client get(Long key) {
        Client client = super.get(key);
        //primitive solution for lazy loading
        client.getOrders().size();
        return client;
    }
}