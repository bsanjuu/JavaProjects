package com.bsanju.springweb;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home() {
        System.out.println("HomeController.home()");
        return "index";
    }

    @RequestMapping("/add")
//    public String add(int num1,int num2,HttpSession session)

//    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, HttpSession session)
//    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
//
//        int result = num1 + num2;
//        model.addAttribute("result", result);
//
//        return "result";
//    }

    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv) {

        int result = num1 + num2;
        mv.addObject("result",result);
        mv.setViewName("result");

        return mv;
    }

    @RequestMapping("addAlien")
    public ModelAndView addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView mv) {
        Alien alien=new Alien();
        alien.setAid(aid);
        alien.setAname(aname);
        mv.addObject("alien",alien);
        mv.setViewName("result");

        return mv;
    }

}
