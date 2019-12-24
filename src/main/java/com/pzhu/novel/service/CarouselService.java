package com.pzhu.novel.service;

import com.pzhu.novel.mbg.model.Carousel;

import java.util.List;

public interface CarouselService {
    List<Carousel> queryCarousel();

    Carousel getCarouselById(Long carouselId);

    void update(Carousel carousel);

    void delete(Long carouselId);

    void save(Carousel carousel);
}
