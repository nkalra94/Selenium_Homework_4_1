Feature: As a user I want to navigate to the form
  Fill it and submit it
Scenario Outline: Form submit
Given user navigates to the page
  When user fills the first name "<name>"
  And user fills the last name "<lastName>"
  And user fills the gender
  And user fills the date of birth "<dob>"
  And user fills the address
  And user fills the email
  And user fills the password
  And user fills company
  And user select role
  And user select job expectations
  And user select ways of development
  And user fills comment
  And user click submit button
  Then form is submitted
  Examples:
    |name |   |lastName   |  |  dob   |
    |Vika  |  |Rusinovska |  |04/05/1997|
    |John  |  |Snow       |  |03/09/1887|
    |Bill  |  |Carter     |  |06/15/1993|
