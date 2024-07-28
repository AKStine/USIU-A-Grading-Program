// Grade Program
// Wednesday, June 12, 2024 8:00:00 AM EAT
    //Assignment: Grade Program
    // C#

using System;

namespace GradeCalculator
{
    class Program
    {
        static string GetGrade(int score)
        {
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

        static void Main(string[] args)
        {
            int score;
            string cont;

            do
            {
                Console.Write("Enter your score (0-100): ");
                score = int.Parse(Console.ReadLine());

                while (score < 0 || score > 100)
                {
                    Console.Write("Invalid score. Please enter a score between 0 and 100: ");
                    score = int.Parse(Console.ReadLine());
                }

                string grade = GetGrade(score);
                string status = (grade != "F") ? "passed" : "failed";

                Console.WriteLine($"Your score: {score}, Grade: {grade}, You have {status}.");
                Console.Write("Do you want to enter another score? (yes/no): ");
                cont = Console.ReadLine().ToLower();
            } while (cont == "yes");
        }
    }
}