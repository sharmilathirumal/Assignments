package org.example;

public class Voter {
    int voterId;
    String name;
    int age;

    public Voter(int voter_id,String voter_name,int voter_age) throws VoterException {
        if(voter_age<18) {
            throw new VoterException("invalid age for voter");
        }
        this.voterId =voter_id;
        this.name =voter_name;
        this.age = voter_age;
    }
}
