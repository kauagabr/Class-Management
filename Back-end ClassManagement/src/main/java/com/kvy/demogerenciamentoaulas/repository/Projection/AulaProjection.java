package com.kvy.demogerenciamentoaulas.repository.Projection;

import java.time.LocalTime;

public interface AulaProjection {
    Long getId();
    String getDisciplinaNome();
    String getLoginNome();
    String getTipoSalaNome();
    int getSalaNumero();
    LocalTime getHorarioInicio();
    LocalTime getHorarioTermino();
    String getDiaSemanaNome();
    String getTurmaNome();
    String getTurnoNome();
}