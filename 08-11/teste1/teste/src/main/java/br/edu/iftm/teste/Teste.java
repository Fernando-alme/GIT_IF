package br.edu.iftm.teste;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Teste {

    @RequestMapping("/alo")
    public String master(Model modelo) {
        // modelo.addAttribute("numero1", 1);
        // modelo.addAttribute("numero2", 100);
        // modelo.addAttribute("x", "alo mundo");
        modelo.addAttribute("n1", Math.round(Math.random() * 100));
        modelo.addAttribute("n2", Math.round(Math.random() * 100));
        modelo.addAttribute("n3", Math.round(Math.random() * 100));
        modelo.addAttribute("n4", Math.round(Math.random() * 100));
        modelo.addAttribute("n5", Math.round(Math.random() * 100));
        modelo.addAttribute("n6", Math.round(Math.random() * 100));
        return "view1";
    }
}
