/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern;

/**
 *
 * @author Elton
 */
public class ConcreteCommand_SellItem implements ICommand{
    
    private Receiver_StockItem stockitem;
    
    //constructor
    public ConcreteCommand_SellItem(){
    
    }
    
    
    @Override
    public void execute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
