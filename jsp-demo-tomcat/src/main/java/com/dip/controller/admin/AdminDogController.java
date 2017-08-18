package com.dip.controller.admin;

import com.dip.entity.*;
import com.dip.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

/**
 * Created by Max on 15.02.2017.
 */
@Controller
public class AdminDogController {

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

    @RequestMapping(value = {"/admin/addDogToShow"}, method = {RequestMethod.GET})
    public ModelAndView adminAddDogShowPage() {
        ModelAndView modelAndView = new ModelAndView("adminka/addDogToShow");
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

    @RequestMapping(value = {"/admin/addDogToShow"}, method = {RequestMethod.POST})
    public ModelAndView adminAddDogShow(@RequestParam("breed") String breed, @RequestParam("gender") String gender, @RequestParam("name") String name,
                                        @RequestParam("dob") @DateTimeFormat(pattern="yyyy-MM-dd") Date dob, @RequestParam("colour") String color,
                                        @RequestParam("chipMark") String chipMark, @RequestParam("pedigree") String pedigree,
                                        @RequestParam("sireName") String sire, @RequestParam("sirePedigree") String sirePedigree, @RequestParam("damName") String dam,
                                        @RequestParam("damPedigree") String damPedigree, @RequestParam("fcigroup") int fcigroup,
                                        @RequestParam("bfname") String breeder_fname, @RequestParam("bsname") String breeder_sname,
                                        @RequestParam("blname") String breeder_lname, @RequestParam("ofname") String owner_fname,
                                        @RequestParam("osname") String owner_sname, @RequestParam("olname") String owner_lname,
                                        @RequestParam("olocation") String owner_location, @RequestParam("dogshow_id") int dogshow_id,
                                        @RequestParam("FcoOfname") String FcoOfname, @RequestParam("FcoOlname") String FcoOlname,
                                        @RequestParam("ScoOfname") String ScoOfname, @RequestParam("ScoOlname") String ScoOlname){
        ModelAndView modelAndView = new ModelAndView("adminka/addDogToShow");
        Human human_owner = new Human();
        human_owner.setSname(owner_sname.trim());
//        human_owner.setFname(owner_fname.trim());
        human_owner.setLname(owner_lname.trim());
        humanService.addHuman(human_owner);
        Owner owner = new Owner();
        owner.setHuman(human_owner);
        owner.setLocation(owner_location.trim());
        Human TempH;
        TempH = humanService.findByFname(FcoOfname);
       /* if(TempH == null){
            owner.setCoOwner1(null);
            owner.setCoOwner2(null);
        }
        else{
            CoOwner1 coOwner1 =
        }*/
        ownerService.addOwner(owner);
        Breeder breeder = new Breeder();
        Human human_breeder = new Human();
//        human_breeder.setFname(breeder_fname.trim());
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
        return modelAndView;
    }

    @RequestMapping(value = {"/admin/addDogToContest"}, method = {RequestMethod.GET})
    public ModelAndView adminAddDogToContest() {
        ModelAndView modelAndView = new ModelAndView("adminka/addDogToContest");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String name = authentication.getName();
        return modelAndView;
    }
}
