package com.geovannycode;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

import java.util.List;

@Controller("/users")
public class AppUserController {

    @Inject
    private AppUserService appUserService;

    @Get
    public Iterable<AppUserEntity> list(){
        return appUserService.readAll();
    }

   @Post
    public HttpResponse<AppUserEntity> save(AppUserEntity appUserEntity) {
        AppUserEntity entity = appUserService.save(appUserEntity);
        return HttpResponse
                .created(entity);
    }
}
