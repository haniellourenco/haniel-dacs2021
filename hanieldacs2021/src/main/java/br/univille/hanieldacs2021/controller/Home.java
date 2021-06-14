package br.univille.hanieldacs2021.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class Home {

    @GetMapping
    public ModelAndView index() {
        Date dataAgora = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

        HashMap<String, String> dados = new HashMap<>();
        dados.put("tempo", sdf.format(dataAgora));
        dados.put("nomeapp", "App java lindo");

        // return new ModelAndView("home/index", "tempo", sdf.format(dataAgora));
        return new ModelAndView("home/index", dados);
    }

    // @RequestMapping("/outro")
    // @ResponseBody
    // public String outraPagina() {
    // return "outra página";
    // }
}
