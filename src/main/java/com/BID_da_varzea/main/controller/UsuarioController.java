/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BID_da_varzea.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Aluno
 */
@Controller
public class UsuarioController {
    @GetMapping("/perfil")
    public String perfil(Model model){
        model.addAttribute("nome","Lincoln");
        model.addAttribute("curso","DS");
        Model addAttribute = model.addAttribute("linguagemFavorita","SQL");
        return "perfil";
    }
}
