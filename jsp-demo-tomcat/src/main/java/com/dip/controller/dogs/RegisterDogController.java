package com.dip.controller.dogs;

import com.dip.entity.*;
import com.dip.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

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
    ColourService colourService;
    @Autowired
    DogService dogService;
    @Autowired
    DogShowService dogShowService;
    @Autowired
    FciGroupService fciGroupService;
    @Autowired
    HumanService humanService;
    @Autowired
    AncestryService ancestryService;


    @ModelAttribute("dogshow_list")
    public List<DogShow> dogShows(){
        List<DogShow> dogShows = new ArrayList<DogShow>();
        dogShows = dogShowService.getAll();
        return dogShows;
    }

//    @ModelAttribute("breed_list")
//    public List<Breed> breeds(Integer fciGroup){
//        System.out.println(fciGroup);
//        List<Breed> breeds = new ArrayList<Breed>();
//        breeds = breedService.findByFciGroup(fciGroupService.findById(fciGroup));
//        return breeds;
//    }

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
        List<FciGroup> fciGroups = fciGroupService.getAll();
        modelAndView.addObject("fcigroup",fciGroups);
        List<Breed> breeds1 = breedService.findByFciGroup(fciGroupService.findById(1));
        modelAndView.addObject("breed_1",breeds1);
        List<Breed> breeds2 = breedService.findByFciGroup(fciGroupService.findById(2));
        modelAndView.addObject("breed_2",breeds2);
        List<Breed> breeds3 = breedService.findByFciGroup(fciGroupService.findById(3));
        modelAndView.addObject("breed_3",breeds3);
        List<Breed> breeds4 = breedService.findByFciGroup(fciGroupService.findById(4));
        modelAndView.addObject("breed_4",breeds4);
        List<Breed> breeds5 = breedService.findByFciGroup(fciGroupService.findById(5));
        modelAndView.addObject("breed_5",breeds5);
        List<Breed> breeds6 = breedService.findByFciGroup(fciGroupService.findById(6));
        modelAndView.addObject("breed_6",breeds6);
        List<Breed> breeds7 = breedService.findByFciGroup(fciGroupService.findById(7));
        modelAndView.addObject("breed_7",breeds7);
        List<Breed> breeds8 = breedService.findByFciGroup(fciGroupService.findById(8));
        modelAndView.addObject("breed_8",breeds8);
        List<Breed> breeds9 = breedService.findByFciGroup(fciGroupService.findById(9));
        modelAndView.addObject("breed_9",breeds9);
        List<Breed> breeds10 = breedService.findByFciGroup(fciGroupService.findById(10));
        modelAndView.addObject("breed_10",breeds10);
        List<Breed> breeds11 = breedService.findByFciGroup(fciGroupService.findById(11));
        modelAndView.addObject("breed_11",breeds11);
        List<Colour> colours = colourService.getAll();
        modelAndView.addObject("colour", colours);
        return modelAndView;
    }

    @RequestMapping(value = {"/add_dog","/reg_dog_separate/add_dog"}, method = {RequestMethod.POST})
    public RedirectView registerDog(@RequestParam("breed") String breed, @RequestParam("gender") String gender, @RequestParam("name") String name,
                                @RequestParam("dob") @DateTimeFormat(pattern="yyyy-MM-dd") Date dob, @RequestParam("colour") String color,
                                @RequestParam("chipMark") String chipMark, @RequestParam("pedigree") String pedigree,
                                @RequestParam("sire") String sire, @RequestParam("sirePedigree") String sirePedigree, @RequestParam("dam") String dam,
                                    @RequestParam("damPedigree") String damPedigree, @RequestParam("fcigroup") int fcigroup,
                                @RequestParam("breeder_fname") String breeder_fname, @RequestParam("breeder_sname") String breeder_sname,
                                @RequestParam("breeder_lname") String breeder_lname, @RequestParam("owner_fname") String owner_fname,
                                @RequestParam("owner_sname") String owner_sname, @RequestParam("owner_lname") String owner_lname,
                                @RequestParam("owner_location") String owner_location,@RequestParam("dogshow_id") int dogshow_id){
        ModelAndView mv = new ModelAndView("dogs/register_dog");
        System.out.println("FCI GROUP " + fcigroup);
        Human human_owner = new Human();
        human_owner.setSname(owner_sname.trim());
        human_owner.setFname(owner_fname.trim());
        human_owner.setLname(owner_lname.trim());
        humanService.addHuman(human_owner);
        Owner owner = new Owner();
        owner.setHuman(human_owner);
        owner.setLocation(owner_location.trim());
        ownerService.addOwner(owner);
        Breeder breeder = new Breeder();
        Human human_breeder = new Human();
        human_breeder.setFname(breeder_fname.trim());
        human_breeder.setSname(breeder_sname.trim());
        human_breeder.setLname(breeder_lname.trim());
        humanService.addHuman(human_breeder);
        breeder.setHuman(human_breeder);
        breederService.addBreeder(breeder);
        FciGroup fciGroup = fciGroupService.findById(fcigroup);
        fciGroupService.addFciGroup(fciGroup);
        Breed breed1 = new Breed();
        breed1 = breedService.findByTitle(breed);
        Colour colour = colourService.findByTitle(color);
        Dog dog = new Dog();
        dog.setOwner(owner);
        dog.setBreeder(breeder);
        Ancestry ancestry = new Ancestry();
        ancestry.setDamName(dam.trim());
        ancestry.setDamPedigree(damPedigree.trim());
        ancestry.setSireName(sire.trim());
        ancestry.setSirePedigree(sirePedigree.trim());
        ancestryService.addAncestry(ancestry);
        Set<Ancestry> ancestries = new HashSet<Ancestry>();
        ancestries.add(ancestry);
        dog.setAncestries(ancestries);
        dog.setPedigree(pedigree.trim());
        dog.setChipMark(chipMark.trim());
        dog.setDob(dob);
        dog.setName(name.trim());
        dog.setGender(gender.trim());
        dog.setColour(colour);
        dog.setBreed(breed1);
        DogShow dogShow = dogShowService.getById(dogshow_id);
        Set<Dog> dogs = new HashSet<Dog>();
        dogs.add(dog);
        dogShow.setDogs(dogs);
        Set<DogShow> dogShows = new HashSet<DogShow>();
        dogShows.add(dogShow);
        dog.setDogShows(dogShows);
        dogService.addDog(dog);

        RedirectView redirectView = new RedirectView();
        redirectView.setContextRelative(true);
        redirectView.setUrl("/dogs/finished");
        return redirectView;
    }

    @RequestMapping(value = {"/dogs/finished"}, method = {RequestMethod.GET})
    public ModelAndView FinishedPage() {
        ModelAndView modelAndView = new ModelAndView("dogs/finished");
        Date date = new Date();
        System.out.println(date);
        modelAndView.addObject("date",date);
        return modelAndView;
    }

    @RequestMapping(value = {"/reg_dog_separate/{dogshow_id}"}, method = {RequestMethod.GET})
    public ModelAndView registerDogSeparate(@PathVariable("dogshow_id") int dogshow_id){

    ModelAndView modelAndView = new ModelAndView("dogs/reg_dog_separate");
    DogShow dogShow = dogShowService.getById(dogshow_id);
        Date now = new Date();
        Date date = new Date(now.getYear(), now.getMonth()-3,now.getDay());
        modelAndView.addObject("date",date);
    modelAndView.addObject("dogshow",dogShow);
    return modelAndView;
    }

}
