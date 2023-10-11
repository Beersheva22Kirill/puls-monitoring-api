package monitoring.dto;

public record PulseProbe(long patientId, int value, long timeStamp, int seqNumber) {

}
