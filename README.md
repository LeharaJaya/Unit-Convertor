# Unit-Convertor
Key Components:
Main Menu:

The program starts by displaying a menu with three conversion options: Length, Weight, and Temperature.
The user selects the type of conversion by entering a number (1 for Length, 2 for Weight, 3 for Temperature).
Length Conversion:

The user is prompted to choose between Meters to Feet or Feet to Meters.
The user inputs the value to be converted, and the program performs the calculation using conversion factors:
1 Meter = 3.28084 Feet.
The result is displayed in the corresponding unit.
Weight Conversion:

The user chooses between Kilograms to Pounds or Pounds to Kilograms.
The program converts the value using the conversion factor:
1 Kilogram = 2.20462 Pounds.
The result is shown after the calculation.
Temperature Conversion:

The user can convert between Celsius to Fahrenheit or Fahrenheit to Celsius.
Conversion formulas are used:
Celsius to Fahrenheit: F = (C * 9/5) + 32
Fahrenheit to Celsius: C = (F - 32) * 5/9
The result is then displayed.
Error Handling:

If the user enters an invalid menu option or conversion choice, the program displays an error message.
Simple checks ensure the user is only asked for valid input.
Program Flow:
The program begins with a menu selection.
Based on the selection, the program invokes one of the methods: convertLength(), convertWeight(), or convertTemperature().
Each method asks for the conversion type, takes a value from the user, performs the appropriate conversion, and displays the result.
The program gracefully handles invalid input by displaying error messages.
