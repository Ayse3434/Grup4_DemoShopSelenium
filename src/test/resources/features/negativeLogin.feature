Feature: Negative Login Testi

  @nesibe
  Scenario Outline: Kullanici yanlıs degerlerle uygulamaya giris yapamamali

    Given kullanıcı "url" anasayfasina gider
    Then anasayfada login linline click yapar
    And email kutusuna "<email>" yazar ve password kutusuna "<password>" yazar
    When login butonuna basar
    Then başarısız mesaj "<message>" aldığını test eder
    Examples:
      | email              | password | message                                                                                                |
      |                    |          | Login was unsuccessful. Please correct the errors and try again.No customer account found              |
      | grup4              | 123456   | Please enter a valid email address.                                                                    |
      | grup4@gmail        | 123456   | Please enter a valid email address.                                                                    |
      | grup4@gmail.com    |          | Login was unsuccessful. Please correct the errors and try again.The credentials provided are incorrect |
      | grup4@gmail.com    | 111111   | Login was unsuccessful. Please correct the errors and try again.The credentials provided are incorrect |
      | grup4444@gmail.com | 123456   | Login was unsuccessful. Please correct the errors and try again.The credentials provided are incorrect |
