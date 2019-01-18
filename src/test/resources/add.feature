Feature: Adding
  Jestem idiotą i boję się dodawać w głowie

  Scenario Outline: Dodawanie
    Given I have two numbers to add
    And thinking about answer
    When I add "<firstNumber>" to "<secondNumber>"
    Then Answer should be "<answer>"

    Examples:
      |firstNumber|secondNumber|answer|
      |2          |3           |5     |
      |5          |8           |13    |
      |6          |-4          |2     |