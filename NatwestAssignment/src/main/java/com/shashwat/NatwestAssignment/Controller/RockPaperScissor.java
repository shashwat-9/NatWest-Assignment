package com.shashwat.NatwestAssignment.Controller;

import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RockPaperScissor {

    Logger logger = LoggerFactory.getLogger(RockPaperScissor.class);

    final String[] options = new String[] {"Rock", "Paper", "Scissors"};

    @ApiOperation("This is the rest endpoint to play the game\n" +
            "Acceptable choices are \"Rock\", \"Paper\" and \"Scissors\" (mind the cases)\n"
            + "The computer generates a random number and picks up a choice\n"
    )

    @GetMapping("/play")
    public String play(@RequestParam String choice) {

        Random random = new Random();

        int computerMove = random.nextInt(3);

        logger.info("Computer generated "+ options[computerMove]);

        switch (choice) {
            case "Rock":
                if (computerMove == 2) { //Scissor
                    return "Player wins";
                } else if (computerMove == 1) { //Paper
                    return "Computer wins";
                } else {
                    return "It is a tie";
                }
            case "Paper":
                if (computerMove == 0) {    //Rock
                    return "Player Wins";
                } else if (computerMove == 2) {    //Scissor
                    return "Computer Wins";
                } else {
                    return "It is a tie";
                }
            case "Scissors":
                if (computerMove == 0) {    //Rock
                    return "Computer Wins";
                } else if (computerMove == 1) {   //Paper
                    return "Player Wins";
                } else {
                    return "It is a tie";
                }
        }

        logger.warn("The passed parameter isn't as per requirement");
        return "INVALID CHOICE";
    }
}
