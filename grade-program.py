# Grade Program
# Wednesday, June 12, 2024 8:00:00 AM EAT
    # Assignment: Grade Program
    # Python

def get_grade(score):
    if score >= 90:
        return "A"
    elif score >= 87:
        return "A (minus)"
    elif score >= 84:
        return "B (plus)"
    elif score >= 80:
        return "B"
    elif score >= 77:
        return "B (minus)"
    elif score >= 74:
        return "C (plus)"
    elif score >= 70:
        return "C"
    elif score >= 67:
        return "C (minus)"
    elif score >= 64:
        return "D (plus)"
    elif score >= 62:
        return "D"
    elif score >= 60:
        return "D (minus)"
    else:
        return "F"

def main():
    while True:
        score = int(input("Enter your score (0-100): "))
        while score < 0 or score > 100:
            print("Invalid score. Please enter a score between 0 and 100.")
            score = int(input("Enter your score (0-100): "))
        
        grade = get_grade(score)
        status = "passed" if grade != "F" else "failed"
        print(f"Your score: {score}, Grade: {grade}, You have {status}.")

        cont = input("Do you want to enter another score? (yes/no): ").strip().lower()
        if cont != "yes":
            break

if __name__ == "__main__":
    main()