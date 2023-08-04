@tag
Feature: Operator

  Scenario: multiply two numbers
    Given Two input values, 3 and 4, and input operator *
    When I apply operator on the two values
    Then I expect the result 12

  Scenario: divide two numbers
    Given Two input values, 8 and 4, and input operator /
    When I apply operator on the two values
    Then I expect the result 2

  Scenario: power two numbers
    Given Two input values, 2 and 6, and input operator ^
    When I apply operator on the two values
    Then I expect the result 64

  Scenario Outline: operator two numbers
    Given Two input values, <first> and <second>, and input operator <opt>
    When I apply operator on the two values
    Then I expect the result <result>

  Examples:
    | first | second | opt | result |
    | 6 | 2 | * | 12 |
    | 6 | 2 | / | 3 |
    | 6 | 2 | ^ | 36 |