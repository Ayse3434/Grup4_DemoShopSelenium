Feature: Search button functionality

  @mlkk
  Scenario Outline: Kullanıcı arama butonunda arama yapabilmeli
    When kullanıcı web sitesine gider
    Then "<arananlar>" icin arama yapar
    And sonucun "<arananlar>" icerdigini test eder


    Examples:
      | arananlar              |
      | Health Book            |
      | Fiction                |
      | Computing and Internet |
      | Elite Desktop PC       |

  @mlkk
  Scenario Outline: Kullanıcı arama butonunda arama yapabilmeli
    When kullanıcı web sitesine gider
    Then "<arananlar>" icin arama yapar
    And Kullanıcı aradıgı ürünü bulamadığında "<mesaj>" alabilmeli
    Examples:
      | arananlar | mesaj                                              |
      | kitap     | No products were found that matched your criteria. |
      | defter    | No products were found that matched your criteria. |

