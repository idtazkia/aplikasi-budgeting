package id.ac.tazkia.keuangan.id.ac.tazkia.budgeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/dashboard")
    public void dashboard(){}

    @GetMapping("/layout")
    public void layout(){}
}
