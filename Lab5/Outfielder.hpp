#ifndef _OUTFIELDER_
#define _OUTFIELDER_

#include <iostream>
#include <vector>
#include <cstdlib>
#include "Player.hpp"
#include "Country.hpp"
#include "Match.hpp"

class Outfielder : public Player {
private:
    int numTackles;
    int numPasses;
    int numShots;
    int numAssists;
    int numGoals;

public:
    Outfielder(bool g, const std::string &n, int a, Country *nat) : Player(g, n, a, nat), numTackles(0), numPasses(0), numShots(0), numAssists(0), numGoals(0) {}

    void updateStats(Match *match) override {
        Player::updateStats(match);

        int goalsScored = 0;

        numTackles += rand() % 10;
        numPasses += rand() % 60;
        numShots += rand() % 2;
        numAssists += rand() % 1;

        for (Player* player : match -> getScorersOne()) {
            if (player -> getName() == getName()) {
                goalsScored++;

            }
        }

        for (Player* player : match -> getScorersTwo()) {
            if (player -> getName() == getName()) {
                goalsScored++;

            }
        }

        numGoals += goalsScored;
    }

    void printStats() override {
        std::cout << "Estadísitques de " << getName() << ":\n";
        std::cout << "Entrades: " << numTackles << "\n";
        std::cout << "Passes: " << numPasses << "\n";
        std::cout << "Dispars: " << numShots << "\n";
        std::cout << "Assistències: " << numAssists << "\n";
        std::cout << "Gols: " << numGoals << "\n";

    }
};

#endif // _OUTFIELDER_