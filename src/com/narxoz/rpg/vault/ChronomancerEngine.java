package com.narxoz.rpg.vault;

import com.narxoz.rpg.combatant.Hero;
import com.narxoz.rpg.memento.Caretaker;

import java.util.List;

/**
 * Orchestrates the Chronomancer's Vault demo run.
 */
public class ChronomancerEngine {

    /**
     * Runs the vault sequence for the supplied party.
     *
     * @param party the heroes entering the vault
     * @return a placeholder result in the scaffold
     */
    public VaultRunResult runVault(List<Hero> party) {
        // TODO: wire together mementos, visitors, and the vault sequence.
        Caretaker caretaker = new Caretaker();
        int artifactsAppraised = 0;
        int mementosCreated = 0;
        int restoredCount = 0;

        for (Hero hero : party) {
            System.out.println("--- Entering Vault: " + hero.getName() + " ---");
            caretaker.save(hero.createMemento());
            mementosCreated++;
        }


        return new VaultRunResult(0, 0, 0);
    }
}
