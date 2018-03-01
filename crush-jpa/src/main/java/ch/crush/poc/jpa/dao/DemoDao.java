package ch.crush.poc.jpa.dao;

import ch.crush.poc.jpa.entity.Demo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface DemoDao extends CrudRepository<Demo, Integer> {
    List<Demo> findByLastname(String lastname);
}
