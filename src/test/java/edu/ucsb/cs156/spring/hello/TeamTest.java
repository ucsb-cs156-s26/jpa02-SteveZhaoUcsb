package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
     @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

     @Test
    public void test_equals_sameObject() {
        assertEquals(true, team.equals(team));
    }

    @Test
    public void test_equals_differentClass() {
        assertEquals(false, team.equals("not a team"));
    }

    @Test
    public void test_equals_sameNameAndMembers() {
        Team team1 = new Team("s26-15");
        team1.addMember("Leo");
        team1.addMember("Xuanbo");
        team1.addMember("Katelyn");
        team1.addMember("Kristopher");
        team1.addMember("Joy");
        team1.addMember("Mikaela");

        Team team2 = new Team("s26-15");
        team2.addMember("Leo");
        team2.addMember("Xuanbo");
        team2.addMember("Katelyn");
        team2.addMember("Kristopher");
        team2.addMember("Joy");
        team2.addMember("Mikaela");

        assertEquals(true, team1.equals(team2));
    }

    @Test
    public void test_equals_sameNameDifferentMembers() {
        Team team1 = new Team("s26-15");
        team1.addMember("Leo");
        team1.addMember("Xuanbo");
        team1.addMember("Katelyn");
        team1.addMember("Kristopher");
        team1.addMember("Joy");
        team1.addMember("Mikaela");

        Team team2 = new Team("s26-15");
        team2.addMember("Leo");
        team2.addMember("Xuanbo");

        assertEquals(false, team1.equals(team2));
    }

    @Test
    public void test_equals_differentName() {
        Team team1 = new Team("s26-15");
        team1.addMember("Leo");
        team1.addMember("Xuanbo");
        team1.addMember("Katelyn");
        team1.addMember("Kristopher");
        team1.addMember("Joy");
        team1.addMember("Mikaela");

        Team team2 = new Team("different-name");
        team2.addMember("Leo");
        team2.addMember("Xuanbo");
        team2.addMember("Katelyn");
        team2.addMember("Kristopher");
        team2.addMember("Joy");
        team2.addMember("Mikaela");

        assertEquals(false, team1.equals(team2));
    }

    @Test
    public void test_hashCode() {
        Team team = new Team("s26-15");
        team.addMember("Leo");
        team.addMember("Xuanbo");
        team.addMember("Katelyn");
        team.addMember("Kristopher");
        team.addMember("Joy");
        team.addMember("Mikaela");

        int result = team.hashCode();
        int expectedResult = -539547713; // replace after first test run

        assertEquals(expectedResult, result);
    }
}
