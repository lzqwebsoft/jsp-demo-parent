package com.dip.controller.dogs;

import com.dip.entity.*;
import com.dip.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

/**
 * Created by moneg on 28.12.2016.
 */
@Controller
public class RegisterDogController {
    @Autowired
    OwnerService ownerService;
    @Autowired
    BreederService breederService;
    @Autowired
    BreedService breedService;
    @Autowired
    ColorService colorService;
    @Autowired
    FciGroupService fciGroupService;
    @Autowired
    DogService dogService;
    @Autowired
    DogShowService dogShowService;
    @Autowired
    Registered_dogService registered_dogService;


    @ModelAttribute("dogshow_list")
    public List<DogShow> dogShows(){
        List<DogShow> dogShows = new ArrayList<DogShow>();
        dogShows = dogShowService.getAll();
        return dogShows;
    }

    @RequestMapping(value = {"/register_dog"}, method = {RequestMethod.GET})
    public ModelAndView RegisterDogPage() {
        ModelAndView modelAndView = new ModelAndView("dogs/register_dog");
        List<DogShow> dogshows_list = dogShowService.getAll();
        System.out.println("DOGSHOWS");
        System.out.println(dogshows_list);
        modelAndView.addObject("dogshows_list",dogshows_list);
        Date now = new Date();
        Date date = new Date(now.getYear(), now.getMonth()-3,now.getDay());
        modelAndView.addObject("date",date);
        return modelAndView;
    }

    @RequestMapping(value = {"/add_dog"}, method = {RequestMethod.POST})
    public ModelAndView addShow(@RequestParam("breed") String breed, @RequestParam("gender") String gender, @RequestParam("name") String name,
                                @RequestParam("dob") @DateTimeFormat(pattern="yyyy-MM-dd") Date dob, @RequestParam("color") String color,
                                @RequestParam("chip") String chip, @RequestParam("brand") String brand, @RequestParam("pedigree") String pedigree,
                                @RequestParam("sire") String sire, @RequestParam("dam") String dam, @RequestParam("fcigroup") int fcigroup,
                                @RequestParam("breeder_fname") String breeder_fname, @RequestParam("breeder_sname") String breeder_sname,
                                @RequestParam("breeder_lname") String breeder_lname, @RequestParam("owner_fname") String owner_fname,
                                @RequestParam("owner_sname") String owner_sname, @RequestParam("owner_lname") String owner_lname,
                                @RequestParam("owner_location") String owner_location,@RequestParam(value = "dogshow_id") int dogshow_id){
        ModelAndView mv = new ModelAndView("dogs/register_dog");
        Owner owner = new Owner();
        owner.setFname(owner_fname.trim());
        owner.setSname(owner_sname.trim());
        owner.setLname(owner_lname.trim());
        owner.setLocation(owner_location.trim());
        ownerService.addOwner(owner);
        Breeder breeder = new Breeder();
        breeder.setFname(breeder_fname.trim());
        breeder.setSname(breeder_sname.trim());
        breeder.setLname(breeder_lname.trim());
        breederService.addBreeder(breeder);
        Color color1 = new Color();
        color1.setTitle(color.trim());
        colorService.addColor(color1);
        FciGroup fciGroup = new FciGroup();
        fciGroup.setNumber(fcigroup);
        fciGroupService.addFciGroup(fciGroup);
        Breed breed1 = new Breed();
        breed1.setTitle(breed.trim());
        breed1.setFcigroup_id(fciGroup.getFcigroup_id());
        breedService.addBreed(breed1);
        Dog dog = new Dog();
        dog.setOwner(owner);
        dog.setOwner_id(owner.getOwner_id());
        dog.setBreeder(breeder);
        dog.setBreeder_id(breeder.getBreeder_id());
        dog.setColor_id(color1.getColor_id());
        dog.setBreed_id(breed1.getBreed_id());
        dog.setDam(dam.trim());
        dog.setSire(sire.trim());
        dog.setPedigree(pedigree.trim());
        dog.setBrand(brand.trim());
        dog.setChip(chip.trim());
        dog.setDob(dob);
        dog.setName(name.trim());
        dog.setGender(gender.trim());
        dogService.addDog(dog);
        DogShow dogShow = dogShowService.getById(dogshow_id);
        Registered_dog registered_dog = new Registered_dog();
        registered_dog.setDog(dog);
        registered_dog.setDogShow(dogShow);
        registered_dog.setNumber(registered_dogService.RandomNumber());
        registered_dogService.addRegisteredDog(registered_dog);
        mv.setViewName("dogs/finished");
        String human = "Dog";
        mv.addObject("human", human);
        return mv;
    }

}
