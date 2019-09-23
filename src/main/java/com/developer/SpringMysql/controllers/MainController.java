package com.developer.SpringMysql.controllers;

import com.developer.SpringMysql.models.AppUsers;
import com.developer.SpringMysql.models.AppUsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController
{
    @Autowired
    AppUsersRepo appRepo;

    @RequestMapping("/")

    //this to view the index.jsp
    public ModelAndView doHome(){
        ModelAndView mv = new ModelAndView("index");
        //create a list to get all data usin mv variable
        mv.addObject("lists", appRepo.findAll());
        return mv;

    }

    //this method to save data to the database and we use post method to store data
    @RequestMapping( value = "/save", method = RequestMethod.POST)
    //this to view the index.jsp
    public ModelAndView doSave(@RequestParam("firstname") String firstName, @RequestParam("lastname") String lastName){
        ModelAndView mv = new ModelAndView("redirect:/");
        AppUsers users = new AppUsers();
        //this to insert fname
        users.setFirstName(firstName);
        //this to insert lname
        users.setLastName(lastName);
        //create a list to get all data usin mv variable
        appRepo.save(users);
        return mv;

    }

    @RequestMapping( value = "/view/{id}", method = RequestMethod.GET)
    public ModelAndView doView(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("view");
        mv.addObject("lists",appRepo.findById(id));
        return mv;
    }

    @RequestMapping( value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView doDelete(@PathVariable("id")  int id){
        ModelAndView mv = new ModelAndView("redirect:/");
        appRepo.deleteById(id);
        return mv;
    }


    @RequestMapping( value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView doEdit(@PathVariable("id") final int Id){
        ModelAndView mv = new ModelAndView("edit");
        mv.addObject("lists",appRepo.findById(Id));
        return mv;
    }

}



