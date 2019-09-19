package com.lyft.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.lyft.domain.Driver;


@RepositoryRestResource(path="drivers",collectionResourceRel = "drivers")
public interface DriverRepo extends JpaRepository<Driver,Long> {

}
