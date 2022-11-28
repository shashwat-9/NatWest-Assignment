package com.shashwat.NatwestAssignment;

import com.shashwat.NatwestAssignment.Controller.RockPaperScissor;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NatwestAssignmentApplicationTests {

	@Test
	void contextLoads() {
	}

	Logger logger = LoggerFactory.getLogger(NatwestAssignmentApplicationTests.class);

	@Autowired
	RockPaperScissor rockPaperScissor;

	@Test
	void playVal() {
		logger.info(rockPaperScissor.play("Rock") + " when player gets Rock");
		logger.info(rockPaperScissor.play("Paper") + " when player gets Paper");
		logger.info(rockPaperScissor.play("Scissors") + " when player gets Scissors");
	}

}
