/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaqib
 */
public class LabDesk implements Wood{
    
    private String size;

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public void setSize(String size) {
        this.size = size;
    }
      
    @Override
    public void build(){
        System.out.println("Lab Desks are designed size="+getSize());
    }

            
    
}
