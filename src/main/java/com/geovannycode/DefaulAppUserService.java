package com.geovannycode;

import io.micronaut.context.annotation.Primary;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;


@Primary
@Singleton
public class DefaulAppUserService implements AppUserService{

    @Inject
    private AppUserRepository appUserRepository;

    @Override
    public AppUserEntity save(AppUserEntity appUserEntity) {
        return appUserRepository.save(appUserEntity);
    }

    @Override
    public Iterable<AppUserEntity> readAll() {
        return appUserRepository.findAll();
    }
}
