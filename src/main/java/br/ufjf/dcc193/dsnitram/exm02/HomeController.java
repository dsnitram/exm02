package br.ufjf.dcc193.dsnitram.exm02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
  public String resultado(){
    return "result-form";
  }
}
