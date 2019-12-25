package com.pzhu.novel.service.impl;

import com.pzhu.novel.mbg.mapper.CarouselMapper;
import com.pzhu.novel.mbg.model.Carousel;
import com.pzhu.novel.service.CarouselService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarouselServiceImpl implements CarouselService {

    private final CarouselMapper carouselMapper;

    public CarouselServiceImpl(CarouselMapper carouselMapper) {
        this.carouselMapper = carouselMapper;
    }

    @Override
    public List<Carousel> queryCarousel() {
        // 查询全部
        return carouselMapper.selectByExample(null);
    }

    @Override
    public Carousel getCarouselById(Long carouselId) {
        return carouselMapper.selectByPrimaryKey(carouselId);
    }

    @Override
    public void update(Carousel carousel) {
        carouselMapper.updateByPrimaryKeySelective(carousel);
    }

    @Override
    public void delete(Long carouselId) {
        carouselMapper.deleteByPrimaryKey(carouselId);
    }

    @Override
    public void save(Carousel carousel) {
        carouselMapper.insertSelective(carousel);
    }
}
