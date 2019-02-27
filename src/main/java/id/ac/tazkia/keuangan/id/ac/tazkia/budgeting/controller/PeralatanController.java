package id.ac.tazkia.keuangan.id.ac.tazkia.budgeting.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PeralatanController {

    @GetMapping ("/peralatan/form")
    public void formPeralatan(){}

    @GetMapping ("/peralatan/list")
    public void listPeralatan(){}

}
