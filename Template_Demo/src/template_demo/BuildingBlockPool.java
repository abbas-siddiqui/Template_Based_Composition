/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package template_demo;

import java.util.ArrayList;

/**
 *
 * @author siddiqui
 */
public class BuildingBlockPool {
ArrayList<AvailableBB> buildingBlocks ;

    
public BuildingBlockPool() {
       buildingBlocks = new ArrayList<AvailableBB>();
   
    }
    
   
    public void addBB(AvailableBB bb) {
        buildingBlocks.add(bb);
    }
    
    public void PrintBBNames()
    {
        System.out.println("BBs in the pool");
    for(int i =0 ; i<buildingBlocks.size(); i++)
    {
    System.out.println(buildingBlocks.get(i).bbName);
    }
    }

}
