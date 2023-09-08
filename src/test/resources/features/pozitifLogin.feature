Feature: Pozitif Login Testi


  Scenario: Kullanici dogru degerlerle uygulamaya giris yapabilmeli

    Given Kullanıcı "url" anasayfasina gider
    Then Anasayfada login linline click yapar
    And email kutusuna "grup4@gmail.com" yazar
    And password kutusuna "123456" yazar
    When login butoonuna basar
    Then başarılı olarak giriş yapabildiğini test eder

