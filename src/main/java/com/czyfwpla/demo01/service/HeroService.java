package com.czyfwpla.demo01.service;

import com.czyfwpla.demo01.model.Hero;
import com.czyfwpla.demo01.util.Page;

import java.util.List;

/**
 * @Auther: Chandler
 * @Date: 2018/5/13 21:56
 * @Description:
 */
public interface HeroService {
    void addHero(Hero hero);
    Hero selectHero(String name);
    List<Hero> selectAllHero();
    void deleteHeroByName(String name);
    void updateHero(Hero hero);
    Hero selectHeroById(String id);
    Page<Hero>selcetPageHero(Integer currentPage,int pageSize);
}
