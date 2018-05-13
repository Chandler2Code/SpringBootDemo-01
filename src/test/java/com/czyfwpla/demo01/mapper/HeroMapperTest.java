package com.czyfwpla.demo01.mapper;

import com.czyfwpla.demo01.model.Hero;
import com.czyfwpla.demo01.util.NumberUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: Chandler
 * @Date: 2018/5/13 03:27
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class HeroMapperTest {

    @Autowired
    private HeroMapper heroMapper;

  @Test
    public void addHore() {
        Hero hero = new Hero();
        hero.setId(NumberUtil.genUniqueKeyByTitle());
        hero.setName("李白");
        hero.setSex("男");
        hero.setViability(88);
        heroMapper.addHero(hero);
    }
  //  @Test
    public void selectHero() {

        Hero hero = heroMapper.selectHero("牛魔王");
        Assert.assertNotNull(hero);
        Assert.assertEquals(1,1);
    }
    //@Test
    public void selectAllUser(){
        List<Hero>heroList = heroMapper.selectAllHero();
        Assert.assertNotNull(heroList);
    }
   // @Test
    public void deleteHeroByName(){
        heroMapper.deleteHeroByName("李白");
    }
   // @Test
    public void updateHero(){
      Hero hero = heroMapper.selectHero("牛魔王");
       hero.setViability(100);
       heroMapper.updateHero(hero);
    }
}