#ifndef _PLAYER_
#define _PLAYER_

#include "Country.hpp"
#include "Match.hpp"

class Player {

protected:
    bool female;
    std::string name;
    int age;
    Country *country;
    int numMatches;
    
public:
    Player(bool f, std::string n, int a, Country *nat) {
        female = f;
        name = n;
        country = nat;

    }

    bool isFemale() {
        return female;

    }

    std::string getName() {
        return name;

    }

    int getAge() {
        return age;

    }

    Country *getNationality() {
        return country;

    }

    int getNumMatches() {
        return numMatches;

    }
    
    virtual void updateStats(Match *m) = 0;

    virtual void printStats() = 0;

};

#endif