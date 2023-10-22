@FirstRelease
Feature: Login functionality

#  @Negative
#  Scenario Outline: User failed login
#    # precondition
#    Given user is on saucedemo homepage
#    #steps
#    When user input <username> as username
#    And user input <password> as password
#    And user click enter
#    # expected
#    Then user verify <status> login result
#
#    Examples:
#      | username      | password     | status  |
#      | locked_out_user | secret_sauce | success |

  @Positive
  Scenario Outline: Ensure user successfully login
    # precondition
    Given user is on sauce_demo homepage
    #steps
    When user input <username> as username
    And user input <password> as password
    And user click enter
    # expected
    Then user verify <status> login result

    Examples:
      | username      | password     | status  |
      | standard_user | secret_sauce | success |

