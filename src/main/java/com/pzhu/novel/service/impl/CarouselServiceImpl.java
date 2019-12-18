package com.pzhu.novel.service.impl;

import com.pzhu.novel.mbg.mapper.CarouselMapper;
import com.pzhu.novel.mbg.model.Carousel;
import com.pzhu.novel.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarouselServiceImpl implements CarouselService {

    @Autowired
    private CarouselMapper carouselMapper;

    @Override
    public List<Carousel> queryCarousel() {
        // 查询全部
        return carouselMapper.selectByExample(null);
    }

    @Override
    public Carousel getCarouselById(Integer carouselId) {
        return carouselMapper.selectByPrimaryKey(carouselId);
    }

    @Override
    public void update(Carousel carousel) {
        carouselMapper.updateByPrimaryKeySelective(carousel);
    }

    @Override
    public void delete(Integer carouselId) {
        carouselMapper.deleteByPrimaryKey(carouselId);
    }

    @Override
    public void save(Carousel carousel) {
        carouselMapper.insertSelective(carousel);
    }
}
