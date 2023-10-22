@FirstRelease
Feature: Add Prdouct functionality
  @Positive
  Scenario Outline: Ensure user successfully add product into cart
      # precondition
  Given user is on sauce_demo inventory
      #steps
  When user click add to cart product
  And user verify product in cart
      # expected
  Then user verify <status> product in cart result

  Examples:
  | status  |
  | success |

