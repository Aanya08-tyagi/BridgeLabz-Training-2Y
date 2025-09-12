def day_of_week(d, m, y):
    # Step 1: Adjust year for months Jan and Feb
    y0 = y - (14 - m) // 12
    
    # Step 2: Calculate x
    x = y0 + y0 // 4 - y0 // 100 + y0 // 400
    
    # Step 3: Adjusted month
    m0 = m + 12 * ((14 - m) // 12) - 2
    
    # Step 4: Day of the week (0=Sunday, 1=Monday, ..., 6=Saturday)
    d0 = (d + x + (31 * m0) // 12) % 7
    
    return d0


# Main program
if __name__ == "__main__":
    # Input date
    day = int(input("Enter Day (dd): "))
    month = int(input("Enter Month (mm): "))
    year = int(input("Enter Year (yyyy): "))

    # Get result
    result = day_of_week(day, month, year)

    # Map result to weekday name
    weekdays = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"]

    print("\nDate:", day, "/", month, "/", year)
    print("Day Number (0=Sunday ... 6=Saturday):", result)
    print("Day of Week:", weekdays[result])
