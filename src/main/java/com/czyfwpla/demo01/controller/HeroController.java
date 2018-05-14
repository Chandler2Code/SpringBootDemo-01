package com.czyfwpla.demo01.controller;

import com.czyfwpla.demo01.model.Hero;
import com.czyfwpla.demo01.service.HeroService;
import com.czyfwpla.demo01.util.NumberUtil;
import com.czyfwpla.demo01.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


/**
 * @Auther: Chandler
 * @Date: 2018/5/13 22:04
 * @Description:
 */
@Controller
@RequestMapping("/hero")
public class HeroController {


    @Autowired
    private HeroService heroService;

    @GetMapping("/info")
    public ModelAndView heroInfo(@RequestParam(defaultValue = "1",value = "currentPage")Integer currentPage){
        ModelAndView mv = new ModelAndView("info");
        int pageSize = 10;
        Page<Hero>heroPage=heroService.selcetPageHero(currentPage,pageSize);
        mv.addObject("result",heroPage);
        return mv;
    }
    @GetMapping("/delete")
    public ModelAndView deleteHero(@RequestParam("id")String id){
        heroService.deleteHeroById(id);
        return new ModelAndView("redirect:"+"/hero/info?currentPage=1");
    }
    @RequestMapping("/add")
    public ModelAndView addHero(@RequestParam("name")String name,
                                @RequestParam("sex")String sex,
                                @RequestParam("viability") Integer viability,
                                @RequestParam("skillEffect") Integer skillEffect,
                                @RequestParam("attackCapability") Integer attackCapability,
                                @RequestParam("difficultStart") Integer difficultStart,
                                @RequestParam("recommendations")String recommendations){

        Hero hero = new Hero();
        hero.setId(NumberUtil.genUniqueKeyByTitle());
        hero.setName(name);
        hero.setSex(sex);
        hero.setViability(viability);
        hero.setSkillEffect(skillEffect);
        hero.setAttackCapability(attackCapability);
        hero.setDifficultStart(difficultStart);
        hero.setRecommendations(recommendations);
        heroService.addHero(hero);
        return new ModelAndView("redirect:"+"/hero/info?currentPage=1");
    }
    @GetMapping("/update")
    public ModelAndView updateInfo(@RequestParam("id")String id){
        ModelAndView modelAndView = new ModelAndView("updateInfo");
        Hero hero = heroService.selectHeroById(id);
        modelAndView.addObject("result",hero);
        return modelAndView;
    }
    @RequestMapping("select")
    public ModelAndView select(@RequestParam("name") String name,
                               @RequestParam(defaultValue = "1",value = "currentPage")Integer currentPage,
                               @RequestParam(defaultValue = "10",value = "pageSize")Integer pageSize){
        ModelAndView mv = new ModelAndView("info");
        Page<Hero>heroPage=heroService.selcetPageHeroByName(currentPage,pageSize,name);
        mv.addObject("result",heroPage);
        return mv;


    }
}