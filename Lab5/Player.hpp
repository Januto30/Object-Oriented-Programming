#ifndef _PLAYER_
#define _PLAYER_

#include "Country.hpp"
class Match;

class Player {

protected:
    bool female;
    std::string name;
    int age;
    Country * country;
    int numMatches;
    
public:
    Player(bool f, std::string n, int a, Country * nac) {
        female = f;
        name = n;
        country = nac;

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

    Country * getNationality() {
        return country;

    }

    int getNumMatches() {
        return numMatches;

    }
    
    virtual void updateStats(Match * m) = 0;

    virtual void printStats() = 0;

};

#endif _PLAYER_