package com.czyfwpla.demo01.mapper;

import com.czyfwpla.demo01.model.Hero;

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
    void deleteHeroByName(String name);
    void updateHero(Hero hero);
    Hero selectHeroById(String name);
}
