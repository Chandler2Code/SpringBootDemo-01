package com.czyfwpla.demo01.service.Impl;

import com.czyfwpla.demo01.mapper.HeroMapper;
import com.czyfwpla.demo01.model.Hero;
import com.czyfwpla.demo01.service.HeroService;
import com.czyfwpla.demo01.util.Page;
import com.czyfwpla.demo01.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Chandler
 * @Date: 2018/5/13 21:57
 * @Description:
 */
@Service
public class HeroServiceImpl implements HeroService {
    @Autowired
    private HeroMapper heroMapper;

    @Override
    public void addHero(Hero hero) {
        heroMapper.addHero(hero);
    }

    @Override
    public Hero selectHero(String name) {
        return heroMapper.selectHero(name);
    }

    @Override
    public List<Hero> selectAllHero() {
        return heroMapper.selectAllHero();
    }

    @Override
    public void deleteHeroById(String id) {
        heroMapper.deleteHeroById(id);
    }

    @Override
    public void updateHero(Hero hero) {
        heroMapper.updateHero(hero);
    }

    @Override
    public Hero selectHeroById(String id) {
        return heroMapper.selectHeroById(id);
    }



    @Override
    public Page<Hero> selcetPageHero(Integer currentPage,int pageSize) {

        //构造Page

        //查询出总数
        int heroCount = heroMapper.countHero();
        //计算分页
        Page<Hero>heroPage = (Page)PageUtil.queryPage(currentPage,heroCount,pageSize);

        List<Hero>heroList=heroMapper.selectSomeHero(heroPage);
        heroPage.setList(heroList);
        return heroPage;
    }
}