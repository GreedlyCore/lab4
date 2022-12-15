


import based.*;
import creatures.*;
import enums.*;
import helper.*;
import locations.*;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Sight sight = new Sight(Adjectives.SCARY);
        Impression impression = new Impression(sight);
        impression.setDescribed(false);
        Printer.print(impression);


        Nature nature = new Nature();
        nature.generateLaws();
        Devil devil = new Devil(nature);
        devil.destroyLaws();
        Printer.print(devil);



        Humanity humanity = new Humanity(1000);
        humanity.setAppeared(false);
        Time BeforeHumans = new Time(500000, "years before", humanity);
        StoneJungles stoneJungles = new StoneJungles("inside Stone Jungles", Adjectives.ARTIFICAL);
        Plateau plateau = new Plateau.PlateauBuilder()
                .description(Adjectives.ANCIENT, Adjectives.COLD)
                .fromTime(BeforeHumans)
                .height(20000)
                .innerPlace(stoneJungles)
                .unit("feet at sea level")
                .climate(Climate.NOT_FOR_LIVE)
                .build();
        //Plateau plateau = Plateau.getInstance();
        Printer.print(plateau);

        Nature notCreator = new Nature("Nature is not creator");
        MedievalBuildings buildings = new MedievalBuildings("Cubes and castle's Walls", notCreator);
        Thought thought = new Thought(buildings);
        humanity.setThought(thought);
        Time before = new Time(Relations.BEFORE.text(), humanity);
        humanity.think(before);
        Printer.print(thought, before);

        Continent continent = new Continent("Continent", Climate.FOREVER_COLD);
        Time whenColdhasStarted = new Time(Relations.WHEN.text(), continent);
        Printer.print(whenColdhasStarted, "Is human similar to monkey?...",
                humanity.isSimilarSpecificTime(whenColdhasStarted));

        Thing powerOfMind = new Thing("Power Of Mind");
        Thought thoughtAboutPowerOfMind = new Thought(powerOfMind);
        thoughtAboutPowerOfMind.setDoubts(true);
        Nature trueNature = new Nature("Real Nature");
        trueNature.setTruth(true);

        Maze maze = new Maze("Maze", trueNature, Adjectives.GIANT);

        System.out.println(maze.giveOpinion());
        Thought thoughtAboutMaze = new Thought(maze);
        Printer.print(thoughtAboutPowerOfMind, "have doubts?...", thoughtAboutPowerOfMind.isDoubts(),
                maze, thoughtAboutMaze, Relations.WITH.text(), maze.giveOpinion());

        Town oldTown = new Town(Adjectives.SCARY, Adjectives.OLD);
        Time oldTimes = new Time(Relations.BEFORE.text(), oldTown);
        Town townNow = new Town(Adjectives.SCARY);
        oldTimes.getObject().equals(townNow);
        Thing reality = new Thing("Reality", Adjectives.OBJECTIVE, Adjectives.INESCAPABLE);
        Printer.print(oldTimes, reality);

        Thing justification = new Thing("Justification", Adjectives.OBJECTIVE);
        Thought obsession = new Thought("obsession", justification);
        Thing dust = new Thing("dusty", Adjectives.COLD);
        Cloud clouds = new Cloud("clouds", dust);
        Monster monster = new Monster("Monster", Adjectives.STONE, Adjectives.OLD);
        Printer.print(justification, monster.beNoticedInSpesificPlace(new MountainRange("Mountains")),
                monster.reflectFrom(clouds));

        Phantom strangePhantom = new Phantom("Strange Phantom");
        Phantom originalPhantom = new Phantom("Original Phantom");
        Printer.print(originalPhantom, strangePhantom, "Are they the same?..", strangePhantom.equals(originalPhantom));

        // reality > dream (scariest)
        Dream dream = new Dream("dream");
        // dream is less scary&dangerous
        Printer.print("Compare...", reality, dream, "differences..",
                dream.checkDifferenceSpecificThing(reality));

    }
}
