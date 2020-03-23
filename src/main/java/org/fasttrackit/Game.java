package org.fasttrackit;

import java.util.Scanner;

public class Game {

    private Track[] tracks = new Track[3];



    public void start () {
        System.out.println("Welcome!");
        int playerCount = getPlayerCountFromUSer();
        initializeTracks();
        displayTracks();
    }

    private void initializeTracks() {
        Track track1 = new Track();
        track1.setName("Imola");
        track1.setLength(3500);

        tracks[0] = track1;

        Track track2 = new Track();
        track2.setName("Suzuka");
        track2.setLength(4100);

        tracks[1] = track2;

    }

    private void displayTracks() {
        System.out.println("Available tracks:");

        // classic for loop
        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] != null) {
                System.out.println((i + 1) + ". " + tracks[i].getName() + " - " + tracks[i].getLength());
            }
        }
    }

    private String getVehicleNameFromUser() {
        System.out.println("Please enter vehicle name:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private int getPlayerCountFromUSer() {
        System.out.println("Please enter number of players:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
