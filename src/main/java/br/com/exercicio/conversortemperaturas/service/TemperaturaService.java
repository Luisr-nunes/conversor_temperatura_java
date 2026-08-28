// TemperaturaService 
package br.com.exercicio.conversortemperaturas.service;

import org.springframework.stereotype.Service;

@Service
public class TemperaturaService {

    
    public double celsiusParaFahrenheit(double c) {
        return (c * 9.0 / 5.0) + 32;    
    }
    public double fahrenheitParaCelsius(double f) {
        return (f - 32) * 5.0 / 9.0;     
    }
    
    public double celsiusParaKelvin(double c) {
        return c + 273.15;  
    }
    public double kelvinParaCelsius(double k) {
        return k - 273.15;
    }
    public double fahrenheitParaKelvin(double f) {
        return celsiusParaKelvin(fahrenheitParaCelsius(f));
    }
    public double kelvinParaFahrenheit(double k) {
        return celsiusParaFahrenheit(kelvinParaCelsius(k));
    }

    public String converter(double valor, String origem, String destino) {

        if (!temperaturaValida(valor, origem)) {
            return "Temperatura inválida para a unidade de origem.";
        }
        double resultado;
       
        if (origem.equals(destino)) {
            resultado = valor;
        } else if (origem.equals("C") && destino.equals("F")) {
            resultado = celsiusParaFahrenheit(valor);
        } else if (origem.equals("F") && destino.equals("C")) {
            resultado = fahrenheitParaCelsius(valor);
        } else if (origem.equals("C") && destino.equals("K")) {
            resultado = celsiusParaKelvin(valor);
        }
  	else if (origem.equals("K") && destino.equals("C")) {
            resultado = kelvinParaCelsius(valor);
        } else if (origem.equals("F") && destino.equals("K")) {
            resultado = fahrenheitParaKelvin(valor);
        } else if (origem.equals("K") && destino.equals("F")) {
            resultado = kelvinParaFahrenheit(valor);
        } else {
            return "Unidade inválida.";
        }

        return String.format("%.2f", resultado);
    }


    private boolean temperaturaValida(double valor, String unidade) {

        if (unidade.equals("C")) {
            return valor >= -273.15;
        }
        if (unidade.equals("F")) {
            return valor >= -459.67;
        }
        if (unidade.equals("K")) {
            return valor >= 0;
        }
        return false;
    }
     
}
