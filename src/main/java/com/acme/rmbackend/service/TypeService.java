package com.acme.rmbackend.service;

import com.acme.rmbackend.payload.TypePayload;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TypeService {
    private List<TypePayload> getTypes(){
        return this.dimensionsMap;
    }
    private final List<TypePayload> dimensionsMap = init();
    private List<TypePayload> init(){
        List<TypePayload> creatureList = new ArrayList<>();

        // Preenchendo a lista com objetos TypePayload
        creatureList.add(new TypePayload(1, "Alligator-Person"));
        creatureList.add(new TypePayload(2, "Alphabetrian"));
        creatureList.add(new TypePayload(3, "Amoeba-Person"));
        creatureList.add(new TypePayload(4, "Animal"));
        creatureList.add(new TypePayload(5, "Bepisian"));
        creatureList.add(new TypePayload(6, "Bird-Person"));
        creatureList.add(new TypePayload(7, "Blue ape alien"));
        creatureList.add(new TypePayload(8, "Boobie buyer reptilian"));
        creatureList.add(new TypePayload(9, "Boobloosian"));
        creatureList.add(new TypePayload(10, "Bread"));
        creatureList.add(new TypePayload(11, "Cat"));
        creatureList.add(new TypePayload(12, "Cat controlled dead lady"));
        creatureList.add(new TypePayload(13, "Cat-Person"));
        creatureList.add(new TypePayload(14, "Caterpillar"));
        creatureList.add(new TypePayload(15, "Centaur"));
        creatureList.add(new TypePayload(16, "Chair"));
        creatureList.add(new TypePayload(17, "Clone"));
        creatureList.add(new TypePayload(18, "Cone-nippled alien"));
        creatureList.add(new TypePayload(19, "Conjoined twin"));
        creatureList.add(new TypePayload(20, "Corn-person"));
        creatureList.add(new TypePayload(21, "Cromulon"));
        creatureList.add(new TypePayload(22, "Cronenberg"));
        creatureList.add(new TypePayload(23, "Cyborg"));
        creatureList.add(new TypePayload(24, "Demon"));
        creatureList.add(new TypePayload(25, "Dog"));
        creatureList.add(new TypePayload(26, "Doopidoo"));
        creatureList.add(new TypePayload(27, "Dragon"));
        creatureList.add(new TypePayload(28, "Drumbloxian"));
        creatureList.add(new TypePayload(29, "Dummy"));
        creatureList.add(new TypePayload(30, "Eat shiter-Person"));
        creatureList.add(new TypePayload(31, "Eel"));
        creatureList.add(new TypePayload(32, "Elephant-Person"));
        creatureList.add(new TypePayload(33, "Fish-Person"));
        creatureList.add(new TypePayload(34, "Flansian"));
        creatureList.add(new TypePayload(35, "Floop Floopian"));
        creatureList.add(new TypePayload(36, "Fly"));
        creatureList.add(new TypePayload(37, "Game"));
        creatureList.add(new TypePayload(38, "Garblovian"));
        creatureList.add(new TypePayload(39, "Gazorpian"));
        creatureList.add(new TypePayload(40, "Gazorpian reproduction robot"));
        creatureList.add(new TypePayload(41, "Gear-Person"));
        creatureList.add(new TypePayload(42, "Genetic experiment"));
        creatureList.add(new TypePayload(43, "Giant"));
        creatureList.add(new TypePayload(44, "Giant Cat Monster"));
        creatureList.add(new TypePayload(45, "God"));
        creatureList.add(new TypePayload(46, "Goddess"));
        creatureList.add(new TypePayload(47, "Gramuflackian"));
        creatureList.add(new TypePayload(48, "Grandma"));
        creatureList.add(new TypePayload(49, "Greebybobe"));
        creatureList.add(new TypePayload(50, "Gromflomite"));
        creatureList.add(new TypePayload(51, "Hairy alien"));
        creatureList.add(new TypePayload(52, "Hammerhead-Person"));
        creatureList.add(new TypePayload(53, "Hivemind"));
        creatureList.add(new TypePayload(54, "Hole"));
        creatureList.add(new TypePayload(55, "Hologram"));
        creatureList.add(new TypePayload(56, "Human Gazorpian"));
        creatureList.add(new TypePayload(57, "Human with a flower in his head"));
        creatureList.add(new TypePayload(58, "Human with antennae"));
        creatureList.add(new TypePayload(59, "Human with ants in his eyes"));
        creatureList.add(new TypePayload(60, "Human with baby legs"));
        creatureList.add(new TypePayload(61, "Human with giant head"));
        creatureList.add(new TypePayload(62, "Human with tusks"));
        creatureList.add(new TypePayload(63, "Human-Snake hybrid"));
        creatureList.add(new TypePayload(64, "Interdimensional gaseous being"));
        creatureList.add(new TypePayload(65, "Jellybean"));
        creatureList.add(new TypePayload(66, "Korblock"));
        creatureList.add(new TypePayload(67, "Krootabulan"));
        creatureList.add(new TypePayload(68, "Larva alien"));
        creatureList.add(new TypePayload(69, "Leprechaun"));
        creatureList.add(new TypePayload(70, "Light bulb-Alien"));
        creatureList.add(new TypePayload(71, "Little Human"));
        creatureList.add(new TypePayload(72, "Lizard"));
        creatureList.add(new TypePayload(73, "Lizard-Person"));
        creatureList.add(new TypePayload(74, "Lobster-Alien"));
        creatureList.add(new TypePayload(75, "Mannie"));
        creatureList.add(new TypePayload(76, "Meeseeks"));
        creatureList.add(new TypePayload(77, "Mega Gargantuan"));
        creatureList.add(new TypePayload(78, "Mexican"));
        creatureList.add(new TypePayload(79, "Microverse inhabitant"));
        creatureList.add(new TypePayload(80, "Miniverse inhabitant"));
        creatureList.add(new TypePayload(81, "Monogatron"));
        creatureList.add(new TypePayload(82, "Monster"));
        creatureList.add(new TypePayload(83, "Mortys toxic side"));
        creatureList.add(new TypePayload(84, "Mytholog"));
        creatureList.add(new TypePayload(85, "Nano Alien"));
        creatureList.add(new TypePayload(86, "Necrophiliac"));
        creatureList.add(new TypePayload(87, "Numbericon"));
        creatureList.add(new TypePayload(88, "Octopus-Person"));
        creatureList.add(new TypePayload(89, "Old Amazons"));
        creatureList.add(new TypePayload(90, "Omniscient being"));
        creatureList.add(new TypePayload(91, "Organic gun"));
        creatureList.add(new TypePayload(92, "Parasite"));
        creatureList.add(new TypePayload(93, "Phone"));
        creatureList.add(new TypePayload(94, "Phone-Person"));
        creatureList.add(new TypePayload(95, "Pickle"));
        creatureList.add(new TypePayload(96, "Pizza"));
        creatureList.add(new TypePayload(97, "Plutonian"));
        creatureList.add(new TypePayload(98, "Pripudlian"));
        creatureList.add(new TypePayload(99, "Rat"));
        creatureList.add(new TypePayload(100, "Ricks toxic side"));
        creatureList.add(new TypePayload(101, "Ring-nippled alien"));
        creatureList.add(new TypePayload(102, "Robot"));
        creatureList.add(new TypePayload(103, "Robot-Crocodile hybrid"));
        creatureList.add(new TypePayload(104, "Scrotian"));
        creatureList.add(new TypePayload(105, "Self-aware arm"));
        creatureList.add(new TypePayload(106, "Sentient ant colony"));
        creatureList.add(new TypePayload(107, "Shapeshifter"));
        creatureList.add(new TypePayload(108, "Shimshamian"));
        creatureList.add(new TypePayload(109, "Shrimp"));
        creatureList.add(new TypePayload(110, "Slug"));
        creatureList.add(new TypePayload(111, "Snail alien"));
        creatureList.add(new TypePayload(112, "Snake"));
        creatureList.add(new TypePayload(113, "Stair goblin"));
        creatureList.add(new TypePayload(114, "Superhuman"));
        creatureList.add(new TypePayload(115, "Superhuman (Ghost trains summoner)"));
        creatureList.add(new TypePayload(116, "Teddy Bear"));
        creatureList.add(new TypePayload(117, "Teenyverse inhabitant"));
        creatureList.add(new TypePayload(118, "Tentacle alien"));
        creatureList.add(new TypePayload(119, "The Devil"));
        creatureList.add(new TypePayload(120, "Time God"));
        creatureList.add(new TypePayload(121, "Tinymouth"));
        creatureList.add(new TypePayload(122, "Toy"));
        creatureList.add(new TypePayload(123, "Traflorkian"));
        creatureList.add(new TypePayload(124, "Trunk-Person"));
        creatureList.add(new TypePayload(125, "Tumblorkian"));
        creatureList.add(new TypePayload(126, "Tuskfish"));
        creatureList.add(new TypePayload(127, "Unknown-nippled alien"));
        creatureList.add(new TypePayload(128, "Vampire"));
        creatureList.add(new TypePayload(129, "Wasp"));
        creatureList.add(new TypePayload(130, "Zigerion"));
        creatureList.add(new TypePayload(131, "Zombodian"));
        return creatureList;
    }

    public List<TypePayload> filter(String criteria){
       return getTypes()
               .stream()
               .filter(item -> item.name().toLowerCase().startsWith(criteria.toLowerCase()))
               .toList();
    }

    public List<TypePayload> getAll() {
        return getTypes();
    }
}
