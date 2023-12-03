#ifndef _GOALKEEPER_
#define _GOALKEEPER_

#include "Player.hpp"
#include "Match.hpp"

class Goalkeeper : public Player {

private:
    int numSaves;
    int numGoalsLet;

public:
    Goalkeeper(bool g, const std::string& n, int a, Country * nat) : Player(g, n, a, nat), numSaves(0), numGoalsLet(0) {}

    void updateStats(Match * match) override {
        Player::updateStats(match);

        for (Player* player : match -> getTeamOne() -> getPlayers()) {
            if (player->getName() == getName()) {
                numSaves += rand() % 5;
                numGoalsLet += match -> getGoalTwo();

            }
        }

        for (Player* player : match -> getTeamTwo() -> getPlayers()) {
            if (player -> getName() == getName()) {
                numSaves += rand() % 5;
                numGoalsLet += match -> getGoalOne();

            }
        }
    }

    void printStats() override {
        std::cout << "Estadísitques de " << getName() << ":\n";
        std::cout << "Parades: " << numSaves << "\n";
        std::cout << "Gols encaixats: " << numGoalsLet << "\n";
        
    }
};

#endif