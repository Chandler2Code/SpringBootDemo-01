package com.czyfwpla.demo01.controller;

import com.czyfwpla.demo01.model.Hero;
import com.czyfwpla.demo01.service.HeroService;
import com.czyfwpla.demo01.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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
    public ModelAndView heroInfo(@RequestParam("currentPage")Integer currentPage){
        ModelAndView mv = new ModelAndView("info");
        int pageSize = 10;
        Page<Hero>heroPage=heroService.selcetPageHero(currentPage,pageSize);
        mv.addObject("result",heroPage);
        return mv;
    }
}