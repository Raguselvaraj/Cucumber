Feature: User Books multiple hotel from Adactin website

  Scenario Outline: User books different hotel with credentials
    Given User open the adactin login page & enter the "<Username>" & "<Password>"
    When User enter the "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<Checkindate>","<CheckoutDate>","<Adults>","<Childrens>" & Click the Search button
    When User navigate to select hotel page & click the Radio button
    And user click the continue button
    And user should navigate to Book a hotel page & enter "<Firstname>","<Lastname>","<Billingaddress>","<CreditcardNumber>","<CreditcardType>","<ExpiryDate>","<Selectyear>","<CVV>"
    And User Click the Book Now button
    Then User Check the order Number

    Examples: 
      | Username    | Password  | Location | Hotels      | RoomType | NumberofRooms | Checkindate | CheckoutDate | Adults  | Childrens | Firstname | Lastname   | Billingaddress | CreditcardNumber    | CreditcardType   | ExpiryDate | Selectyear | CVV |
      | CelinaGrace | devbeu123 | Sydney   | Hotel Creek | Standard | 1 - One       | 21/01/2021  | 22/01/2021   | 1 - One | 0 - None  | Jiiva     | RB Chowdry | Anna nagar     | 1222 2333 3444 4555 | American Express | April      |       2022 | 899 |
