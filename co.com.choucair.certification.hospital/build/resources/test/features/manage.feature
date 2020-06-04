@Regression

Feature: Manage Medical Appointment
  As patient
  I make the request for a medical appointment
  To the Hospital Administration system

  @Doctor
  Scenario: Register a Doctor
    Given that carlos needs to register a new doctor
    When he registers it in the Hospital Administration application

  |name|lastName|phone|documentType|documentNumber|
  |Maribell|Munoz|2578861|Cédula de extrangería|42273100|

    Then he verifies that Doctor the message Datos guardados correctamente.

  @Patient
  Scenario: Register a patient
    Given that carlos needs to register a new patient
    When carlos registers it in the Hospital Administration application

  |name|lastName|phone|documentType|documentNumber|
  |Daniel|Yepes|2578861|Pasaportes|1152224072|

    Then he verifies that message Datos guardados correctamente.

  @Appointment
  Scenario: schedule appointment
    Given that carlos needs go to the doctor
    When he schedule an appointment

  |dateAppointment|documentNumberPatient|documentNumberDoctor|observations|
  |06/02/2020|123468|42273100|Cita Médica|

    Then he verifies that the Datos guardados correctamente.





