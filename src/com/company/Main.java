package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


        ArrayList<CharacterClass> classes = new ArrayList<>();
        classes.add(new CharacterClass("Berserker", false, false,
                false, false, false, false, false, true, false, true, false));
        classes.add(new CharacterClass("Paladin", true, false,
                false, false, false, false, false, true, false, false, false));
        classes.add(new CharacterClass("Striker", false, false,
                false, false, false, false, false, true, false, false, true));
        classes.add(new CharacterClass("Wardancer", false, false,
                false, false, false, false, false, false, false, false, true));
        classes.add(new CharacterClass("Scrapper", false, false,
                false, false, false, false, false, false, false, false, true));
        classes.add(new CharacterClass("Soulfist", false, true,
                true, false, true, false, false, false, false, false, true));
        classes.add(new CharacterClass("Gunslinger", false, false,
                false, false, true, false, false, false, false, false, false));
        classes.add(new CharacterClass("Artilerist", false, false,
                false, false, true, false, false, true, false, false, false));
        classes.add(new CharacterClass("Deadeye", false, false,
                false, false, true, false, false, true, false, false, false));
        classes.add(new CharacterClass("Sharpshooter", false, false,
                false, false, true, true, false, true, false, false, false));
        classes.add(new CharacterClass("Bard", true, true,
                false, false, true, false, false, false, false, false, false));
        classes.add(new CharacterClass("Sorceress", false, true,
                false, false, true, false, false, false, false, false, false));
        classes.add(new CharacterClass("Shadowhunter", false, false,
                false, false, false, false, true, false, true, false, false));
        classes.add(new CharacterClass("Deathblade", false, false,
                false, false, false, false, true, true, false, false, false));
        classes.add(new CharacterClass("Gunlancer", false, false,
                false, true, false, false, false, true, false, false, false));

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Hi, i guess you want to play Lost Ark. Am i right? Write 1 if yes and 2 if no");
        String userWantsToPlay = scanner.nextLine();

        System.out.println("Here is the list of classes available in this game:");
        System.out.println(Arrays.toString(classes.toArray()));

        if (userWantsToPlay.equals("2")) {
            System.out.println("See you later then!");
            return;
        }

        System.out.println("Are you a gambler? I can roll a character for you! Write 1 if yes and 2 if no.");
        String isGambler = scanner.nextLine();
        if (isGambler.equals("1")) {
            printRandomClass(classes);
            return;
        }

        System.out.println("Have you ever watched Dragon Ball? Would you like to do some Ka-me-ha-me-ha? Write 1 if yes and 2 if no.");
        String kamehameha = scanner.nextLine();

        if (kamehameha.equals("1")) {
            classes.removeIf(x -> !x.doesKameHameHa);
        } else {
            classes.removeIf(x -> x.doesKameHameHa);
        }
        if (printIfOnlyOneClassLeft(classes)) {
            return;
        }

        System.out.println("Are you a tough guy or girl? Maybe you would like to play tank class? Write 1 if yes and 2 if no.");
        String wouldTank = scanner.nextLine();

        if (wouldTank.equals("1")) {
            classes.removeIf(x -> !x.isTank);

        } else {
            classes.removeIf(x -> x.isTank);
        }
        if (printIfOnlyOneClassLeft(classes)) {
            return;
        }

        System.out.println("Would you like to play a support class? Write 1 if yes or 2 if no.");
        String supportOrNot = scanner.nextLine();

        if (supportOrNot.equals("1")) {
            classes.removeIf(x -> !x.isSupport);

            printRandomClass(classes);
            return;

        } else {
            classes.removeIf(x -> x.isSupport);
        }

        if (printIfOnlyOneClassLeft(classes)) {
            return;
        }
        System.out.println("Would you like to play ranged or melee class? Write 1 if ranged and 2 if melee.");
        String rangedOrNot = scanner.nextLine();

        if (rangedOrNot.equals("1")) {
            classes.removeIf(x -> !x.isRanged);

            System.out.println("Would you like to play caster class? Write 1 if yes and 2 if no.");
            String caster = scanner.nextLine();
            if (caster.equals("1")) {
                classes.removeIf(x -> !x.isCaster);

            } else {
                classes.removeIf(x -> x.isCaster);
            }

            System.out.println("Are you wannabe Robin Hood? Write 1 if yes and 2 if no.");
            String robinHood = scanner.nextLine();
            if (robinHood.equals("1")) {
                classes.removeIf(x -> !x.useBow);
            } else {
                classes.removeIf((x -> x.useBow));
            }
            if (printIfOnlyOneClassLeft(classes)) {
                return;
            }

        } else {
            classes.removeIf(x -> x.isRanged);

            System.out.println("Are you an edgelord???????????? Write \"EDGE\" if yes and 2 if no.");
            String edgeLord = scanner.nextLine();
            if (edgeLord.equals("EDGE")) {
                classes.removeIf(x -> !x.isEdgeLord);
            } else {
                classes.removeIf(x -> x.isEdgeLord);
            }

            System.out.println("Would you like to play Assasin? Write 1 if yes or 2 if not.");
            String assasin = scanner.nextLine();
            if (assasin.equals("1")) {
                classes.removeIf(x -> !x.isAssasin);
            } else {
                classes.removeIf(x -> x.isAssasin);
            }

        }

        if (printIfOnlyOneClassLeft(classes)) {
            return;
        }



        System.out.println("I am already tired. This might be my last try. Do you like... BIG SWORDS? Type 1 if yes and 2 if no.");
        String bigSword = scanner.nextLine();
        if (bigSword.equals("yes")) {
            classes.removeIf(x -> !x.haveBigSword);
        } else {
            classes.removeIf(x -> x.haveBigSword);
        }
        if (printIfOnlyOneClassLeft(classes)) {
            return;
        }

        printRandomClass(classes);


    }

    private static void printRandomClass(ArrayList<CharacterClass> classes) throws IOException {
        Random random = new Random();
        int numberOfIndex = random.nextInt(classes.size());
        System.out.println(classes.get(numberOfIndex));
        Path path = Paths.get("D:\\Projekty\\untitled7\\classDescriptions\\" + classes.get(numberOfIndex).className + ".txt");
        String characterDescription = new String(Files.readAllBytes(path));
        System.out.println(characterDescription);

    }

    private static boolean printIfOnlyOneClassLeft(ArrayList<CharacterClass> classes) throws IOException {


        if (classes.size() == 1) {

            Path path = Paths.get("D:\\Projekty\\untitled7\\classDescriptions\\" + classes.get(0).className + ".txt");
            String characterDescription = new String(Files.readAllBytes(path));

            System.out.print("Congratulations, I have a perfect class for you. You should play ");
            System.out.print(classes.get(0));
            System.out.println(classes.get(0).className);
            System.out.println(characterDescription);
            return true;
        }
        return false;
    }
}

