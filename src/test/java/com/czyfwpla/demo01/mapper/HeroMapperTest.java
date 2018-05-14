package com.czyfwpla.demo01.mapper;

import com.czyfwpla.demo01.model.Hero;
import com.czyfwpla.demo01.util.NumberUtil;
import com.czyfwpla.demo01.util.Page;
import com.czyfwpla.demo01.util.PageUtil;
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
      for (int i=0; i< 30;i++){
          Hero hero = new Hero();
          hero.setId(NumberUtil.genUniqueKeyByTitle());
          hero.setName("李白"+i);
          hero.setSex("男");
          hero.setViability(88+i);
          hero.setAttackCapability(85);
          hero.setDifficultStart(56);
          hero.setSkillEffect(100-i);
          hero.setRecommendations("这个英雄很好，很nice,这个英雄很好，很nice");
          heroMapper.addHero(hero);
      }
    }
    @Test
    public void selectHero() {

        Hero hero = heroMapper.selectHero("牛魔王");
        Assert.assertNotNull(hero);
        Assert.assertEquals(1,1);
    }

    @Test
    public void deleteHeroById(){

      heroMapper.deleteHeroById("201544901026");
    }
    @Test
    public void updateHero(){
      Hero hero = heroMapper.selectHero("牛魔王");
       hero.setViability(100);
       heroMapper.updateHero(hero);
    }
    @Test
    public  void selectHeroById(){
      Hero hero = heroMapper.selectHeroById("201544902039");
    }

    @Test
    public void selectHeroByName(){
      int countHero= heroMapper.selectSomeHeroByNameCount("李白").size();
      Page<Hero>page = (Page)PageUtil.queryPage(1,countHero,6);
      page.setKeyWord_1("李白");
      List<Hero>heroList = heroMapper.selectPageHeroByName(page);
      page.setList(heroList);
    }
}