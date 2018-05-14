package com.czyfwpla.demo01.mapper;

import com.czyfwpla.demo01.model.Hero;
import com.czyfwpla.demo01.util.Page;

import javax.validation.constraints.Null;
import java.util.List;

/**
 * @Auther: Chandler
 * @Date: 2018/5/13 03:14
 * @Description:
 */
public interface HeroMapper {

    void addHero(Hero hero);
    Hero selectHero(String name);
    List<Hero> selectAllHero();
    void deleteHeroById(String id);
    void updateHero(Hero hero);
    Hero selectHeroById(String id);
    List<Hero>selectSomeHero(Page<Hero>page);
    int countHero();
}
