/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eliza;


import java.util.List;


public class keys {

    private String key;
    private int peso;
    private List<String> resposta;
    private int numeroResp;
    
    
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

  
    public List<String> getResposta() {
        return resposta;
    }

  
    public void setResposta(List<String> resposta) {
        this.resposta = resposta;
    }
    
     public int getNumeroResp() {
        return numeroResp;
    }

  
    public void setNumeroResp(int numeroResp) {
        this.numeroResp = numeroResp;
    }

    

    @Override
    public String toString() {
        return "Keys{"+ "key=" + key + ", peso=" + peso + ", resposta=" + resposta + ", numeroResp=" + numeroResp + " }";
    }


}
