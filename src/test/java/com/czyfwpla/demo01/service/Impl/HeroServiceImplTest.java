package com.czyfwpla.demo01.service.Impl;

import com.czyfwpla.demo01.model.Hero;
import com.czyfwpla.demo01.service.HeroService;
import com.czyfwpla.demo01.util.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Auther: Chandler
 * @Date: 2018/5/13 22:02
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class HeroServiceImplTest {

    @Autowired
    private HeroService heroService;

    @Test
    public void selectAllHero() {
        Page<Hero>heroPage= heroService.selcetPageHero(2,6);
    }
}