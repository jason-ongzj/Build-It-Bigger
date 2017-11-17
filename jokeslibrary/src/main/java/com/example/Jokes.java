package com.example;

import java.util.Random;

public class Jokes {

    private static final String[] jokesList = new String[]{
            "Alcohol is a perfect solvent: It dissolves marriages, families and careers.",
            "Don't let your worries get the best of you; remember, Moses started out as a basket case.",
            "Sometimes we expect more from others because we would be willing to do that much more for them.",
            "A diplomat is a man who always remembers a woman's birthday but never remembers her age.",
            "What do you call the security outside of a Samsung Store? Guardians of the Galaxy.",
            "Accidentally pooped my pants in the elevator. I'm taking this shit to a whole new level.",
            "Throwing acid is wrong, in some people's eyes.",
            "Thanks for explaining the word \"many\" to me, it means a lot.",
            "The future, the present and the past walked into a bar. Things got a little tense."
    };

    public static String getJoke(){
        Random random = new Random();
        int randomInt = random.nextInt(jokesList.length);
        return jokesList[randomInt];
    }

    public static String printJokes(){
        String jokes = "";
        for(int i = 0; i <= 10; i++){
            jokes += getJoke();
            jokes += "\n";
        }
        return jokes;
    }
}
