
| Main |
| ---- |
|      |
|      |

| Game |
| ---- |
|      |
|      |
## Inventory

| interface Item      |
| ------------------- |
|                     |
| ~ getName(): String |


| Armor implements Item                                                                     |
| ----------------------------------------------------------------------------------------- |
| ~ name: String<br>~ defense: int                                                          |
| \+ Armor(String name, int defense): Armor<br>\+ getName(): String<br>\+ getDefense(): int |

| abstract Potion implements Item                                                                  |
| ---------------------------------------------------------------------------------------------- |
| ~ name: St                                                                                     \+ Potion(String name): Potion<br>\+ getName(): String<br>\+ abstract use(Entity entity): void ct  \+  |

| Weapon implements Item                                                                            |
| ------------------------------------------------------------------------------------------------- |
| ~ name: String<br>~ baseDamage: int                                                               |
| \+ Weapon(String name, int baseDamage): Weapon<br>\+ getName(): String<br>\+ getBaseDamage(): int |
## Entity

| abstract Entity                                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------------------------------- |
| ~ name: String<br>~ health: int<br>~ maxHealth: int<br>~ baseAttack: int<br>~ baseDefense: int<br>~ gold: int                                   |
| \+ Entity(String name, int maxHealth, int baseAttack, int baseDefense): Entity<br>\+ takeDamage(int damage): void<br>\+ setGold(int gold): void |

| Player extends Entity                                                                                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| ~ inventory: List\<Item><br>~ equippedWeapon: Weapon<br>~ equippedArmor: Armor                                                                                                                        |
| \+ Player(String name): Player<br>\+ equipWeapon(Weapon weapon): void<br>\+ unequipWeapon(): void<br>\+ equipArmor(Armor armor): void<br>\+ unequipArmor(): void<br>\+ usePotion(Potion potion): void |

| abstract Enemy extends Entity                                                          |
| -------------------------------------------------------------------------------------- |
|                                                                                        |
| \+ Enemy(String name, int maxHealth, int baseAttack, int baseDefense, int gold): Enemy |

| Slime extends Enemy |
| ------------------- |
|                     |
| + Slime(): Slime    |
## Combat


| interface CombatAction                                 |
| ------------------------------------------------------ |
|                                                        |
| ~ execute(Entity firstParty, Entity secondParty): void |

| AttackAction implements CombatAction                    |
| ------------------------------------------------------- |
|                                                         |
| \+ execute(Entity firstParty, Entity secondParty): void |

| BlockAction implements CombatAction                     |
| ------------------------------------------------------- |
|                                                         |
| \+ execute(Entity firstParty, Entity secondParty): void |

| FleeAction implements CombatAction                      |
| ------------------------------------------------------- |
|                                                         |
| \+ execute(Entity firstParty, Entity secondParty): void |