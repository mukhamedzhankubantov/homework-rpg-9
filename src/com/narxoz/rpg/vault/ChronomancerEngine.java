package com.narxoz.rpg.vault;

import com.narxoz.rpg.artifact.GoldAppraiser;
import com.narxoz.rpg.artifact.Inventory;
import com.narxoz.rpg.artifact.Weapon;
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

            Inventory vaultLoot = new Inventory();
            vaultLoot.addArtifact(new Weapon("Excalibur", 500, 15, 20));

            GoldAppraiser appraiser = new GoldAppraiser();
            vaultLoot.accept(appraiser);
            artifactsAppraised += vaultLoot.size();

            System.out.println("Loot value appraised: " + appraiser.getTotalValue() + " gold.");

            System.out.println("! TRAP ! " + hero.getName() + " takes 50 damage and loses all gold!");
            hero.takeDamage(50);
            hero.spendGold(hero.getGold());

            if (hero.getHp() < 20 || hero.getGold() == 0) {
                System.out.println("Rewinding time for " + hero.getName() + "...");
                hero.restoreFromMemento(caretaker.undo());
                restoredCount++;
            }
        }


        return new VaultRunResult(artifactsAppraised, mementosCreated, restoredCount);
    }
}
