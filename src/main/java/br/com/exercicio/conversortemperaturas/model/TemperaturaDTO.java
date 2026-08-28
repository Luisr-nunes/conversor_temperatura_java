// TemperaturaDTO
package br.com.exercicio.conversortemperaturas.model;

public class TemperaturaDTO {

    private double valor;
    private String origem;
    private String destino;
    private double resultado;

    // getters e setters
    public double getValor() {     return valor;      }
    public void setValor(double valor) {      this.valor = valor;    }
    public String getOrigem() {      return origem;       }
    public void setOrigem(String origem) {       this.origem = origem;   }

    public String getDestino() {     return destino;      }
    public void setDestino(String destino) {     this.destino = destino;   }
    public double getResultado() {    return resultado;    }
   
    public void setResultado(double resultado) {   
	this.resultado = resultado;
    }
}
