/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eliza;


import static eliza.Eliza.chaves;
import static eliza.Eliza.leitura;
import static eliza.Eliza.leiturapre;
import static eliza.Eliza.quit;
import static eliza.Eliza.trocaspost;
import static eliza.Eliza.trocaspre;
import java.util.Random;

/**
 *
 * @author Becker
 */
public class EscolheResp 
{   

    /**
     *
     */
    public static void RespEscolhida()
    {
        Random gerador = new Random();
        String sep[];
        String sep2 = new String();
        int rand = 0;
        boolean stop = false;
        keys resp;
        do
        {
            sep = leitura.split(" ");
            leitura = "";
            resp = null;
            for (String sep1 : sep)
            {
                sep2 = sep1;
                sep1 = sep1.toLowerCase();
                for (String ExitTest : quit)
                {
                    if(sep1.equals(ExitTest))
                    {
                        stop = true;
                    }
                } 
                for (pre petemp : trocaspre)
                {
                    if (sep1.equals(petemp.WordIn))
                    {
                        sep1 = petemp.WordOut;
                        sep2 = petemp.WordOut;
                    }
                }   
                for (post potemp : trocaspost)
                {
                    if (sep1.equals(potemp.userWord))
                    {
                        sep1 = potemp.elizaWord;
                    }
                }
                for (synon sytemp : Eliza.trocassynons)
                {
                    
                    for (String stringtemp : sytemp.synons)
                    {
                        if (sep1.equals(stringtemp))
                        {
                            sep1 = sytemp.getChave();
                        }
                    }
                }               
                for (keys ktemp : chaves) 
                {
                    if (sep1.equals(ktemp.getKey()))
                    {
                        if (resp == null || resp.getPeso() < ktemp.getPeso())
                        {
                            resp = ktemp;
                        }
                    }
                }   
                leitura = leitura + sep1 + " ";
                leiturapre = leiturapre + sep2 + " ";
            }
           
            if (resp != null)
            {
                rand = gerador.nextInt(resp.getNumeroResp());                    
                Eliza.RespFinal = resp.getResposta().get(rand);
                sep = leiturapre.split(resp.getKey());
                if (Eliza.RespFinal.contains("(1) "))
                    Eliza.RespFinal = Eliza.RespFinal.replace("(1) ", sep[0]);
                if (Eliza.RespFinal.contains(" (2)"))
                    Eliza.RespFinal = Eliza.RespFinal.replace(" (2)", sep[1]);
            }
            else
            {
                Eliza.RespFinal = "Não consigo conversar sobre este assunto, vamos tentar outro?";
            }
            if(stop == true)
            {
                stop = false;
                Eliza.RespFinal = Eliza.farewell;
            }
        }
        while (stop);        
    }
}
