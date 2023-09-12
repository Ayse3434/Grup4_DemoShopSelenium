@mlk
Feature: SortBy Function

  Background:
    Given kullanıcı web sitesine gider


  Scenario Outline: User navigate menu
    When Kullanici navigate to hover "Computers" and click "<subcategory>"
    Then Siralamanin görüntülendiğini ve Position olarak seçildiğini doğrulayın olarak seçildiğini doğrulayın
    Examples:
      | subcategory |
      | Desktops    |
      | Notebooks   |
      | Accessories |

  Scenario Outline: User navigate menu
    When Kullanici navigate to hover "Electronics" and click "<subcategory>"
    Then Siralamanin görüntülendiğini ve Position olarak seçildiğini doğrulayın olarak seçildiğini doğrulayın
    Examples:
      | subcategory   |
      | Camera, photo |
      | Cell phones   |



  Scenario Outline:Kullanici ürünleri "<subcategory>" alt kategorisinde  by Name (A-Z) göre siralar
    When Kullanici navigate to hover "Computers" and click "<subcategory>"
    And  Kullanici sıralama türünü "Name (A - Z)" ye göre seçer
    Then Ürünlerin Name (A-Z) göre siralandiğini doğrulayin
    Examples:
      | subcategory |
      | Desktops    |
      | Notebooks   |
      | Accessories |

  Scenario Outline:Kullanici ürünleri "<subcategory>" alt kategorisinde  by Name (A-Z) göre siralar
    When Kullanici navigate to hover "Electronics" and click "<subcategory>"
    And  Kullanici sıralama türünü "Name (A - Z)" ye göre seçer
    Then Ürünlerin Name (A-Z) göre siralandiğini doğrulayin
    Examples:
      | subcategory   |
      | Camera, photo |
      | Cell phones   |

  Scenario Outline:Kullanici ürünleri "<subcategory>" alt kategorisinde  by Name (Z-A) göre siralar
    When Kullanici navigate to hover "Computers" and click "<subcategory>"
    And Kullanici sıralama türünü "Name (Z - A)" ye göre seçer
    Then Ürünlerin Name (Z-A) göre siralandığını doğrulayin
    Examples:
      | subcategory |
      | Desktops    |
      | Notebooks   |
      | Accessories |

  Scenario Outline:Kullanici ürünleri "<subcategory>" alt kategorisinde  by Name (A-Z) göre siralar
    When Kullanici navigate to hover "Electronics" and click "<subcategory>"
    And  Kullanici sıralama türünü "Name (Z - A)" ye göre seçer
    Then Ürünlerin Name (Z-A) göre siralandığını doğrulayin
    Examples:
      | subcategory   |
      | Camera, photo |
      | Cell phones   |

  Scenario Outline:Kullanici ürünleri "<subcategory>" alt kategorisinde by Price (Low-High) göre siralar
    When Kullanici navigate to hover "Computers" and click "<subcategory>"
    And Kullanici sıralama türünü "Price (Low > High)" ye göre seçer
    Then Ürünlerin Price (Low-High) göre siralandiğini doğrulayin
    Examples:
      | subcategory |
      | Desktops    |
      | Notebooks   |
      | Accessories |
  Scenario Outline:Kullanici ürünleri "<subcategory>" alt kategorisinde by Price (Low-High) göre siralar
    When Kullanici navigate to hover "Electronics" and click "<subcategory>"
    And Kullanici sıralama türünü "Price (Low > High)" ye göre seçer
    Then Ürünlerin Price (Low-High) göre siralandiğini doğrulayin
    Examples:
      | subcategory   |
      | Camera, photo |
      | Cell phones   |


  Scenario Outline:Kullanıcı ürünleri "<subcategory>" alt kategorisinde by Price (High-Low) göre sıralar
    When Kullanici navigate to hover "Computers" and click "<subcategory>"
    And Kullanici sıralama türünü "Price (High > Low)" ye göre seçer
    Then Ürünlerin Price (High > Low) göre siralandiğini doğrulayin
    Examples:
      | subcategory |
      | Desktops    |
      | Notebooks   |
      | Accessories |
  Scenario Outline:Kullanıcı ürünleri "<subcategory>" alt kategorisinde by Price (High-Low) göre sıralar
    When Kullanici navigate to hover "Electronics" and click "<subcategory>"
    And Kullanici sıralama türünü "Price (High > Low)" ye göre seçer
    Then Ürünlerin Price (High > Low) göre siralandiğini doğrulayin
    Examples:
      | subcategory   |
      | Camera, photo |
      | Cell phones   |



