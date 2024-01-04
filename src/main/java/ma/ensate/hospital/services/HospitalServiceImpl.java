package ma.ensate.hospital.services;

import jakarta.transaction.Transactional;
import ma.ensate.hospital.entities.Consultation;
import ma.ensate.hospital.entities.Medecin;
import ma.ensate.hospital.entities.Patient;
import ma.ensate.hospital.entities.RendezVous;
import ma.ensate.hospital.repositories.ConsultationRepository;
import ma.ensate.hospital.repositories.MedecinRepository;
import ma.ensate.hospital.repositories.PatientRepository;
import ma.ensate.hospital.repositories.RendezVousRepository;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {

    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;

    public HospitalServiceImpl(PatientRepository patientRepository, MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {

        return  medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {

        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return  consultationRepository.save(consultation);
    }
}
