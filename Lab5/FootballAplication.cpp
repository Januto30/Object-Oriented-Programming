#include <iostream>
#include <stdio.h>
#include "Outfielder.hpp"
#include "Goalkeeper.hpp"

int main() {
    // Countries
    Country* spain = new Country("España");
    Country* argentina = new Country("Argentina");
    Country* brasil = new Country("Brasil");
    Country* uruguay = new Country("Uruguay");
    Country* croatia = new Country("Croacia");
    Country* germany = new Country("Alemania");
    Country* portugal = new Country("Portugal");

    // Players
    Player* player1 = new Outfielder(false, "Lionel Messi", 36, argentina);
    Player* player2 = new Outfielder(false, "Neymar", 23, brasil);
    Player* player3 = new Outfielder(false, "Luis Suarez", 28, uruguay);
    Player* player4 = new Outfielder(false, "Rakitic", 27, croatia);
    Player* player5 = new Outfielder(false, "Pique", 28, spain);
    Player* player6 = new Outfielder(false, "Iniesta", 31, spain);
    Player* player7 = new Goalkeeper(false, "Ter Stegen", 23, germany);

    Player* player8 = new Outfielder(false, "Sergio Ramos", 31, spain);
    Player* player9 = new Outfielder(false, "Cristiano Ronaldo", 32, portugal);
    Player* player10 = new Outfielder(false, "Vinicius", 23, brasil);
    Player* player11 = new Outfielder(false, "Fede Valverde", 25, uruguay);
    Player* player12 = new Outfielder(false, "Modric", 32, croatia);
    Player* player13 = new Outfielder(false, "Kroos", 27, germany);
    Player* player14 = new Goalkeeper(false, "Casillas", 29, spain);

    // TEAMS
    Team* barcelona = new Team("Barcelona", spain, Team::Gender::MALE);
    Team* realMadrid = new Team("Real Madrid", spain, Team::Gender::MALE);

    barcelona -> addPlayer(player1);
    barcelona -> addPlayer(player2);
    barcelona -> addPlayer(player3);
    barcelona -> addPlayer(player4);
    barcelona -> addPlayer(player5);
    barcelona -> addPlayer(player6);
    barcelona -> addPlayer(player7);

    realMadrid -> addPlayer(player8);
    realMadrid -> addPlayer(player9);
    realMadrid -> addPlayer(player10);
    realMadrid -> addPlayer(player11);
    realMadrid -> addPlayer(player12);
    realMadrid -> addPlayer(player13);
    realMadrid -> addPlayer(player14);

    Match* match = new Match(barcelona, realMadrid);

    match -> simulateMatch();

    match -> printMatch();

    player7 -> updateStats(match);
    player7 -> printStats();

    player1 -> updateStats(match);
    player1 -> printStats();

    return 0;
}