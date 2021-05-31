package br.univille.hanieldacs2021.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Eu não acredito";
    }

    @RequestMapping("/outro")
    @ResponseBody
    public String outraPagina() {
        return "outra página";
    }
}
