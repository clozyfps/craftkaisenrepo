package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

public class SetMovesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Page).equals("Innate")) {
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Limitless")) {
				entity.getPersistentData().putDouble("maxMoves", 5);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Lapse Blue");
					entity.getPersistentData().putDouble("moveCost", 7);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
					entity.getPersistentData().putString("moveDisplay", "Reversal Red");
					entity.getPersistentData().putDouble("moveCost", 10);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
					entity.getPersistentData().putString("moveDisplay", "Teleport");
					entity.getPersistentData().putDouble("moveCost", 15);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 4) {
					entity.getPersistentData().putString("moveDisplay", "Hollow Purple");
					entity.getPersistentData().putDouble("moveCost", 25);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 5) {
					entity.getPersistentData().putString("moveDisplay", "Unlimited Void");
					entity.getPersistentData().putDouble("moveCost", 70);
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Cursed Speech")) {
				entity.getPersistentData().putDouble("maxMoves", 8);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Explode");
					entity.getPersistentData().putDouble("moveCost", 7);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
					entity.getPersistentData().putString("moveDisplay", "Twist");
					entity.getPersistentData().putDouble("moveCost", 10);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
					entity.getPersistentData().putString("moveDisplay", "Crush");
					entity.getPersistentData().putDouble("moveCost", 15);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 4) {
					entity.getPersistentData().putString("moveDisplay", "Crumble Away");
					entity.getPersistentData().putDouble("moveCost", 15);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 5) {
					entity.getPersistentData().putString("moveDisplay", "Dont Move");
					entity.getPersistentData().putDouble("moveCost", 20);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 6) {
					entity.getPersistentData().putString("moveDisplay", "Sleep");
					entity.getPersistentData().putDouble("moveCost", 25);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 7) {
					entity.getPersistentData().putString("moveDisplay", "Run Away");
					entity.getPersistentData().putDouble("moveCost", 30);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 8) {
					entity.getPersistentData().putString("moveDisplay", "Blast Away");
					entity.getPersistentData().putDouble("moveCost", 35);
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Sukuna Vessel")) {
				entity.getPersistentData().putDouble("maxMoves", 4);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Dismantle");
					entity.getPersistentData().putDouble("moveCost", 7);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
					entity.getPersistentData().putString("moveDisplay", "Cleave");
					entity.getPersistentData().putDouble("moveCost", 10);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
					entity.getPersistentData().putString("moveDisplay", "Fire Arrow");
					entity.getPersistentData().putDouble("moveCost", 18);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 4) {
					entity.getPersistentData().putString("moveDisplay", "Malevolent Shrine");
					entity.getPersistentData().putDouble("moveCost", 70);
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Copy")) {
				entity.getPersistentData().putDouble("maxMoves", 5);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Summon Rika");
					entity.getPersistentData().putDouble("moveCost", 5);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
					entity.getPersistentData().putString("moveDisplay", "Release Rika");
					entity.getPersistentData().putDouble("moveCost", 2);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
					entity.getPersistentData().putString("moveDisplay", "Copy");
					entity.getPersistentData().putDouble("moveCost", 12);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 4) {
					entity.getPersistentData().putString("moveDisplay", "Pure Love");
					entity.getPersistentData().putDouble("moveCost", 35);
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Blood Manipulation")) {
				entity.getPersistentData().putDouble("maxMoves", 6);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Piercing Blood");
					entity.getPersistentData().putDouble("moveCost", 7);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
					entity.getPersistentData().putString("moveDisplay", "Slicing Excorsism");
					entity.getPersistentData().putDouble("moveCost", 10);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
					entity.getPersistentData().putString("moveDisplay", "Blood Edge");
					entity.getPersistentData().putDouble("moveCost", 15);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 4) {
					entity.getPersistentData().putString("moveDisplay", "Blood Meteorite");
					entity.getPersistentData().putDouble("moveCost", 18);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 5) {
					entity.getPersistentData().putString("moveDisplay", "Flowing Red Scale");
					entity.getPersistentData().putDouble("moveCost", 20);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 6) {
					entity.getPersistentData().putString("moveDisplay", "Super Nova");
					entity.getPersistentData().putDouble("moveCost", 23);
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Antigravity System")) {
				entity.getPersistentData().putDouble("maxMoves", 6);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Float");
					entity.getPersistentData().putDouble("moveCost", 3);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
					entity.getPersistentData().putString("moveDisplay", "Anti Gravity Imbue");
					entity.getPersistentData().putDouble("moveCost", 8);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
					entity.getPersistentData().putString("moveDisplay", "Anti Gravity Field");
					entity.getPersistentData().putDouble("moveCost", 15);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 4) {
					entity.getPersistentData().putString("moveDisplay", "Pressure");
					entity.getPersistentData().putDouble("moveCost", 17);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 5) {
					entity.getPersistentData().putString("moveDisplay", "Pressure Imbue");
					entity.getPersistentData().putDouble("moveCost", 20);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 6) {
					entity.getPersistentData().putString("moveDisplay", "Pressure Field");
					entity.getPersistentData().putDouble("moveCost", 25);
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Ten Shadows")) {
				entity.getPersistentData().putDouble("maxMoves", 11);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Black Divine Dog");
					entity.getPersistentData().putDouble("moveCost", 5);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
					entity.getPersistentData().putString("moveDisplay", "White Divine Dog");
					entity.getPersistentData().putDouble("moveCost", 5);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
					entity.getPersistentData().putString("moveDisplay", "Toad");
					entity.getPersistentData().putDouble("moveCost", 15);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 4) {
					entity.getPersistentData().putString("moveDisplay", "Great Serpent");
					entity.getPersistentData().putDouble("moveCost", 18);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 5) {
					entity.getPersistentData().putString("moveDisplay", "Maximum: Elephant");
					entity.getPersistentData().putDouble("moveCost", 21);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 6) {
					entity.getPersistentData().putString("moveDisplay", "Rabbit Escape");
					entity.getPersistentData().putDouble("moveCost", 15);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 7) {
					entity.getPersistentData().putString("moveDisplay", "Nue");
					entity.getPersistentData().putDouble("moveCost", 25);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 8) {
					entity.getPersistentData().putString("moveDisplay", "Round Deer");
					entity.getPersistentData().putDouble("moveCost", 30);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 9) {
					entity.getPersistentData().putString("moveDisplay", "Divine Mahoraga");
					entity.getPersistentData().putDouble("moveCost", 32);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 10) {
					entity.getPersistentData().putString("moveDisplay", "Merged Beast Agito");
					entity.getPersistentData().putDouble("moveCost", 35);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 11) {
					entity.getPersistentData().putString("moveDisplay", "Chimera Shadow Garden");
					entity.getPersistentData().putDouble("moveCost", 65);
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Disaster Flames")) {
				entity.getPersistentData().putDouble("maxMoves", 5);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Disaster Flames");
					entity.getPersistentData().putDouble("moveCost", 5);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
					entity.getPersistentData().putString("moveDisplay", "Ember Insects");
					entity.getPersistentData().putDouble("moveCost", 10);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
					entity.getPersistentData().putString("moveDisplay", "Volcanic Eruption");
					entity.getPersistentData().putDouble("moveCost", 15);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 4) {
					entity.getPersistentData().putString("moveDisplay", "Maximum: Meteor");
					entity.getPersistentData().putDouble("moveCost", 18);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 5) {
					entity.getPersistentData().putString("moveDisplay", "Coffin of the Iron Mountain");
					entity.getPersistentData().putDouble("moveCost", 70);
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Disaster Plants")) {
				entity.getPersistentData().putDouble("maxMoves", 4);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Roots");
					entity.getPersistentData().putDouble("moveCost", 5);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
					entity.getPersistentData().putString("moveDisplay", "Flower Field");
					entity.getPersistentData().putDouble("moveCost", 10);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
					entity.getPersistentData().putString("moveDisplay", "Wooden Ball");
					entity.getPersistentData().putDouble("moveCost", 15);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 4) {
					entity.getPersistentData().putString("moveDisplay", "Cursed Bud");
					entity.getPersistentData().putDouble("moveCost", 18);
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Cursed Spirit Manipulation")) {
				entity.getPersistentData().putDouble("maxMoves", 13);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Return Curses");
					entity.getPersistentData().putDouble("moveCost", 0);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
					entity.getPersistentData().putString("moveDisplay", ("Summon " + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CSM1
							+ new java.text.DecimalFormat("#").format((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CsmSlot1Stack) + "x"));
				} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
					entity.getPersistentData().putString("moveDisplay", ("Summon " + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CSM2
							+ new java.text.DecimalFormat("#").format((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CsmSlot2Stack) + "x"));
					entity.getPersistentData().putDouble("moveCost", 0);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 4) {
					entity.getPersistentData().putString("moveDisplay", ("Summon " + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CSM3
							+ new java.text.DecimalFormat("#").format((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CsmSlot3Stack) + "x"));
					entity.getPersistentData().putDouble("moveCost", 0);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 5) {
					entity.getPersistentData().putString("moveDisplay", ("Summon " + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CSM4
							+ new java.text.DecimalFormat("#").format((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CsmSlot4Stack) + "x"));
					entity.getPersistentData().putDouble("moveCost", 0);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 6) {
					entity.getPersistentData().putString("moveDisplay", ("Summon " + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CSM5
							+ new java.text.DecimalFormat("#").format((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CsmSlot5Stack) + "x"));
					entity.getPersistentData().putDouble("moveCost", 0);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 7) {
					entity.getPersistentData().putString("moveDisplay", ("Summon " + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CSM6
							+ new java.text.DecimalFormat("#").format((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CsmSlot6Stack) + "x"));
					entity.getPersistentData().putDouble("moveCost", 0);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 8) {
					entity.getPersistentData().putString("moveDisplay", ("Summon " + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CSM7
							+ new java.text.DecimalFormat("#").format((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CsmSlot7Stack) + "x"));
					entity.getPersistentData().putDouble("moveCost", 0);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 9) {
					entity.getPersistentData().putString("moveDisplay", ("Summon " + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CSM8
							+ new java.text.DecimalFormat("#").format((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CsmSlot8Stack) + "x"));
					entity.getPersistentData().putDouble("moveCost", 0);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 10) {
					entity.getPersistentData().putString("moveDisplay", ("Summon " + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CSM9
							+ new java.text.DecimalFormat("#").format((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CsmSlot9Stack) + "x"));
					entity.getPersistentData().putDouble("moveCost", 0);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 11) {
					entity.getPersistentData().putString("moveDisplay", ("Summon " + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CSM10
							+ new java.text.DecimalFormat("#").format((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CsmSlot10Stack) + "x"));
					entity.getPersistentData().putDouble("moveCost", 0);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 12) {
					entity.getPersistentData().putString("moveDisplay", "Maximum: Uzumaki");
					entity.getPersistentData().putDouble("moveCost", 30);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 13) {
					entity.getPersistentData().putString("moveDisplay", "Womb Profusion");
					entity.getPersistentData().putDouble("moveCost", 45);
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Idle Transfiguration")) {
				entity.getPersistentData().putDouble("maxMoves", 4);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Body Repel");
					entity.getPersistentData().putDouble("moveCost", 5);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
					entity.getPersistentData().putString("moveDisplay", "Soul Multiplicity");
					entity.getPersistentData().putDouble("moveCost", 10);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
					entity.getPersistentData().putString("moveDisplay", "Soul Isomer");
					entity.getPersistentData().putDouble("moveCost", 18);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
					entity.getPersistentData().putString("moveDisplay", "Instant Spirit Body of Distorted Killing");
					entity.getPersistentData().putDouble("moveCost", 25);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 4) {
					entity.getPersistentData().putString("moveDisplay", "Self-Embodiment of Perfection");
					entity.getPersistentData().putDouble("moveCost", 35);
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Boogie Woogie")) {
				entity.getPersistentData().putDouble("maxMoves", 1);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Clap");
					entity.getPersistentData().putDouble("moveCost", 7);
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Ratio")) {
				entity.getPersistentData().putDouble("maxMoves", 1);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Collapse");
					entity.getPersistentData().putDouble("moveCost", 5);
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Auspicious Beasts Summon")) {
				entity.getPersistentData().putDouble("maxMoves", 3);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Kaichi");
					entity.getPersistentData().putDouble("moveCost", 5);
				}
				if (entity.getPersistentData().getDouble("moveNumber") == 2) {
					entity.getPersistentData().putString("moveDisplay", "Reiki");
					entity.getPersistentData().putDouble("moveCost", 10);
				}
				if (entity.getPersistentData().getDouble("moveNumber") == 3) {
					entity.getPersistentData().putString("moveDisplay", "Ryu");
					entity.getPersistentData().putDouble("moveCost", 15);
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Ice Formation")) {
				entity.getPersistentData().putDouble("maxMoves", 4);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Ice Needle");
					entity.getPersistentData().putDouble("moveCost", 6);
				}
				if (entity.getPersistentData().getDouble("moveNumber") == 2) {
					entity.getPersistentData().putString("moveDisplay", "Ice Fall");
					entity.getPersistentData().putDouble("moveCost", 10);
				}
				if (entity.getPersistentData().getDouble("moveNumber") == 3) {
					entity.getPersistentData().putString("moveDisplay", "Frost Calm");
					entity.getPersistentData().putDouble("moveCost", 17);
				}
				if (entity.getPersistentData().getDouble("moveNumber") == 4) {
					entity.getPersistentData().putString("moveDisplay", "Glacial Embrace");
					entity.getPersistentData().putDouble("moveCost", 70);
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Private Pure Love Train")) {
				entity.getPersistentData().putDouble("maxMoves", 5);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Idle Death Gamble");
					entity.getPersistentData().putDouble("moveCost", 5);
				}
				if (entity.getPersistentData().getDouble("moveNumber") == 2) {
					entity.getPersistentData().putString("moveDisplay", "Shutter Doors");
					entity.getPersistentData().putDouble("moveCost", 10);
				}
				if (entity.getPersistentData().getDouble("moveNumber") == 3) {
					entity.getPersistentData().putString("moveDisplay", "Reserve Balls");
					entity.getPersistentData().putDouble("moveCost", 15);
				}
				if (entity.getPersistentData().getDouble("moveNumber") == 4) {
					entity.getPersistentData().putString("moveDisplay", "Container Throw");
					entity.getPersistentData().putDouble("moveCost", 20);
				}
				if (entity.getPersistentData().getDouble("moveNumber") == 5) {
					entity.getPersistentData().putString("moveDisplay", "Pachinko Roll");
					entity.getPersistentData().putDouble("moveCost", 25);
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Missile Fists")) {
				entity.getPersistentData().putDouble("maxMoves", 1);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Fist");
					entity.getPersistentData().putDouble("moveCost", 5);
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Projection Sorcery")) {
				entity.getPersistentData().putDouble("maxMoves", 1);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Frame");
					entity.getPersistentData().putDouble("moveCost", 5);
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Black Bird Manipulation")) {
				entity.getPersistentData().putDouble("maxMoves", 3);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Crow");
					entity.getPersistentData().putDouble("moveCost", 6);
				}
				if (entity.getPersistentData().getDouble("moveNumber") == 2) {
					entity.getPersistentData().putString("moveDisplay", "Scouter Crow");
					entity.getPersistentData().putDouble("moveCost", 10);
				}
				if (entity.getPersistentData().getDouble("moveNumber") == 3) {
					entity.getPersistentData().putString("moveDisplay", "Bird Strike");
					entity.getPersistentData().putDouble("moveCost", 30);
				}
			}
		} else if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Page).equals("Cursed Energy")) {
			CursedEnergySwitchProcedure.execute(entity);
		} else if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Page).equals("Melee")) {
			MeleeSwitchProcedure.execute(entity);
		} else if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Page).equals("Weapon")) {
			WeaponSwitchProcedure.execute(entity);
		} else if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Page).equals("Restricted")) {
			RestrictedSwitchProcedure.execute(entity);
		} else if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Page).equals("Electricity")) {
			CETraitSwitchProcedure.execute(entity);
		}
	}
}
