Feature: Housing Home Page Testing


  Scenario: Verify Sorting by Price Ascending Functionality
Given user is on the housing home page
When user navigates to the sort options dropdown
And user clicks on the sort dropdown
Then user should be able to see price up option
And user clicks on the price up option
Then user should be able to see the housing list

Scenario: Verify Sorting By Price Descending Functionality
Given user is on the housing home page
When user navigates to the sort options dropdown
And user clicks on the sort dropdown
Then user should be able to see price down option
And user clicks on the price down option
Then user should be able to see the housing list

Scenario: Verify default Sorting Options
Given user is on the housing home page
When user navigates to the sorting option
And user clicks on the sort functionality dropdown
Then user should get default sorting functionalities
| upcoming |
| newest  |
| price ↑ |
| price ↓ |

Scenario: Verify sorting possibilities after using search
Given user is on the housing home page
Then user type "house for rent" in the search box
And user clicks on the search icon next to the search box
Then user navigates to the sorting functionality
And user clicks on the sorting dropdown
Then user should get sorting options
| upcoming |
| newest   |
| relevant |
| price ↑  |
| price ↓  |
