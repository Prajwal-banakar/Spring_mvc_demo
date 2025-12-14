package com.doctors.controllers;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.doctors.beans.Doctor;
import com.doctors.dao.DoctorDao;

@Controller
@SessionAttributes("doctor")
public class DoctorController {
    private static final Logger LOGGER = Logger.getLogger(DoctorController.class.getName());
    private final DoctorDao dao;

    @Autowired
    public DoctorController(DoctorDao dao) {
        this.dao = dao;
    }

    @ModelAttribute("doctor")
    public Doctor getDoctor() {
        return new Doctor();
    }

    @RequestMapping("/doctorsearchform")
    public String searchForm(Model model) {
        model.addAttribute("command", new Doctor());
        return "doctorsearchform";
    }

    @RequestMapping(value = "/checkDoctorsOnline", method = RequestMethod.POST)
    public ModelAndView checkDoctorsOnline(@ModelAttribute("doctor") Doctor doctor) {
        ModelAndView mav = new ModelAndView("welcome");
        try {
            Doctor result = null;
            if (doctor.getName() != null && !doctor.getName().isEmpty()) {
                result = dao.getDoctorsByName(doctor.getName());
            } else if (doctor.getDoctorRegistrationNumber() != null && !doctor.getDoctorRegistrationNumber().isEmpty()) {
                result = dao.getDoctorsByRegistrationNumber(doctor.getDoctorRegistrationNumber());
            }

            if (result != null) {
                mav.addObject("DoctorName", result.getName());
                mav.addObject("Specialty", result.getSpecialty());
                mav.addObject("RegistrationNumber", result.getDoctorRegistrationNumber());
                mav.addObject("Gender", result.getGender());
                mav.addObject("Qualification", result.getQualification());
            } else {
                mav.addObject("DoctorName", "Not Found");
                mav.addObject("RegistrationNumber", "Not Available Online");
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error checking doctors online", e);
            mav.addObject("DoctorName", "Error");
            mav.addObject("RegistrationNumber", "Database Error");
        }
        return mav;
    }
}