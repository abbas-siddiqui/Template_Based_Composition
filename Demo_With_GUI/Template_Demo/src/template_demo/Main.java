/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package template_demo;

import javax.xml.bind.JAXBException;

/**
 *
 * @author siddiqui
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JAXBException {
        // TODO code application logic here
        //MainVis visual= new MainVis();
        //visual.pack();
       // Requirements visual= new Requirements();
        //visual.show();
        MainVis req= new MainVis();
        req.setVisible(true);
        req.PopulateReqList("nothing");
        
    }

}
