@wip1
Feature: Demo Web Shop Register User Test

  Background:
    Given The user navigate to web page url
    When The user Click to register link

@aa
  Scenario:User Register with valid date

    And  The user click to gender button
    And  The user enters to first name box
    And  The user enters to last name box
    And  The user enters to email box
    And  The user enters to password box
    And The user enters to confirm password box
    And  The user click to register button
    Then Verify to text message Your registration completed

  @a
  Scenario Outline: User Register with invalid data
    And  The user click to gender button
    When And The user enters credentials "<firstName>", "<lastName>", "<email>", "<password>","<confirmpassword>" in field
    And  The user click to register button
    Then The warning message contains "<message>"
    Examples:

      | firstName | lastName | email           | password | confirmpassword | message                                             |
      |           | test     | grup4@gmail.com | 123456   | 123456          | First name is required                              |
      | grup4     |          | grup4@gmail.com | 123456   | 123456          | Last name is required                               |
      | grup4     | test     |                 | 123456   | 123456          | email is required                                   |
      | grup4     | test     | grup4gmail.com  | 123456   | 123456          | Wrong email                                         |
      | grup4     | test     | grup4@gmailcom  | 123456   | 123456          | Wrong email                                         |
      | grup4     | test     | grup4@gmail     | 123456   | 123456          | Wrong email                                         |
      | grup4     | test     | grup4@gmail     |          | 123456          | Password is required.                               |
      | grup4     | test     | grup4@gmail     | 123456   |                 | Confirm password is required.                       |
      | grup4     | test     | grup4g@mail.com | 12345    | 123456          | The password should have at least 6 characters.     |
      | grup4     | test     | grup4g@mail.com | 123456   | 12345           | The password and confirmation password do not match |



