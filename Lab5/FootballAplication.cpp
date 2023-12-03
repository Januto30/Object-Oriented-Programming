#include <iostream>
#include "Outfielder.hpp"
#include "Goalkeeper.hpp"

int main() {
    // Countries
    Country spain("España");
    Country argentina("Argentina");
    Country brasil("Brasil");
    Country uruguay("Uruguay");
    Country croatia("Croacia");
    Country germany("Alemania");
    Country portugal("Portugal");

    // Players
    Outfielder player1(false, "Lionel Messi", 36, &argentina);
    Outfielder player2(false, "Neymar", 23, &brasil);
    Outfielder player3(false, "Luis Suarez", 28, &uruguay);
    Outfielder player4(false, "Rakitic", 27, &croatia);
    Outfielder player5(false, "Pique", 28, &spain);
    Outfielder player6(false, "Iniesta", 31, &spain);
    Goalkeeper player7(false, "Ter Stegen", 23, &germany);

    Outfielder player8(false, "Sergio Ramos", 31, &spain);
    Outfielder player9(false, "Cristiano Ronaldo", 32, &portugal);
    Outfielder player10(false, "Vinicius", 23, &brasil);
    Outfielder player11(false, "Fede Valverde", 25, &uruguay);
    Outfielder player12(false, "Modric", 32, &croatia);
    Outfielder player13(false, "Kroos", 27, &germany);
    Goalkeeper player14(false, "Casillas", 29, &spain);

    // TEAMS
    Team barcelona("Barcelona", &spain, Team::MALE);
    Team realMadrid("Real Madrid", &spain, Team::MALE);

    barcelona.addPlayer(&player1);
    barcelona.addPlayer(&player2);
    barcelona.addPlayer(&player3);
    barcelona.addPlayer(&player4);
    barcelona.addPlayer(&player5);
    barcelona.addPlayer(&player6);
    barcelona.addPlayer(&player7);

    realMadrid.addPlayer(&player8);
    realMadrid.addPlayer(&player9);
    realMadrid.addPlayer(&player10);
    realMadrid.addPlayer(&player11);
    realMadrid.addPlayer(&player12);
    realMadrid.addPlayer(&player13);
    realMadrid.addPlayer(&player14);

    Match match(&barcelona, &realMadrid);

    match.simulateMatch();

    match.printMatch();

    player7.updateStats(&match);
    player7.printStats();

    player1.updateStats(&match);
    player1.printStats();

    return 0;
}