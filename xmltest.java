/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eliza;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.*;
import java.util.List;

class xmltest {

    public static void gravaXMLListaChaves(List<keys> chaves) {
        XStream xStream = new XStream(new DomDriver());
        xStream.alias("ListaDePostagens", List.class);
 // xStream.alias("endereco", Endereco.class);

        File arquivo = new File("ListaDeChaves.xml");
        FileOutputStream gravar;
        try {
            gravar = new FileOutputStream(arquivo);
            gravar.write(xStream.toXML(chaves).getBytes());
            gravar.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
