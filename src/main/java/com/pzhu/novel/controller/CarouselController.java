package com.pzhu.novel.controller;

import com.pzhu.novel.common.api.CommonResult;
import com.pzhu.novel.mbg.model.Carousel;
import com.pzhu.novel.service.CarouselService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carousel")
public class CarouselController {

    private final CarouselService carouselService;

    public CarouselController(CarouselService carouselService) {
        this.carouselService = carouselService;
    }

    @GetMapping
    public CommonResult queryCarousel() {
        List<Carousel> carouselList = carouselService.queryCarousel();
        return CommonResult.success(carouselList);
    }

    @GetMapping("/{carouselId}")
    public CommonResult getCarouselById(@PathVariable("carouselId") Long carouselId) {
        Carousel carousel = carouselService.getCarouselById(carouselId);
        return CommonResult.success(carousel);
    }

    @PutMapping
    public CommonResult updateCarousel(@RequestBody Carousel carousel) {
        carouselService.update(carousel);
        return CommonResult.success(carousel);
    }

    @DeleteMapping("/{carouselId}")
    public CommonResult delete(@PathVariable("carouselId") Long carouselId) {
        carouselService.delete(carouselId);
        return CommonResult.success(carouselId);
    }

    @PostMapping
    public CommonResult save(@RequestBody Carousel carousel) {
        carouselService.save(carousel);
        return CommonResult.success(carousel);
    }
}
