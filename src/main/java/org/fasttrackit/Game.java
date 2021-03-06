package org.fasttrackit;

import org.fasttrackit.utils.ScannerUtils;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Track[] tracks = new Track[3];
    private List<Vehicle> competitors = new ArrayList<>();
    private Track selectedTrack;
    private boolean winnerNotKnown = true;
    private int competitorsWithoutFuel = 0;

    public void start () {
        System.out.println("Welcome!");

        initializeTracks();
        displayTracks();

        selectedTrack = getSelectedTrackFromUser();
        System.out.println("Selected track: " + selectedTrack.getName());

        initializeCompetitors();

        while (winnerNotKnown && competitorsWithoutFuel < competitors.size()) {
            playOneRound();
        }

    }

    private void playOneRound(){
        System.out.println("\nNew round");

        // enhanced for (for each)
        for (Vehicle vehicle : competitors) {
            System.out.println("It's " + vehicle.getName() + "'s turn");
            double speed = getAccelerationSpeedFromUser();
            vehicle.accelerate(speed);

            if(selectedTrack.getLength() <= vehicle.getTotalDistance()) {
                System.out.println("The winner is: " + vehicle.getName());
                winnerNotKnown = false;
                break;
            }

            if (vehicle.getFuelLevel() <= 0) {
                competitorsWithoutFuel++;
            }
            System.out.println();
        }
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

    private void initializeCompetitors(){
        int playerCount = getPlayerCountFromUSer();

        for (int i=0; i < playerCount; i++){
            System.out.println("Creating vehicle for player " + (i +1));
            String name = getVehicleNameFromUser();

            Vehicle vehicle = new Vehicle();
            vehicle.setName(name);
            vehicle.setFuelLevel(80);
            vehicle.setMaxSpeed(260);
            vehicle.setMileage(ThreadLocalRandom.current().nextDouble(5, 15));

            competitors.add(vehicle);
        }
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

    private Track getSelectedTrackFromUser() {
        System.out.println("Please select a track.");
        try {
            int trackNumber = ScannerUtils.nextIntAndMoveToNextLine();
            return tracks[trackNumber - 1];
        } catch (InputMismatchException e) {
            throw new RuntimeException("Please enter a number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException("Wrong number entered.");
        } finally {
            System.out.println("Finally block always executed.");
        }


    }

    private String getVehicleNameFromUser() {
        System.out.println("Please enter vehicle name:");
        return ScannerUtils.nextLine();
    }

    private int getPlayerCountFromUSer() {
        System.out.println("Please enter number of players:");
        return ScannerUtils.nextIntAndMoveToNextLine();
    }

    private double getAccelerationSpeedFromUser() {
        System.out.println("Please enter acceleration speed:");

        try {
            return ScannerUtils.nextSingleDouble();
        } catch (InputMismatchException e) {
            System.out.println("You have entered an invalid value. Please try again.");
            // recursion - a method calls itself. Just in exception cases.
            return getAccelerationSpeedFromUser();
        }
    }

}
