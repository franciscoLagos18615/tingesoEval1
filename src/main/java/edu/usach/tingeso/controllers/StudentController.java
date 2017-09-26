package edu.usach.tingeso.controllers;


import edu.usach.tingeso.models.Student;
import edu.usach.tingeso.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/student")

public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Student getStudent(@PathVariable("id") Integer id){
     long lid = id.longValue();
     return studentRepository.findOne(lid);
     //return studentRepository.findOne(lid);
    }

    @RequestMapping(path ="/new", method= RequestMethod.POST)

    public Integer createStudent(@RequestBody Student student){
        Student nuevo = new Student();
        nuevo.setPrimer_nombre(student.getPrimer_nombre());
        nuevo.setApellido(student.getApellido());
        nuevo.setRut(student.getRut());
        nuevo.setCarrera(student.getCarrera());
        nuevo.setEmail(student.getEmail());
        nuevo.setAnio_ingreso(student.getAnio_ingreso());
        studentRepository.save(nuevo);
        return 1;

    }

}
