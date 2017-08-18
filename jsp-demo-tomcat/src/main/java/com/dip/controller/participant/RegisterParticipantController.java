package com.dip.controller.participant;

import com.dip.entity.*;
import com.dip.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.*;

/**
 * Created by moneg on 28.12.2016.
 */
@Controller
public class RegisterParticipantController {
    @Autowired
    DogShowService dogShowService;
    @Autowired
    ParticipantService participantService;
    @Autowired
    ContestTypeService contestTypeService;
    @Autowired
    ContestService contestService;
    @Autowired
    Registered_ContestParticipantService registered_contestParticipantService;
    @Autowired
    RegisteredContestDogService registeredContestDogService;
    @Autowired
    DogService dogService;
    @Autowired
    OwnerService ownerService;
    @Autowired
    BreederService breederService;
    @Autowired
    ColourService colourService;
    @Autowired
    FciGroupService fciGroupService;
    @Autowired
    BreedService breedService;
    @Autowired
    HumanService humanService;
    @Autowired
    AncestryService ancestryService;


    @ModelAttribute("dogshow_list_for_dog")
    public List<DogShow> dogShowsForDogs(){
        List<DogShow> dogShows = dogShowService.findByContestType(contestTypeService.getById(1));
        return dogShows;
    }
    @ModelAttribute("dogshow_list_for_people")
    public List<DogShow> dogShowsForPoeple(){
        List<DogShow> dogShows = dogShowService.findByContestType(contestTypeService.getById(2));
        return dogShows;
    }

    @RequestMapping(value = {"/reg_participant"}, method = {RequestMethod.GET})
    public ModelAndView RegisterParticipantPage() {
        System.out.println("ZASHEL");
        ModelAndView modelAndView = new ModelAndView("participants/reg_participant");
        return modelAndView;
    }

    @RequestMapping(value = {"/reg_dog_contest"}, method = {RequestMethod.GET})
    public ModelAndView RegisterDogContestPage() {
        System.out.println("ZASHEL");
        ModelAndView modelAndView = new ModelAndView("dogs/reg_dog_contest");
        Date now = new Date();
        Date date = new Date(now.getYear(), now.getMonth()-3,now.getDay());
        modelAndView.addObject("date",date);
        return modelAndView;
    }

    @RequestMapping(value = {"/add_participant"}, method = {RequestMethod.POST})
    public RedirectView AddParticipant(@RequestParam("Fname") String fname, @RequestParam("Sname") String sname,
                                       @RequestParam("Lname") String lname, @RequestParam("Age") int age, @RequestParam("dogshow_id") int dogshow_id){
        Participant participant = new Participant();
        Human human = new Human();
        human.setFname(fname);
        human.setSname(sname);
        human.setLname(lname);
        participant.setHuman(human);
        participant.setAge(age);
        participantService.addParticipant(participant);
        Registered_Contest_Participant registered_contestParticipant = new Registered_Contest_Participant();
        registered_contestParticipant.setParticipant(participant);
        registered_contestParticipant.setNumber(registered_contestParticipantService.RandomNumber());
        registered_contestParticipantService.addRegistered_Contest(registered_contestParticipant);
        RedirectView redirectView = new RedirectView();
        redirectView.setContextRelative(true);
        redirectView.setUrl("/participant_reg_finished");
        return redirectView;
    }

    @RequestMapping(value = {"/add_dog_contest"}, method = {RequestMethod.POST})
    public RedirectView AddDogContest(@RequestParam("breed") String breed, @RequestParam("gender") String gender, @RequestParam("name") String name,
                                      @RequestParam("dob") @DateTimeFormat(pattern="yyyy-MM-dd") Date dob, @RequestParam("colour") String color,
                                      @RequestParam("chipMark") String chipMark, @RequestParam("pedigree") String pedigree,
                                      @RequestParam("sire") String sire, @RequestParam("sirePedigree") String sirePedigree, @RequestParam("dam") String dam,
                                      @RequestParam("damPedigree") String damPedigree,@RequestParam("fcigroup") int fcigroup,
                                      @RequestParam("breeder_fname") String breeder_fname, @RequestParam("breeder_sname") String breeder_sname,
                                      @RequestParam("breeder_lname") String breeder_lname, @RequestParam("owner_fname") String owner_fname,
                                      @RequestParam("owner_sname") String owner_sname, @RequestParam("owner_lname") String owner_lname,
                                      @RequestParam("owner_location") String owner_location, @RequestParam("dogshow_id") int dogshow_id){

        ModelAndView mv = new ModelAndView("dogs/register_dog");
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
        List<Dog> dogs1 = new ArrayList<Dog>();
        dogs1.add(dogService.findByPedigree(dog.getPedigree()));
        if(dogs1.isEmpty()){
            dogService.addDog(dog);
            System.out.println("PEDIGREEE" + pedigree);
        }
        else{
            dog = dogService.findByPedigree(dog.getPedigree());
        }
        Registered_Contest_Dog registered_contest_dog = new Registered_Contest_Dog();
        registered_contest_dog.setDog(dog);
        registered_contest_dog.setNumber(registeredContestDogService.RandomNumber());
        registeredContestDogService.addRegisteredContestDog(registered_contest_dog);

        RedirectView redirectView = new RedirectView();
        redirectView.setContextRelative(true);
        redirectView.setUrl("/dog_reg_contest");
        return redirectView;
    }

    @RequestMapping(value = {"/participant_reg_finished"}, method = {RequestMethod.GET})
    public ModelAndView RegisterParticipantFinishedPage() {
        System.out.println("ZASHEL");
        ModelAndView modelAndView = new ModelAndView("participants/finished");
        return modelAndView;
    }

    @RequestMapping(value = {"/dog_reg_contest"}, method = {RequestMethod.GET})
    public ModelAndView RegisterDogContestFinishedPage() {
        System.out.println("ZASHEL");
        ModelAndView modelAndView = new ModelAndView("dogs/finished");
        return modelAndView;
    }
}
