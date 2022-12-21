import based.*;
import creatures.Devil;
import creatures.Human;
import creatures.Monster;
import creatures.Phantom;
import enums.Adjectives;
import enums.Climate;
import enums.Emotion;
import enums.Relations;
import exceptions.TimeInvalidFormatException;
import helper.Printer;
import locations.*;
import locations.Maze.Peak;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Human we = new Human("We");
        System.out.println(we.getClass());
        Class clazz;
        we.scream(new ArrayList<>() {
            {
                add(Emotion.DELIGHT);
                add(Emotion.WONDER);
                add(Emotion.HORROR);
                add(Emotion.MISTRUST);
            }
        });
        Human.Knowledge knowledge = we.new Knowledge("some knowledge", true);
        Printer.print(we, "had", knowledge, "with limiting feelings?..", knowledge.isLimitingFeelings());
        Town colorado = new Town("Colorado");
        GardenOfTheGods garden = new GardenOfTheGods("Gods Garden", colorado);
        we.remember(new Thought("Strange form", new Thought("Stone shape", garden)));

        Thing<?> symmetry = new Thing("Symmetry", Emotion.WONDER);
        Thing<?> wind = new Thing("wind");
        Desert desert = new Desert("Arizona desert");
        Desert.Cliff cliff = desert.new Cliff("cliff", wind, symmetry);
        we.remember(new Thought("Wonder Symmetry", cliff));

        MountainRange crazyMountain = new MountainRange("Mountain range",
                Adjectives.CRAZY);
        MountainRange.Mirage mirage = crazyMountain.new Mirage("mirage");
        we.confuse(new Sight(), mirage);
        Maze<?> stoneMaze = new Maze("Stone maze", Adjectives.GIANT, Adjectives.AESTHETIC);
        Peak peak = stoneMaze.new Peak("peak");
        Maze.Snow snow = stoneMaze.new Snow("Snow", "40-50", "foots", Adjectives.ETERNAL);
        Desert coldDesert = new Desert("Desert", stoneMaze, Adjectives.GIANT, Adjectives.COLD);
        we.observe(crazyMountain, new Time("last morning"));
        we.observe(coldDesert);
        //------------------------------//
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
        try {
            Time BeforeHumans = new Time(0, "years before", humanity);
            StoneJungles stoneJungles = new StoneJungles("inside Stone Jungles", Adjectives.ARTIFICIAL);
            Plateau plateau = new Plateau.PlateauBuilder()
                    .description(Adjectives.ANCIENT, Adjectives.COLD)
                    .fromTime(BeforeHumans)
                    .height(20000)
                    .innerPlace(stoneJungles)
                    .unit("feet at sea level")
                    .climate(Climate.NOT_FOR_LIVE)
                    .build();
            Printer.print(plateau);

        } catch (TimeInvalidFormatException e) {
            e.printStackTrace();
        }
        Nature notCreator = new Nature("Nature is not creator");
        MedievalBuildings buildings = new MedievalBuildings("Cubes and castle's Walls", notCreator);
        Thought thought = new Thought(buildings);
        humanity.setThought(thought);
        Time before = new Time(Relations.BEFORE.text(), humanity);
        humanity.think(before);
        Printer.print(thought, before);

        Continent continent = new Continent("Continent", Climate.FOREVER_COLD);
        Time whenColdHasStarted = new Time(Relations.WHEN.text(), continent);
        Printer.print(whenColdHasStarted, "Is human similar to monkey?...",
                humanity.isSimilarSpecificTime(whenColdHasStarted));

        Thing powerOfMind = new Thing("Power Of Mind");
        Thought thoughtAboutPowerOfMind = new Thought(powerOfMind);
        thoughtAboutPowerOfMind.setDoubts(true);
        Nature trueNature = new Nature("Real Nature");
        trueNature.setTruth(true);

        Maze maze = new Maze("Maze", trueNature, Adjectives.GIANT);
        Thought thoughtAboutMaze = new Thought(maze);
        Printer.print(thoughtAboutPowerOfMind, "have doubts?...", thoughtAboutPowerOfMind.isDoubts(),
                thoughtAboutMaze, Relations.WITH.text(), maze.giveOpinion());

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
        //------------------------------//
        MedievalBuildings stoneTowersAndWalls = new MedievalBuildings("Stone Towers and Walls", true) {
            @Override
            public String toString() {
                return Printer.setSpaces(getName(), "is density high?..", String.valueOf(isDensityHigh()));
            }
        };
        Monster creature = new Monster("creation");
        creature.sleep(stoneTowersAndWalls, new Time(100000, "years"));

        we.say("Corona Mundi-- Крыша Мира...")
                .sayDelirium()
                .sayDelirium()
                .sayDelirium()
                .sayDelirium()
                .sayDelirium();

        Sight _sight = new Sight(Adjectives.CRAZY);
        we.setDizzy(true, new Thought(_sight));

        ArrayList<Thought> myths = new ArrayList<>();
        myths.add(new Thought(new Location("Plateau of Leng", Adjectives.DEMONIC) {
        }));
        myths.add(new Thought(new MountainRange("Himalayas", new Human("Snowman"))));
        Thing fragment = new Thing("Pnakotic Fragments");
        fragment.setCreator(new Human("non-human"));
        myths.add(new Thought(fragment));
        Humanity сthulhuСult = new Humanity(100);
        myths.add(new Thought(сthulhuСult));
        Monster tsathoggua = new Monster("Tsathoggua");
        Monster mi_go = new Monster("Mi-go");
        Monster starAliens = new Monster("Stars Aliens", Adjectives.FORMLESS);
        // вымышленная страна у Антарктиды
        myths.add(new Thought("hyperborea legend", tsathoggua));
        myths.add(new Thought("hyperborea legend", mi_go));
        myths.add(new Thought("hyperborea legend", starAliens));
        myths.add(new Thought(new Thing<>("Necronomicon"))); // книга запретных заклинаний
        Continent antarctica = new Continent("Antarctica's edge", Climate.NOT_FOR_LIVE);
        Continent.Myths localLegends = antarctica.new Myths("local myths:",
                new ArrayList<>(Arrays.asList(Adjectives.ANCIENT, Adjectives.MYSTERIOUS)));
        localLegends.setMyths(myths);
        Human me = new Human("I");
        me.think(new Thought(antarctica));
        me.think(new Thought(localLegends));


        Thing<?> thing = new Thing<>("");

    }
}
