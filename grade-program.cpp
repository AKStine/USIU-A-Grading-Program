// Grade Program
// Wednesday, June 12, 2024 8:00:00 AM EAT
    // Assignment: Grade Program
    // C++

#include <iostream>
#include <string>

std::string getGrade(int score) {
    if (score >= 90) return "A";
    else if (score >= 87) return "A (minus)";
    else if (score >= 84) return "B (plus)";
    else if (score >= 80) return "B";
    else if (score >= 77) return "B (minus)";
    else if (score >= 74) return "C (plus)";
    else if (score >= 70) return "C";
    else if (score >= 67) return "C (minus)";
    else if (score >= 64) return "D (plus)";
    else if (score >= 62) return "D";
    else if (score >= 60) return "D (minus)";
    else return "F";
}

int main() {
    int score;
    std::string cont;

    do {
        std::cout << "Enter your score (0-100): ";
        std::cin >> score;

        while (score < 0 || score > 100) {
            std::cout << "Invalid score. Please enter a score between 0 and 100: ";
            std::cin >> score;
        }

        std::string grade = getGrade(score);
        std::string status = (grade != "F") ? "passed" : "failed";

        std::cout << "Your score: " << score << ", Grade: " << grade << ", You have " << status << ".\n";
        std::cout << "Do you want to enter another score? (yes/no): ";
        std::cin >> cont;
    } while (cont == "yes");

    return 0;
}