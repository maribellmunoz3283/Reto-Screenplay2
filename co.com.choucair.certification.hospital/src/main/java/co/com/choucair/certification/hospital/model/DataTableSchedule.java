package co.com.choucair.certification.hospital.model;

public class DataTableSchedule {

    private String dateAppointment;
    private String documentNumberPatient;
    private String documentNumberDoctor;
    private String observations;

    public String getDateAppointment() {
        return dateAppointment;
    }

    public void setDateAppointment(String dateAppointment) {
        this.dateAppointment = dateAppointment;
    }

    public String getDocumentNumberPatient() {
        return documentNumberPatient;
    }

    public void setDocumentNumberPatient(String documentNumberPatient) {this.documentNumberPatient = documentNumberPatient;
    }

    public String getDocumentNumberDoctor() {
        return documentNumberDoctor;
    }

    public void setDocumentNumberDoctor(String documentNumberDoctor) { this.documentNumberDoctor = documentNumberDoctor;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }
}
