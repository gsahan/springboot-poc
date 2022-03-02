package com.spboot.poc;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class PairprogApplicationTests {

	@BeforeAll
	void runbefore(){
		MockitoAnnotations.openMocks(this);
	}

	@Test
	void first_test() {

	}

}
