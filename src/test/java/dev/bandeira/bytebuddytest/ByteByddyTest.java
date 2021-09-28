package dev.bandeira.bytebuddytest;

import org.junit.jupiter.api.Test;

import net.bytebuddy.agent.ByteBuddyAgent;

class ByteByddyTest {

	@Test
	void test() throws InterruptedException {
		ByteBuddyAgent.install();
		Thread.sleep(10_000); // Keep test runing for more 10 seconds.
	}

}
