Feature: Booking a flight

  @local_flight
  Scenario: Booking a local flight
    Given Dann wants to flight
    When she make a one-way reservation
    Then she should get the flight list