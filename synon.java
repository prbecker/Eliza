/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eliza;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Becker
 */
public class synon 
{
    String chave;
    List<String> synons = new ArrayList<String>();
        
    public void setChave(String chave) 
    {
        this.chave = chave;
    }

    public String getChave() 
    {
        return chave;
    }
    public void setSynons(List<String> synons) 
    {
        this.synons = synons;
    }

    public List<String> getSynons() 
    {
        return synons;
    }
        
}
