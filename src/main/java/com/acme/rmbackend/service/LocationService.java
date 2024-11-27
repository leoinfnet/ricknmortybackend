package com.acme.rmbackend.service;

import com.acme.rmbackend.payload.LocationPayload;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Service
public class LocationService {
    public List<LocationPayload> getLocations(){
        return this.dimensionsMap;
    }
    private List<LocationPayload> dimensionsMap = init();
    private List<LocationPayload>  init(){
        List<LocationPayload> locationList = new ArrayList<>();

        // Adicionando os objetos LocationPayload à lista
        locationList.add(new LocationPayload(1, "Abadango"));
        locationList.add(new LocationPayload(2, "Alien Day Spa"));
        locationList.add(new LocationPayload(3, "Alphabetrium"));
        locationList.add(new LocationPayload(4, "Anatomy Park"));
        locationList.add(new LocationPayload(5, "Bepis 9"));
        locationList.add(new LocationPayload(6, "Citadel of Ricks"));
        locationList.add(new LocationPayload(7, "Dorian 5"));
        locationList.add(new LocationPayload(8, "Draygon"));
        locationList.add(new LocationPayload(9, "Earth (C-137)"));
        locationList.add(new LocationPayload(10, "Earth (C-500A)"));
        locationList.add(new LocationPayload(11, "Earth (Chair Dimension)"));
        locationList.add(new LocationPayload(12, "Earth (Evil Ricks Target Dimension)"));
        locationList.add(new LocationPayload(13, "Earth (Fascist Dimension)"));
        locationList.add(new LocationPayload(14, "Earth (Fascist Shrimp Dimension)"));
        locationList.add(new LocationPayload(15, "Earth (Fascist Teddy Bear Dimension)"));
        locationList.add(new LocationPayload(16, "Earth (Giant Telepathic Spiders Dimension)"));
        locationList.add(new LocationPayload(17, "Earth (Phone Dimension)"));
        locationList.add(new LocationPayload(18, "Earth (Pizza Dimension)"));
        locationList.add(new LocationPayload(19, "Earth (Replacement Dimension)"));
        locationList.add(new LocationPayload(20, "Earth (Wasp Dimension)"));
        locationList.add(new LocationPayload(21, "Fantasy World"));
        locationList.add(new LocationPayload(22, "Forbodulon Prime"));
        locationList.add(new LocationPayload(23, "Froopyland"));
        locationList.add(new LocationPayload(24, "Galactic Federation Prison"));
        locationList.add(new LocationPayload(25, "Gazorpazorp"));
        locationList.add(new LocationPayload(26, "Gear World"));
        locationList.add(new LocationPayload(27, "Giants Town"));
        locationList.add(new LocationPayload(28, "Globaflyn"));
        locationList.add(new LocationPayload(29, "Gorgon Quadrant"));
        locationList.add(new LocationPayload(30, "Gramuflack"));
        locationList.add(new LocationPayload(31, "Greasy Grandma World"));
        locationList.add(new LocationPayload(32, "Hamster in Butt World"));
        locationList.add(new LocationPayload(33, "Heist-Con"));
        locationList.add(new LocationPayload(34, "Heistotron Base"));
        locationList.add(new LocationPayload(35, "Hideout Planet"));
        locationList.add(new LocationPayload(36, "Immortality Field Resort"));
        locationList.add(new LocationPayload(37, "Interdimensional Cable"));
        locationList.add(new LocationPayload(38, "Interdimensional Customs"));
        locationList.add(new LocationPayload(39, "Jerryboree"));
        locationList.add(new LocationPayload(40, "Kyles Teenyverse"));
        locationList.add(new LocationPayload(41, "Mega Gargantuan Kingdom"));
        locationList.add(new LocationPayload(42, "Midland Quasar"));
        locationList.add(new LocationPayload(43, "Monogatron Mothership"));
        locationList.add(new LocationPayload(44, "Mount Space Everest"));
        locationList.add(new LocationPayload(45, "Mr. Goldenfolds dream"));
        locationList.add(new LocationPayload(46, "NX-5 Planet Remover"));
        locationList.add(new LocationPayload(47, "Nuptia 4"));
        locationList.add(new LocationPayload(48, "Pawn Shop Planet"));
        locationList.add(new LocationPayload(49, "Planet Squanch"));
        locationList.add(new LocationPayload(50, "Plopstar"));
        locationList.add(new LocationPayload(51, "Pluto"));
        locationList.add(new LocationPayload(52, "Post-Apocalyptic Earth"));
        locationList.add(new LocationPayload(53, "Purge Planet"));
        locationList.add(new LocationPayload(54, "Resort Planet"));
        locationList.add(new LocationPayload(55, "Ricks Battery Microverse"));
        locationList.add(new LocationPayload(56, "Ricks Memories"));
        locationList.add(new LocationPayload(57, "Roy: A Life Well Lived"));
        locationList.add(new LocationPayload(58, "Signus 5 Expanse"));
        locationList.add(new LocationPayload(59, "Snake Planet"));
        locationList.add(new LocationPayload(60, "Snuffles Dream"));
        locationList.add(new LocationPayload(61, "St. Gloopy Noops Hospital"));
        locationList.add(new LocationPayload(62, "Testicle Monster Dimension"));
        locationList.add(new LocationPayload(63, "The Menagerie"));
        locationList.add(new LocationPayload(64, "Unitys Planet"));
        locationList.add(new LocationPayload(65, "Venzenulon 7"));
        locationList.add(new LocationPayload(66, "Vindicators Base"));
        locationList.add(new LocationPayload(67, "Worldenders lair"));
        locationList.add(new LocationPayload(68, "Zeep Xanflorps Miniverse"));
        locationList.add(new LocationPayload(69, "Zigerions Base"));
        locationList.add(new LocationPayload(70, "unknown"));

        return locationList;
    }
}
