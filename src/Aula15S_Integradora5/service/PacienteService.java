package Aula15S_Integradora5.service;

import Aula15S_Integradora5.dao.IDao;
import Aula15S_Integradora5.model.Paciente;

public class PacienteService {

    private IDao<Paciente> pacienteIDao;

    public PacienteService(IDao<Paciente> pacienteIDao) {
        this.pacienteIDao = pacienteIDao;
    }

    public Paciente salvar(Paciente paciente) {
        pacienteIDao.salvar(paciente);
        return paciente;
    }

}
