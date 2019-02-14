package id.ac.tazkia.keuangan.id.ac.tazkia.budgeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TanahController {

    @GetMapping ("/tanah/form")
    public void formTanah(){}

    @GetMapping ("/tanah/list")
    public void listTanah(){}
}
