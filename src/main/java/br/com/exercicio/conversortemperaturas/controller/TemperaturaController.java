// TemperaturaController
package br.com.exercicio.conversortemperaturas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import br.com.exercicio.conversortemperaturas.model.TemperaturaDTO;
import br.com.exercicio.conversortemperaturas.service.TemperaturaService;

@Controller
public class TemperaturaController {

    private TemperaturaService service;

    
    public TemperaturaController(TemperaturaService service) {
        this.service = service;
    }


    @GetMapping("/")
    public String mostrarFormulario(Model model) {
        model.addAttribute("temperatura", new TemperaturaDTO());
        return "conversor";
    }

    @PostMapping("/converter")
    public String converter( @RequestParam String valor,  @RequestParam String origem, @RequestParam String destino, Model model) {

        double temperatura;

        if (!ehNumero(valor)) {
            model.addAttribute("erro", "Digite um valor numérico válido.");
            return "conversor";
        }
        temperatura = Double.parseDouble(valor);

        String resultado = service.converter(temperatura, origem, destino);
        TemperaturaDTO temperaturaDTO = new TemperaturaDTO();
        temperaturaDTO.setValor(temperatura);
        model.addAttribute("temperatura", temperaturaDTO);
	if (resultado.contains("inválida")) {
              model.addAttribute("erro", resultado);
        } else {
              model.addAttribute("valor", valor);
              model.addAttribute("resultado", resultado);
        }
        return "conversor";
    }
    private boolean ehNumero(String texto) {
        if (texto == null || texto.isEmpty()) {     return false;    }
        for (char c : texto.toCharArray()) {
            if (!Character.isDigit(c) && c != '.' && c != '-') {
                return false;
            }   
        }
        return true;
    }


}
