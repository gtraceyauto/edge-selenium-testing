@SPDPNOW-206
Feature: Adding plus/minus stats to live BK boxscores

  Background:
    Given these players on court
      | TeamID | PlayerID | PreviousValue |
      | 1000   | 100001   | 0             |
      | 1000   | 100002   | 0             |
      | 1000   | 100003   | 0             |
      | 1000   | 100004   | 0             |
      | 1000   | 100005   | 0             |
      | 2000   | 200001   | 0             |
      | 2000   | 200002   | 0             |
      | 2000   | 200003   | 0             |
      | 2000   | 200004   | 0             |
      | 2000   | 200005   | 0             |

  Scenario Outline: Plus/minus stats affecting on court players when a FG is made
    When player 100001 makes a <Points> point shot with Sequence Number 1
    Then all players have exactly
      | TeamID | PlayerID | PointsOnCourtFor | PointsOnCourtAgainst | PlusMinus     |
      | 1000   | 100001   | <Points>         | 0                    | <Points>      |
      | 1000   | 100002   | <Points>         | 0                    | <Points>      |
      | 1000   | 100003   | <Points>         | 0                    | <Points>      |
      | 1000   | 100004   | <Points>         | 0                    | <Points>      |
      | 1000   | 100005   | <Points>         | 0                    | <Points>      |
      | 1000   | 100006   | 0                | 0                    | 0             |
      | 2000   | 200001   | 0                | <Points>             | <MinusPoints> |
      | 2000   | 200002   | 0                | <Points>             | <MinusPoints> |
      | 2000   | 200003   | 0                | <Points>             | <MinusPoints> |
      | 2000   | 200004   | 0                | <Points>             | <MinusPoints> |
      | 2000   | 200005   | 0                | <Points>             | <MinusPoints> |
      | 2000   | 200006   | 0                | 0                    | 0             |
    Examples:
      | Points | MinusPoints |
      | 2      | -2          |
      | 3      | -3          |
      | 1      | -1          |


  Scenario: Plus/minus stats affecting on court players that are subbed for between free throws

    Given a game is live
    When player 100001 is fouled with Sequence Number 1

    When player 100001 makes a <Points> point shot with Sequence Number 2

    When player 100005 is subbed out for player 100006 after a free throw attempt with Sequence Number 3
    When player 200005 is subbed out for player 200006 after a free throw attempt with Sequence Number 4

    When player 100001 makes a <Points> point shot with Sequence Number 5

    Then all players have exactly
      | TeamID | PlayerID | PointsOnCourtFor | PointsOnCourtAgainst | PlusMinus |
      | 1000   | 100001   | 2                | 0                    | 2         |
      | 1000   | 100002   | 2                | 0                    | 2         |
      | 1000   | 100003   | 2                | 0                    | 2         |
      | 1000   | 100004   | 2                | 0                    | 2         |
      | 1000   | 100005   | 2                | 0                    | 2         |
      | 1000   | 100006   | 0                | 0                    | -2        |
      | 2000   | 200001   | 0                | 2                    | -2        |
      | 2000   | 200002   | 0                | 2                    | -2        |
      | 2000   | 200003   | 0                | 2                    | -2        |
      | 2000   | 200004   | 0                | 2                    | -2        |
      | 2000   | 200005   | 0                | 2                    | 0         |
      | 2000   | 200006   | 0                | 0                    | 0         |


  Scenario Outline: Plus/minus stats affecting on court players when an official scoring change is made
    When player 100001 makes a <OriginalPoints> point shot with Sequence Number 1
    And player 100001 makes a <CorrectedPoints> point shot with Sequence Number 1

    Then all players have exactly
      | TeamID | PlayerID | PointsOnCourtFor  | PointsOnCourtAgainst | PlusMinus              |
      | 1000   | 100001   | <CorrectedPoints> | 0                    | <CorrectedPoints>      |
      | 1000   | 100002   | <CorrectedPoints> | 0                    | <CorrectedPoints>      |
      | 1000   | 100003   | <CorrectedPoints> | 0                    | <CorrectedPoints>      |
      | 1000   | 100004   | <CorrectedPoints> | 0                    | <CorrectedPoints>      |
      | 1000   | 100005   | <CorrectedPoints> | 0                    | <CorrectedPoints>      |
      | 1000   | 100006   | 0                 | 0                    | 0                      |
      | 2000   | 200001   | 0                 | <CorrectedPoints>    | <MinusCorrectedPoints> |
      | 2000   | 200002   | 0                 | <CorrectedPoints>    | <MinusCorrectedPoints> |
      | 2000   | 200003   | 0                 | <CorrectedPoints>    | <MinusCorrectedPoints> |
      | 2000   | 200004   | 0                 | <CorrectedPoints>    | <MinusCorrectedPoints> |
      | 2000   | 200005   | 0                 | <CorrectedPoints>    | <MinusCorrectedPoints> |
      | 2000   | 200006   | 0                 | 0                    | 0                      |

    Examples:
      | OriginalPoints | CorrectedPoints | MinusCorrectedPoints |
      | 2              | 3               | -3                   |
      | 3              | 2               | -2                   |  |