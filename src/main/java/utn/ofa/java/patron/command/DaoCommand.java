/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.ofa.java.patron.command;

import java.util.List;

/**
 *
 * @author marti
 * @param <T>
 */
public interface DaoCommand<T> {
    // https://www.tutorialspoint.com/design_pattern/command_pattern.htm
    public void executeInsert(T resultado);
    
    public void executeUpdate(T resultado);
    
    public void executeDelete();

    public void executeList(List<T> l);

    public void executeFind(T resultado);

}
