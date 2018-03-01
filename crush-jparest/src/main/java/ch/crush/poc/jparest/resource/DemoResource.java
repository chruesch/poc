package ch.crush.poc.jparest.resource;

import ch.crush.poc.jparest.entity.Demo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource(path = "demo")
public interface DemoResource extends PagingAndSortingRepository<Demo, Integer> {
    List<Demo> findByLastname(String lastname);
}
