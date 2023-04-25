package com.geovannycode;


public interface AppUserService {
    AppUserEntity save(AppUserEntity appUserEntity);
    Iterable<AppUserEntity> readAll();
}
