package com.geovannycode;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface AppUserRepository extends CrudRepository<AppUserEntity, Long> {

}
