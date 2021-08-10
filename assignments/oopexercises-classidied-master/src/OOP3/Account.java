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
 *
 * @author claire
 */
public interface Account {
    public int deposit (int amount);
    public int withdrawal (int amount);
    public double checkBalance();
    public boolean takeLoan (int amount);
    public boolean payBills (int amount);
}
