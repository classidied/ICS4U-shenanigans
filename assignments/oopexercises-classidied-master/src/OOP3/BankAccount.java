/*
 * Copyright (c) 2020 claire.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    claire - initial API and implementation and/or initial documentation
 */
package OOP3;

/**
 * Description: 
 * Teacher: Mr. R-D
 * @author claire
 * Date: 10/14/2020
 */
public class BankAccount implements Account {
    private int balance;
    private String name;
    public BankAccount (String newName) {
        name = newName;
        balance = 0;
    }
    public void deposit (double amt) {
        
    }
    public void withdrawal (double amt) {
        
    }

    /**
     * @return the balance
     */
    public int getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int deposit(int amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int withdrawal(int amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double checkBalance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean takeLoan(int amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean payBills(int amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

