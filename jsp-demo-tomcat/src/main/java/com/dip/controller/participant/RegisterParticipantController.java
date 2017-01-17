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

import java.util.Date;
import java.util.List;

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
    ColorService colorService;
    @Autowired
    FciGroupService fciGroupService;
    @Autowired
    BreedService breedService;


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
        participant.setFname(fname.trim());
        participant.setSname(sname.trim());
        participant.setLname(lname.trim());
        participant.setAge(age);
        participantService.addParticipant(participant);
        Registered_Contest_Participant registered_contestParticipant = new Registered_Contest_Participant();
        registered_contestParticipant.setContest(dogShowService.getById(dogshow_id).getContest());
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
                                      @RequestParam("dob") @DateTimeFormat(pattern="yyyy-MM-dd") Date dob, @RequestParam("color") String color,
                                      @RequestParam("chip") String chip, @RequestParam("brand") String brand, @RequestParam("pedigree") String pedigree,
                                      @RequestParam("sire") String sire, @RequestParam("dam") String dam, @RequestParam("fcigroup") int fcigroup,
                                      @RequestParam("breeder_fname") String breeder_fname, @RequestParam("breeder_sname") String breeder_sname,
                                      @RequestParam("breeder_lname") String breeder_lname, @RequestParam("owner_fname") String owner_fname,
                                      @RequestParam("owner_sname") String owner_sname, @RequestParam("owner_lname") String owner_lname,
                                      @RequestParam("owner_location") String owner_location, @RequestParam("dogshow_id") int dogshow_id){

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
        Registered_Contest_Dog registered_contest_dog = new Registered_Contest_Dog();
        registered_contest_dog.setDog(dog);
        registered_contest_dog.setNumber(registeredContestDogService.RandomNumber());
        registered_contest_dog.setContest(dogShow.getContest());
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
