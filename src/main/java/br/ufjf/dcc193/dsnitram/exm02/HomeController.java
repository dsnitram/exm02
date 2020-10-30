package br.ufjf.dcc193.dsnitram.exm02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.ufjf.dcc193.dsnitram.Pessoa;

@Controller
public class HomeController {

  @RequestMapping({ "", "index.html" })
    public String home(){
    return "home";    
  }
  
  @RequestMapping("formulario.html")
  public String formulario(){
  return "form";
  }

  @RequestMapping("resultado.html")
  public ModelAndView resultado(Pessoa p){
    ModelAndView mv = new ModelAndView();
     mv.setViewName("result-form");
     mv.addObject("pessoa", p);
    return mv;
  }
}
