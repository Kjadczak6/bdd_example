Feature: Belly
  Moj brzuszek jest pełny na ileś godzin

  Scenario Outline: Trawienie
    Given I have 12 cukes in my belly
    When I wait "<time>" hour
    Then my belly should "<answer>"

    Examples:
    |time|answer|
    |2   |growl |
    |10  |grrrowl  |
    |1   |nope |