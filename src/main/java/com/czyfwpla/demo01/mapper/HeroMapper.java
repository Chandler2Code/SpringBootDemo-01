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
    //一、增加、删除和修改
    void deleteHeroById(String id);
    void updateHero(Hero hero);
    void addHero(Hero hero);

    //二、查询
    //1.查询一条记录
    Hero selectHeroById(String id);
    Hero selectHero(String name);
    //2.查询所有记录并分页
    List<Hero>selectPageHero(Page<Hero>page);
    List<Hero> selectHeroCount();
    //3.模糊查询并分页
    List<Hero>selectPageHeroByName(Page<Hero>page);
    List<Hero> selectSomeHeroByNameCount(String name);
}
