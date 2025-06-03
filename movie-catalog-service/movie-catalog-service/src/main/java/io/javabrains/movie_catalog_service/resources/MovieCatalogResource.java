package io.javabrains.movie_catalog_service.resources;

import io.javabrains.movie_catalog_service.models.CatalogItem;
import io.javabrains.movie_catalog_service.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource
{

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatelog(@PathVariable("userId") String userId){

        List<Rating> ratings = Arrays.asList(
             new Rating("1234", 4),
             new Rating("5678",3)
        );

       return ratings.stream().map(rating -> new CatalogItem("Transformers", "test", 4))
                .collect(Collectors.toList());

//        return Collections.singletonList(
//                new CatalogItem("Transformers", "test", 4)
//        );
    }
}
