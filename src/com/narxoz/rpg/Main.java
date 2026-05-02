package com.narxoz.rpg;

import com.narxoz.rpg.artifact.Inventory;
import com.narxoz.rpg.combatant.Hero;

/**
 * Entry point for Homework 9 — Chronomancer's Vault: Visitor + Memento.
 *
 * The scaffold prints the banner only; students fill in the vault demo.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Homework 9 Demo: Visitor + Memento ===");

        // 1. Create at least 2 heroes with different starting states.
        Hero alidar = new Hero("Alidar the Warrior", 100, 20, 15);
        Hero batyr = new Hero("Aiym the Mage", 70, 50, 10, 5, 100, new Inventory());
        // 2. Build an artifact inventory and exercise the visitor interface.
        // 3. Capture a hero snapshot through the memento workflow.
        // 4. Rewind the hero after a vault trap changes state.
        // 5. Run the ChronomancerEngine demo sequence.
        // 6. Print a final VaultRunResult summary.
    }
}
