Feature: User Books multiple hotel from Adactin website

  Scenario Outline: User books different hotel with credentials
    Given User open the adactin login page & enter the "<Username>" & "<Password>"
    When User enter the "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<Checkindate>","<CheckoutDate>","<Adults>","<Childrens>" & Click the Search button
    When User navigate to select hotel page & click the Radio button
    And user should navigate to Book a hotel page & enter "<Firstname>","<Lastname>","<Billingaddress>","<CreditcardNumber>","<CreditcardType>","<ExpiryDate>","<Selectyear>","<CVV>"
    And User Click the Book Now button
    Then User Check the order Number

    Examples: 
      | Username    | Password  | Location | Hotels      | RoomType | NumberofRooms | Checkindate | CheckoutDate | Adults  | Childrens | Firstname | Lastname   | Billingaddress | CreditcardNumber    | CreditcardType   | ExpiryDate | Selectyear | CVV |
      | CelinaGrace | devbeu123 | Sydney   | Hotel Creek | Standard | 1 - One       | 21/01/2021  | 22/01/2021   | 1 - One | 0 - None  | Jiiva     | RB Chowdry | Anna nagar     | 1222 2333 3444 4555 | American Express | April      |       2022 | 899 |
      | CelinaGrace | devbeu123 | Sydney    | Hotel Sunshine | Standard | 1 - One       | 22/01/2021  | 23/01/2021   | 1 - One | 0 - None  | Vijay       | Chadra     | Shenoy nagar   | 1221 2332 3443 4554 | American Express | April      |       2022 | 999 |
      | CelinaGrace | devbeu123 | Sydney    | Hotel Hervey   | Standard | 1 - One       | 23/01/2021  | 24/01/2021   | 1 - One | 0 - None  | Surya       | Shiva      | tambaram       | 1121 2232 3343 4454 | American Express | April      |       2022 | 559 |
      | CelinaGrace | devbeu123 | Sydney    | Hotel Cornice  | Standard | 1 - One       | 24/01/2021  | 25/01/2021   | 1 - One | 0 - None  | Madhavan    | Kumar      | east tambaram  | 1111 2222 3333 4444 | American Express | April      |       2022 | 555 |
      | CelinaGrace | devbeu123 | Melbourne | Hotel Creek    | Standard | 1 - One       | 25/01/2021  | 26/01/2021   | 1 - One | 0 - None  | Shiva       | ram        | west tambaram  | 1111 2222 3333 4444 | American Express | April      |       2022 | 555 |
      | CelinaGrace | devbeu123 | Melbourne | Hotel Sunshine | Standard | 1 - One       | 26/01/2021  | 27/01/2021   | 1 - One | 0 - None  | MirchiShiva | muthu      | vadapalani     | 1111 2222 3333 4444 | American Express | April      |       2022 | 555 |
      | CelinaGrace | devbeu123 | Melbourne | Hotel Hervey   | Standard | 1 - One       | 27/01/2021  | 28/01/2021   | 1 - One | 0 - None  | Dhanush     | manoj      | cmbt           | 1111 2222 3333 4444 | American Express | April      |       2022 | 555 |
      | CelinaGrace | devbeu123 | Melbourne | Hotel Cornice  | Standard | 1 - One       | 28/01/2021  | 29/01/2021   | 1 - One | 0 - None  | Vikram      | arjun      | porur          | 1111 2222 3333 4444 | American Express | April      |       2022 | 555 |
      | CelinaGrace | devbeu123 | Sydney    | Hotel Cornice  | Standard | 1 - One       | 29/01/2021  | 30/01/2021   | 1 - One | 0 - None  | Kamal       | arun       | Ramapuram      | 1111 2222 3333 4444 | American Express | April      |       2022 | 555 |
      | CelinaGrace | devbeu123 | Sydney    | Hotel Cornice  | Standard | 1 - One       | 30/01/2021  | 31/01/2021   | 1 - One | 0 - None  | Rajini      | kamala     | Guindy         | 1111 2222 3333 4444 | American Express | April      |       2022 | 555 |
