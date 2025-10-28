package com.revision.demo;

import com.revision.demo.history.Knight;
import com.revision.demo.history.RescuingThePrincessQuest;

public class Main {

    public static void main(String[] args) {

        Knight knight = new Knight();

        knight.setQuest( new RescuingThePrincessQuest() );

        knight.goQuest();

    }

}